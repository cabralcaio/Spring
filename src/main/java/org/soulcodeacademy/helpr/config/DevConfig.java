package org.soulcodeacademy.helpr.config;

import org.soulcodeacademy.helpr.services.PopulateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Configuration //Indica que esta classe sera gerenciada pelo Spring
@Profile("dev") // Sera instanciada apenas se o perfil ativo for "dev"
public class DevConfig {
    //esta classe ira chamar o Populate service caso o perfil ativo seja de desenvolvimento
    @Autowired
    private PopulateService populateService;

    @Value("{spring.jpa.hibernate.ddl-auto}") // vai acessar a propriedade
    private String ddlAuto;

    @PostConstruct //faz com que o metodo execute após a instancia ser criada
    public void init() {
        if(this.ddlAuto.equals("create")) {
           this.populateService.populate(); // inserir os dados novos caso a tabela tenha sido dropada
        }
    }
}
