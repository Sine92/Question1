package ac.za.cput.proj;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name= "retireSon")

    public FamilyService getService()
    {
        return new FamilyServiceImpl();
    }
    @Bean(name = "serv")
    public FamilyService getUpdatedService(){
         return new UpdatedFamilyService();
    }

}
