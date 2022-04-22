package com.datalabstgm.praktikumantenna.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_pretest")
public class EntityPraktikum {
    @Id
    @Column(name = "nim")
    private Long nim;
    @Column(name = "nama")
    private String nama;
    @Column(name = "n_pretest")
    private int nilai;

    public Long getNim() {
        return nim;
    }

    public void setNim(Long nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
}
