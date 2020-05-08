package com.metinisporeikis.department.app.dto;

public class DepartmentsMaps {
    private int id;
    private int departmentsusers_id;
    private String map_scale;
    private String map_title;
    private String map_count;

    DepartmentsMaps(){}

    public DepartmentsMaps(int id, int departmentsusers_id, String map_scale, String map_title, String map_count) {
        this.id = id;
        this.departmentsusers_id = departmentsusers_id;
        this.map_scale = map_scale;
        this.map_title = map_title;
        this.map_count = map_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartmentsusers_id() {
        return departmentsusers_id;
    }

    public void setDepartmentsusers_id(int departmentsusers_id) {
        this.departmentsusers_id = departmentsusers_id;
    }

    public String getMap_scale() {
        return map_scale;
    }

    public void setMap_scale(String map_scale) {
        this.map_scale = map_scale;
    }

    public String getMap_title() {
        return map_title;
    }

    public void setMap_title(String map_title) {
        this.map_title = map_title;
    }

    public String getMap_count() {
        return map_count;
    }

    public void setMap_count(String map_count) {
        this.map_count = map_count;
    }
}
