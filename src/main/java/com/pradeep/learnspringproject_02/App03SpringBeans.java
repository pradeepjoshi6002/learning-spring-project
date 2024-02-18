package com.pradeep.learnspringproject_02;

import com.pradeep.learnspringproject_02.game.GameRunner;
import com.pradeep.learnspringproject_02.game.GamingConsole;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.pradeep.learnspringproject_02.game")
public class App03SpringBeans {
//    @Bean
//    @Primary
//    public GamingConsole game(){
//        return new MarioGame();
//    }
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }

    public static void main(String[] args) {
        var gameContext=new AnnotationConfigApplicationContext(App03SpringBeans.class);

        gameContext.getBean(GamingConsole.class).up();
        gameContext.getBean(GameRunner.class).run();

    }
}
