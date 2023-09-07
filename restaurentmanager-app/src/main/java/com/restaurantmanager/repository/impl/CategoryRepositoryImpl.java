/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurantmanager.repository.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.restaurantmanager.pojo.Category;
import com.restaurantmanager.repository.CategoryRepository;

/**
*
* @author Trong Nhan
*/
@Repository
@Transactional
public class CategoryRepositoryImpl implements  CategoryRepository{
    @Autowired
    private LocalSessionFactoryBean factory;

    @Override
    public List<Category> getCategories() {
        Session s = this.factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM Category");
        
        return q.getResultList();
    }

    @Override
    public Category getCateById(int id) {
        Session s = this.factory.getObject().getCurrentSession();
        return s.get(Category.class, id);
    }
}
