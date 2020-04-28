package com.kcs.students.app.service;

import com.kcs.students.app.dto.Student;
import com.kcs.students.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
// update sudenta
    public Student updateStudent(Student student) {
        PreparedStatement preparedStatement = studentRepository.getPreparedStatment("UPDATE students set name=?, surname=?, email=?, phone=? where id=?");
        if (preparedStatement == null) {
            return null;
        }
        try {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setString(4, student.getPhone());
            preparedStatement.setInt(5,student.getId());
            preparedStatement.execute();

            return student;

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
//pabaiga


// uzduotis istrinti
    public void deleteStudent(int id){
        PreparedStatement statement = studentRepository.getPreparedStatment("delete from students where id =?");
        if (statement == null){
            return;
        }
        try{
            statement.setInt(1,id);
            statement.execute();

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    //pabaiga

// 2 uzduotis palyginti nauja ivesta studenta su kitais
    public Student createStudent(Student student){
        PreparedStatement preparedStatement = studentRepository.getPreparedStatment("INSERT into students(name,surname,phone,email)values(?,?,?,?)");
        if (preparedStatement == null){
            return null;
        }
        try{
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setString(3, student.getPhone());
            preparedStatement.setString(4, student.getEmail());

            preparedStatement.execute();
            return getStudent().stream()
                    .filter(s -> s.equals(student))
                    .findFirst()
                    .orElse(null);


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;

    }
    // baigiasi uzduotis

// 9 pirma uzduotis paskaita, susikureme kad pagal studento id parodytu local butent ta studenta
    public Student getStudent(int id) {
        PreparedStatement preparedStatement = studentRepository.getPreparedStatment("SELECT * From students where id =?");
        if(preparedStatement == null){ //pasitikrinti ar ne nulis
            return null;
        }
        try {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                return new Student(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("email"),
                        resultSet.getString("phone"));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
// baigiasi uzduotis

    public List<Student> getStudent() {
        List<Student> students = new ArrayList<>();

        PreparedStatement preparedStatement = studentRepository.getPreparedStatment("SELECT * from students");
        if (preparedStatement != null) {
            try {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    students.add(new Student(resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("surname"),
                            resultSet.getString("email"),
                            resultSet.getString("phone")));


                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        return students;
    }
}
