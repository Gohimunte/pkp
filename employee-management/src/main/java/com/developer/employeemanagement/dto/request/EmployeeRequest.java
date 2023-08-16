package com.developer.employeemanagement.dto.request;

import java.io.Serializable;

public class EmployeeRequest implements Serializable {
    private String name;
    private String name_depan;
    private string name_belakang;
    private String alamat;

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
