package com.pradeep.learnspringproject_01;

import com.pradeep.learnspringproject_01.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class GamingConfiguration {
    @Bean
    @Primary
    public GamingConsole game(){
        return new MarioGame();
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }

}
