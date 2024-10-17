package com.unicauca.taller2.capaAccesoADatos.repositories;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.unicauca.taller2.capaAccesoADatos.models.ArticlesEntity;
import com.unicauca.taller2.capaAccesoADatos.models.ConferenceEntity;


@Service
public class ConferenceRepository {
    private ArrayList<ConferenceEntity> listConferences;
    
    public ConferenceRepository(){
        this.listConferences = new  ArrayList<ConferenceEntity>();
        createConferences();
    }

    public List<ConferenceEntity> findAll(){
        System.out.println("Listas de Conferencias: ");
        return this.listConferences;
    }
    public ConferenceEntity findByind(int id){
        System.out.println("Busqueda por id: ");
        ConferenceEntity obj = null;
        for(ConferenceEntity conference: listConferences){
            if(conference.getId() == id){
                obj = conference;
                break;
            }
        }
        return obj;
    }
    public ConferenceEntity update(int  id, ConferenceEntity conference){
        System.out.println("Invocando a actualiazr articulo: ");
        ConferenceEntity obj = null;
        for(int i = 0; i  < this.listConferences.size(); i++){
            obj = conference;
            listConferences.set(i, obj);
            break;
        }
        return obj;
    }

    public boolean delete(int id){
        System.out.println("Invocando a eliminar un articulo");
        for(int i = 0; i<this.listConferences.size(); i++){
            this.listConferences.remove(id);
            return true;
        }
        return false;
    }
    public ConferenceEntity save(ConferenceEntity conference){
        System.out.println("invocando almacenar articulo");
        ConferenceEntity objConferenceEntity = null;
        if(this.listConferences.add(conference)){
            objConferenceEntity= conference ;
        }
        return objConferenceEntity;
    }
    public List<ConferenceEntity> identifyArticlesConference(int id){
        ArrayList conferenceReturn = new ArrayList<ConferenceEntity>();
        for(ConferenceEntity conference: listConferences ){
            if(conference.getId() == id){
                conferenceReturn.add(conferenceReturn);
            }
        }
        if(conferenceReturn != null){
            return conferenceReturn;
        }
        return null;
    }

    private void createConferences(){

        ArticlesEntity article1  = new ArticlesEntity(1);
        ArticlesEntity article2  = new ArticlesEntity(2);
        ArticlesEntity article3  = new ArticlesEntity(3);
        ArticlesEntity article4  = new ArticlesEntity(4);
        ArticlesEntity article5  = new ArticlesEntity(5);
        ArticlesEntity article6  = new ArticlesEntity(6);

        List<ArticlesEntity> listArticles1 = new ArrayList<ArticlesEntity>();
        List<ArticlesEntity> listArticles2 = new ArrayList<ArticlesEntity>();
        List<ArticlesEntity> listArtilces3 = new ArrayList<ArticlesEntity>();
        List<ArticlesEntity> listArticles4 = new ArrayList<ArticlesEntity>();
        List<ArticlesEntity> listArticles5 = new ArrayList<ArticlesEntity>();

        listArticles1.add(article1);
        listArticles2.add(article2);
        listArtilces3.add(article3);
        listArticles4.add(article4);
        listArticles5.add(article5);
        listArticles1.add(article6);
          
        save(new ConferenceEntity(1, "Articulo 1" ,2, listArticles1));
        save(new ConferenceEntity(2, "Articulo 2" ,2, listArticles2));
        save(new ConferenceEntity(3, "Articulo 12" ,2,listArtilces3));
        save(new ConferenceEntity(4, "Articulo 11" ,2,listArticles4));
        save(new ConferenceEntity(14, "Articulo 10" ,2,listArticles5));
        
    }
}