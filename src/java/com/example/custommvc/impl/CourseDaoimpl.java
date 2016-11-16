/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.custommvc.impl;

import com.example.custommvc.dao.CourseDao;
import com.example.custommvc.entity.Course;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HOME
 */
public class CourseDaoimpl implements CourseDao {

    @Override
    public List<Course> getAll() throws IOException, SQLException {
            List courselst=new ArrayList();
            courselst.add(new Course(1,"Advanced Java","Teaches the Advanced Java",20000.0,true));
             courselst.add(new Course(2," Java","Teaches the  Java",10000.0,true));
              courselst.add(new Course(3,"Python","Teaches the Python",20000.0,false));
              return courselst;
    }
    
}
