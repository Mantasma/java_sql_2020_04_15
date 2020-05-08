package com.metinisporeikis.department.app.controller;

import com.metinisporeikis.department.app.dto.DepartmentAddress;
import com.metinisporeikis.department.app.service.DepartmentAddressesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departmentsusers/addresses")
public class DepartmentAddressControler {
    @Autowired
    private DepartmentAddressesService departmentAddressesService;

    @GetMapping
    public List<DepartmentAddress> getDepartmentAddress(){

        return departmentAddressesService.getDepartmentAddress();
    }
    @PostMapping("/save")
    public DepartmentAddress createAddressess(@RequestBody DepartmentAddress departmentAddress){
        return departmentAddressesService.createAddressess(departmentAddress);
    }


}
