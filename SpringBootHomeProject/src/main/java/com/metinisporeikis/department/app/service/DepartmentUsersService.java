package com.metinisporeikis.department.app.service;

import com.metinisporeikis.department.app.dto.DepartmentUsers;
import com.metinisporeikis.department.app.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentUsersService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<DepartmentUsers> getDepartmentUsers() {

        List<DepartmentUsers> department = new ArrayList<>();

        PreparedStatement preparedStatement = departmentRepository.getPreparedStatment("SELECT * from departmentsusers");
        if (preparedStatement != null) {
            try {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    department.add(new DepartmentUsers(resultSet.getInt("id"),
                            resultSet.getString("department_name"),
                            resultSet.getString("name"),
                            resultSet.getString("surname"),
                            resultSet.getString("rank"),
                            resultSet.getString("email"),
                            resultSet.getInt("phone")));

                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }


        return department;


    }

    public DepartmentUsers createDepartment(DepartmentUsers department) {
        PreparedStatement preparedStatement = departmentRepository.getPreparedStatment("insert into departmentsusers(department_name, name, surname, rank, email, phone)values(?,?,?,?,?,?)");
        if (preparedStatement == null) {
            return null;
        }
        try {
            preparedStatement.setString(1, department.getDepartment_name());
            preparedStatement.setString(2, department.getName());
            preparedStatement.setString(3, department.getSurname());
            preparedStatement.setString(4, department.getRank());
            preparedStatement.setString(5, department.getEmail());
            preparedStatement.setInt(6, department.getPhone());


            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
