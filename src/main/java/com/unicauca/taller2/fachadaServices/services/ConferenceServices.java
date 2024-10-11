
@Service
public class ConferenceServices implements IConferences{
     @AutoWired
     private ConferenceRepository repository;

     @AutoWired
     private ModelMapper ModelMapper;

     public ConferenceServices(ConferenceRepository ConferenceRepository, ModelMapper model ){
        this.ModelMapper = model;
        this.repository = ConferenceRepository;
     }

     @Override
     public List<ConferenceRepository> findAll(){
        List<ConferenceRepository> conferencesEntity = this.repository.findAll();
        List<ConferenceDTO> conferencesDTO = this.ModelMapper.map(articlesEntity, new TypeToken<List<articuleDTO>>() {
		}.getType());
        return conferencesDTO;
     }
     
     
}
