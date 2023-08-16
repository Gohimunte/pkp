package com.developer.employeemanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "r_user")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "r_user_id")
    private Long id;

    @Column(name = "username")
    private String name;

    @Column(name = "nama_depan")
    private String name_depan;

    @Column(name = "nama_belakang")
    private String name_belakang;

    @Column(name = "alamat")
    private String alamat;

    public EmployeeEntity() {
    }

    public EmployeeEntity(Long id, String name, String name_depan, String name_belakang, String alamat) {
        this.id = id;
        this.name = name;
        this.name_depan = name_depan;
        this.name_belakang = name_belakang;
        this.alamat = alamat;
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

    public void setAddress(String alamat) {
        this.alamat = alamat;
    }
}
