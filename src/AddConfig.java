import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddConfig{
    @Bean
    public Word words(){ return new Word("words");}

}