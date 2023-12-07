package com.construempleo.sena.entity;

import jakarta.persistence.*;

@Entity
@Table(name="eps")

public class eps {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_eps")
    private int id_eps;
    @Column(name="nom_eps")
    private String nom_eps;

    public int getId_eps() {
        return id_eps;
    }

    public void setId_eps(int id_eps) {
        this.id_eps = id_eps;
    }

    public String getNom_eps() {
        return nom_eps;
    }

    public void setNom_eps(String nom_eps) {
        this.nom_eps = nom_eps;
    }
}
