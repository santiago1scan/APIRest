package com.unicauca.taller2.fachadaServices.DTO;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@AllArgsConstructor

public class ConferenceDTO  {
    private int id;
    private String name;
    private int cantArticles;
    public ConferenceDTO(){
        
    }
}
