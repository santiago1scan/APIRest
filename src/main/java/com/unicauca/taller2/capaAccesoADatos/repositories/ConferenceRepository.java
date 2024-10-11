import java.util.ArrayList;

import org.springframework.stereotype.ConferenceRepository;

@Service
public class ConferenceRepository {
    private ArrayList<ConferenceEntity> listConferences;
    
    public ConferenceRepository(){
        this.listConferences = new  ArrayList<ConferenceRepository>();
    }

    public List<ConferenceEntity> findAll(){
        System.out.println("Listas de Conferencias: ");
        return this.listConferences;
    }
    public ConferenceEntity findByind(){
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
}