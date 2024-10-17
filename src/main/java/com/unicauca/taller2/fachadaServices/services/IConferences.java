package com.unicauca.taller2.fachadaServices.services;



import java.util.List;

import com.unicauca.taller2.capaAccesoADatos.models.ConferenceEntity;
import com.unicauca.taller2.fachadaServices.DTO.ConferenceDTO;

public  interface IConferences {
    public List<ConferenceDTO> findAll();
    public ConferenceDTO findByID(int id);
    public ConferenceDTO save(ConferenceDTO conference);
    public ConferenceDTO update(int id, ConferenceDTO conference);
    public boolean delet(int id);
    public ConferenceDTO getConfrenceOfArticle(int id);

}