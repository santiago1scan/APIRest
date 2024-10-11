import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unicauca.taller.fachadaServices.services.IArticuleService;
import com.unicauca.taller.fachadaServices.DTO.articuleDTO;

@RequestController
@RequestMapping("/api")
public class ConferenceRestController {
    @AutoWired
    private IConferences conferenceServices;
    @GetMapping("/conference")
    public List<ConferenceDTO> listConferences(){
        return conferenceServices.findAll();
    }
    @GetMapping("/Confernece/{id}")
    public ConferenceDTO consultConferences(@PathVariable int id){
        ConferencesDTO objConference = null;
        objConference = conferenceServices.findByID(id);
        return objConference;
    } 
    @PostMapping("/conference") 
    public ConferenceDTO createConference(@RequestBody ConferenceDTO conference){
        ConferenceDTO objConference = null;
        objConference = conferenceServices.save(conference);
        return objConference;
    }
    @GetMapping("/conference/consultArticles/{id}")
    public int consultArticles(@PathVariable int id){
        ConferenceDTO obj = null;
        obj = conferenceServices.findByID(id);
        return 2;
    }


}