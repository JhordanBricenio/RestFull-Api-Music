package com.api.MusicApi.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String lanzado;
    private float precio;
    private String genero;



}
