/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.Kuis_1070.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "ipk")
public class IPK implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 255, nullable = false, unique = true)
    private String nilai;
    @Column(length = 255, nullable = true)
    private String tahun;
    @Column(length = 255, nullable = true)
    private String jurusan;
    @ManyToOne
    private Identitas identitas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //
    public String getNilai() {
        return nilai;
    }
    
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
    //
    public String getTahun() {
        return tahun;
    }
    
    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
    //
    public String getJurusan() {
        return jurusan;
    }
    
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
