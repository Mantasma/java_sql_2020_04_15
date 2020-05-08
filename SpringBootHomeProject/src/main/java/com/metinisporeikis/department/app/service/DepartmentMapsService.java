package com.metinisporeikis.department.app.service;

import com.metinisporeikis.department.app.dto.DepartmentAddress;
import com.metinisporeikis.department.app.dto.DepartmentsMaps;
import com.metinisporeikis.department.app.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentMapsService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<DepartmentsMaps> getDepartmentMaps() {
        List<DepartmentsMaps> Maps = new ArrayList<>();
        PreparedStatement preparedStatement = departmentRepository.getPreparedStatment("SELECT * from maps");

        if (preparedStatement != null) {
            try {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    Maps.add(new DepartmentsMaps(resultSet.getInt("id"),
                            resultSet.getInt("departmentsusers_id"),
                            resultSet.getString("map_scale"),
                            resultSet.getString("map_title"),
                            resultSet.getString("map_count")));

                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        return Maps;
    }

    public DepartmentsMaps createMaps(DepartmentsMaps departmentsMaps){
        PreparedStatement preparedStatement = departmentRepository.getPreparedStatment("insert into maps(departmentsusers_id, map_scale, map_title, map_count)values(?,?,?,?)");
        if (preparedStatement == null) {
            return null;
        }
        try {
            preparedStatement.setInt(1, departmentsMaps.getDepartmentsusers_id());
            preparedStatement.setString(2, departmentsMaps.getMap_scale());
            preparedStatement.setString(3, departmentsMaps.getMap_title());
            preparedStatement.setString(4, departmentsMaps.getMap_count());

            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}




