package com.unicauca.taller2.fachadaServices.services;


import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicauca.taller2.capaAccesoADatos.models.ConferenceEntity;
import com.unicauca.taller2.capaAccesoADatos.repositories.ConferenceRepository;
import com.unicauca.taller2.fachadaServices.DTO.ConferenceDTO;

import org.modelmapper.TypeToken;



@Service
public class ConferenceServices implements IConferences{
     @Autowired
     private ConferenceRepository conferenceRepository;

     @Autowired
     private ModelMapper ModelMapper;
   
     public ConferenceServices(ConferenceRepository ConferenceRepository, ModelMapper model ){
        this.ModelMapper = model;
        this.conferenceRepository = ConferenceRepository;
     }

     @Override
     public List<ConferenceDTO> findAll(){
        List<ConferenceEntity> conferencesEntity = this.conferenceRepository.findAll();
        List<ConferenceDTO> conferencesDTO = this.ModelMapper.map(conferencesEntity, new TypeToken<List<ConferenceDTO>>() {
		}.getType());
        return conferencesDTO;
     }
     @Override
     public ConferenceDTO findByID(int id){
         ConferenceEntity conferenceEntity = this.conferenceRepository.findByind(id);
         ConferenceDTO conferenceDTO = this.ModelMapper.map(conferenceEntity, ConferenceDTO.class);
         return conferenceDTO;
     }
     @Override
     public ConferenceDTO save(ConferenceDTO conference){
         ConferenceEntity conferenceEntity = this.ModelMapper.map(conference, ConferenceEntity.class);
         ConferenceEntity objConferenceEntity = this.conferenceRepository.save(conferenceEntity);
         ConferenceDTO conferenceDTO = this.ModelMapper.map(objConferenceEntity, ConferenceDTO.class);
         return conferenceDTO;
     }   
     @Override
     public ConferenceDTO update(int id, ConferenceDTO conference){
         ConferenceEntity conferenceEntity = this.ModelMapper.map(conference, ConferenceEntity.class);
         ConferenceEntity clienteEntityUpdate = this.conferenceRepository.update(id, conferenceEntity);
         ConferenceDTO  articuleDTO = this.ModelMapper.map(clienteEntityUpdate, ConferenceDTO.class);
         return articuleDTO;
     }
     @Override
     public boolean delet(int id){
      return this.conferenceRepository.delete(id);
     }

    @Override
    public ConferenceDTO getConfrenceOfArticle(int id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getConfrenceOfArticle'");
    }
   

     
}
