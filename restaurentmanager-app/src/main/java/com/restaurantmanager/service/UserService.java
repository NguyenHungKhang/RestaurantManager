/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.restaurantmanager.service;

import java.util.Map;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.multipart.MultipartFile;

import com.restaurantmanager.pojo.User;

/**
*
* @author Trong Nhan
*/
public interface UserService extends UserDetailsService  {
    User getUserByUn(String username);
    boolean authUser(String username, String password);
    User addUser(Map<String, String> params, MultipartFile avatar);
}
