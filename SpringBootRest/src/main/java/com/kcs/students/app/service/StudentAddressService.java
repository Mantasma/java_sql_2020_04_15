package com.kcs.students.app.service;

import com.kcs.students.app.dto.StudentAddress;
import com.kcs.students.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentAddressService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentAddress> getStudentAddresses() {
        String sql = "SELECT * FROM student_address";
        return getStudentAddresses(sql, null);
    }

    public List<StudentAddress> getStudentAddreses(int studentId) {
        String sql = "SELECT * From student_address where student_id =?";
        return getStudentAddresses(sql, studentId);
    }

    private List<StudentAddress> getStudentAddresses(String sql, Integer studentId){
        List<StudentAddress> studentAddresses = new ArrayList<>();

        PreparedStatement preparedStatement = studentRepository.getPreparedStatment(sql);
        if(preparedStatement != null){
            try {
                if(studentId != null) {
                    preparedStatement.setInt(1, studentId);
                }
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    studentAddresses.add(new StudentAddress(resultSet.getInt("id"),
                            resultSet.getInt("student_id"),
                            resultSet.getString("country"),
                            resultSet.getString("city"),
                            resultSet.getString("street"),
                            resultSet.getString("post_code")));

                }
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return studentAddresses;
    }

    public List<StudentAddress> createStudentAddress(StudentAddress studentAddress) {
        PreparedStatement preparedStatement = studentRepository.getPreparedStatment("INSERT into student_address(student_id, country, city, street, post_code)values(?,?,?,?,?)");
        if(preparedStatement != null){
            try{preparedStatement.setInt(1,studentAddress.getStudentId());
                preparedStatement.setString(2, studentAddress.getCountry());
                preparedStatement.setString(3, studentAddress.getCity());
                preparedStatement.setString(4,studentAddress.getStreet());
                preparedStatement.setString(5,studentAddress.getPostCode());

                preparedStatement.execute();

        }catch(SQLException e){
                System.out.println(e.getMessage());
            }

            }
        return getStudentAddresses("SELECT * from student_address where student_id = ?",studentAddress.getStudentId());
    }

    public void deleteStudentAddress(int studentId, int addressId) {
        PreparedStatement statement = studentRepository.getPreparedStatment("delete from student_address where student_id =? and id =?");
        if (statement == null){
            return;
        }
        try{
            statement.setInt(1,studentId);
            statement.setInt(2,addressId);
            statement.execute();

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

