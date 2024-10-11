
@Service
public class ConferenceServices implements IConferences{
     @AutoWired
     private ConferenceRepository conferenceRepository;

     @AutoWired
     private ModelMapper ModelMapper;
   
     public ConferenceServices(ConferenceRepository ConferenceRepository, ModelMapper model ){
        this.ModelMapper = model;
        this.repository = ConferenceRepository;
        createConferences();
     }

     @Override
     public List<ConferenceRepository> findAll(){
        List<ConferenceRepository> conferencesEntity = this.conferenceRepository.findAll();
        List<ConferenceDTO> conferencesDTO = this.ModelMapper.map(articlesEntity, new TypeToken<List<articuleDTO>>() {
		}.getType());
        return conferencesDTO;
     }
     @Override
     public ConferenceDTO findByID(int id){
         ConferencesEntity conferenceEntity = this.conferenceRepository.findByID(id);
         ConferenceDTO conferenceDTO = this.modelMapper.map(conferenceEntity, conferenceDTO.class);
         return conferenceDTO;
     }
     @Override
     public ConferenceDTO save(ConferenceDTO conference){
         ConferenceEntity conferenceEntity = this.modelMapper.map(articule, conferenceEntity.class);
         ConferenceEntity objConferenceEntity = this.conferenceRepository.save(conferenceEntity);
         ConferenceDTO conferenceDTO = this.modelMapper.map(objConferenceEntity, conferenceDTO.class);
         return conferenceDTO;
     }   
     @Override
     public ConferenceDTO update(int id, ConferenceDTO conference){
         ConferenceEntity conferenceEntity = this.modelMapper.map(articule, articuleEntity.class);
         ConferenceEntity clienteEntityUpdate = this.conferenceRepository.update(id, conferenceEntity);
         ConfrereceDTO  articuleDTO = this.modelMapper.map(clienteEntityUpdate, articuleDTO.class);
         return articuleDTO;
     }
     @Override
     public boolean delet(int id){
      return this.conferenceRepository.delete(id);
     }
   private void createConferences(){
      this.repository.save(new ConferenceEntity(1, "Articulo 1" ,2));
      this.repository.save(new ConferenceEntity(2, "Articulo 2" ,2));
      this.repository.save(new ConferenceEntity(3, "Articulo 12" ,2));
      this.repository.save(new ConferenceEntity(4, "Articulo 11" ,2));
      this.repository.save(new ConferenceEntity(14, "Articulo 10" ,2));
      
  }

     
}
