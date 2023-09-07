/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurantmanager.fomatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.restaurantmanager.pojo.Category;

/**
*
* @author Trong Nhan
*/
public class CategoryFormatter implements Formatter<Category> {

    @Override
    public String print(Category cate, Locale locale) {
        return String.valueOf(cate.getId());
    }

    @Override
    public Category parse(String cateId, Locale locale) throws ParseException {
        int id = Integer.parseInt(cateId);
        return new Category(id);
    }
    
}
