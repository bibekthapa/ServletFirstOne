package com.example.custommvc.dao;


import com.example.custommvc.entity.Course;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
public interface CourseDao {
    
    public List<Course> getAll() throws ClassNotFoundException,SQLException ;
    
}
