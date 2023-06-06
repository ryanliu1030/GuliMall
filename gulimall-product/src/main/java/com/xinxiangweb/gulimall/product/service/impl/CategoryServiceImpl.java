package com.xinxiangweb.gulimall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinxiangweb.common.utils.PageUtils;
import com.xinxiangweb.common.utils.Query;

import com.xinxiangweb.gulimall.product.dao.CategoryDao;
import com.xinxiangweb.gulimall.product.entity.CategoryEntity;
import com.xinxiangweb.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }
    @Override
    public List<CategoryEntity> listWithTree(){
        //1. Find all the categories
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //2. Assemble the parent-child relationship in the tree structure
        //2.1 Find the root category
        List<CategoryEntity> lv1Menu = categoryEntities.stream().filter(categoryEntity ->
             categoryEntity.getParentCid() == 0
            ).map((menu) -> {
                menu.setChildren(getChildren(menu, categoryEntities));
                return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort()==null ? 0:menu1.getSort()) - (menu2.getSort()==null ? 0:menu2.getSort());
        }).collect(Collectors.toList());
        return lv1Menu;
    }

    @Override
    public void removeMenuByIds(List<Long> list) {
        //TODO make sure the catids are not used.
        baseMapper.deleteBatchIds(list);
    }

    //Recursively find the children of the current category
    private List<CategoryEntity> getChildren(CategoryEntity parent, List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == parent.getCatId();
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());

        }).collect(Collectors.toList());

        return children;
    }
}