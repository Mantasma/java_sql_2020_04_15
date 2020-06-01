package com.metinisporeikis.department.app.controller;

import com.metinisporeikis.department.app.dto.DepartmentsMaps;
import com.metinisporeikis.department.app.service.DepartmentMapsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://192.168.99.100:8008")
@RequestMapping("/departmentsusers/maps")
public class DepartmentsMapsController {
    @Autowired
    DepartmentMapsService departmentMapsService;

    @GetMapping
    public List<DepartmentsMaps> getDepartmentMaps(){
        return departmentMapsService.getDepartmentMaps();
    }
    @PostMapping("/save")
    public DepartmentsMaps createMaps(@RequestBody DepartmentsMaps departmentsMaps){
        return departmentMapsService.createMaps(departmentsMaps);
    }

}
