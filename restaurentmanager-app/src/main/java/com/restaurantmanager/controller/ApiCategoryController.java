/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurantmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurantmanager.pojo.Category;
import com.restaurantmanager.service.CategoryService;

/**
*
* @author Trong Nhan
*/
@RestController
@RequestMapping("/api")
public class ApiCategoryController {
    @Autowired
    public CategoryService cateService;
    
    @GetMapping("/categories/")
    @CrossOrigin
    public ResponseEntity<List<Category>> list() {
        return new ResponseEntity<>(this.cateService.getCategories(), HttpStatus.OK);
    }
}
