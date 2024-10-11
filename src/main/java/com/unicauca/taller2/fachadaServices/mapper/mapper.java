
import org.ModelMapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mapper {
    @bean
    public ModelMapper ModelMapper(){
        return new  ModelMapper();
    }
}
