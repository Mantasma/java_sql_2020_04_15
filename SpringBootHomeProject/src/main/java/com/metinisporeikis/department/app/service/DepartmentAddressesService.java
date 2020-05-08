package com.metinisporeikis.department.app.service;

import com.metinisporeikis.department.app.dto.DepartmentAddress;

import com.metinisporeikis.department.app.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentAddressesService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<DepartmentAddress> getDepartmentAddress() {
        List<DepartmentAddress> Address = new ArrayList<>();
        PreparedStatement preparedStatement = departmentRepository.getPreparedStatment("SELECT * from department_address");
        if (preparedStatement != null) {
            try {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    Address.add(new DepartmentAddress(resultSet.getInt("id"),
                            resultSet.getInt("departmentsusers_id"),
                            resultSet.getString("country"),
                            resultSet.getString("city"),
                            resultSet.getString("street")));

                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }

        return Address;


    }

    public DepartmentAddress createAddressess(DepartmentAddress departmentAddress){
        PreparedStatement preparedStatement = departmentRepository.getPreparedStatment("insert into department_address(departmentsusers_id, country, city, street)values(?,?,?,?)");
        if (preparedStatement == null) {
            return null;
        }
        try {
            preparedStatement.setInt(1, departmentAddress.getDepartmentsusers_id());
            preparedStatement.setString(2, departmentAddress.getCountry());
            preparedStatement.setString(3, departmentAddress.getCity());
            preparedStatement.setString(4, departmentAddress.getStreet());

            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}



