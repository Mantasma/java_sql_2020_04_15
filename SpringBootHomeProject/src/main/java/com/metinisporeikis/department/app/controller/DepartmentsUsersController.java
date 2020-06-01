package com.metinisporeikis.department.app.controller;

import com.metinisporeikis.department.app.dto.DepartmentUsers;
import com.metinisporeikis.department.app.service.DepartmentUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://192.168.99.100:8008")
@RequestMapping("/departmentsusers")
public class DepartmentsUsersController {

    @Autowired
    private DepartmentUsersService departmentUsersService;


    @GetMapping
    public List<DepartmentUsers> getDepartmentUsers() {
        return departmentUsersService.getDepartmentUsers();

    }

    @PostMapping("/save")
    public DepartmentUsers createDepartment(@RequestBody DepartmentUsers department) {
        return departmentUsersService.createDepartment(department);
    }
}
