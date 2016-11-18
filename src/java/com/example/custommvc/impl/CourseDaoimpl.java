/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.custommvc.impl;

import com.example.custommvc.dao.CourseDao;
import com.example.custommvc.entity.Course;
import com.example.custommvc.util.DbConnection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HOME
 */
public class CourseDaoimpl implements CourseDao {
        DbConnection db=new DbConnection();
    @Override
    public List<Course> getAll() throws ClassNotFoundException, SQLException {
            List courselst=new ArrayList();
            
            db.open();
            String sql="select * from courses";
            db.init(sql);
            ResultSet rs=db.executeQuery();
            
            while(rs.next())
            {
                Course course=new Course(); // we have to make a separate object for the course so the object must be placed inside the while loop.if the course is instatiated outside the while loop then same object is rewritten
                course.setId(rs.getInt("course_id"));
                course.setName(rs.getString("course_name"));
                course.setDescription(rs.getString("course_description"));
                course.setFees(rs.getDouble("course_fees"));
                course.setStatus(rs.getBoolean("course_status"));
                courselst.add(course);
            
            }
            
              return courselst;
    }

    @Override
    public int add(Course c) throws ClassNotFoundException, SQLException {
            db.open();
            String sql="Insert into courses(course_id,course_name,course_description,course_fees,course_status) "+
                    "values(?,?,?,?,?)";
            PreparedStatement stmt=db.init(sql);
            stmt.setInt(1, c.getId());
            stmt.setString(2, c.getName());
             stmt.setString(3, c.getDescription());
             stmt.setDouble(4, c.getFees());
             stmt.setBoolean(5, c.getStatus());
            
            int result=stmt.executeUpdate();
            db.close();
            return result;

    }
    
}
