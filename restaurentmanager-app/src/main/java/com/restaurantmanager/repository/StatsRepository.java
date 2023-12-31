/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.restaurantmanager.repository;

import java.util.List;
import java.util.Map;

/**
*
* @author Trong Nhan
*/
public interface StatsRepository {
    List<Object[]> countProductByCate();
    List<Object[]> statsRevenue(Map<String, String> params);
}
