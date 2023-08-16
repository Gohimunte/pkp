package com.developer.employeemanagement.dto.response;

import java.io.Serializable;

public class EmployeeResponse implements Serializable {
    private Long id;
    private String name_depan;
    private string name_belakang;
    private String alamat

    public EmployeeResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_depan() {
        return name_depan;
    }

    public void setName_depan(String name_depan) {
        this.name_depan = name_depan;
    }

    public String getName_belakang() {
        return name_belakang;
    }

    public void setName_belakang(String name_belakang) {
        this.name_belakang = name_belakang;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        alamat = alamat;
    }
}
