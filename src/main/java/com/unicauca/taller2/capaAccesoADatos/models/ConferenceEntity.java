package com.unicauca.taller2.capaAccesoADatos.models;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class ConferenceEntity {
    private int id;
    private String name;
    private  int numArticles;
    private List<ArticlesEntity> articleList;
    public ConferenceEntity(){
        
    }
    
}
