package org.gfg;

import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student>{

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
       Student student = new Student();
       student.setId(rs.getInt("id"));
        student.setEmail(rs.getString("email"));
       student.setName(rs.getString("robin"));

       return student;
    }
}
