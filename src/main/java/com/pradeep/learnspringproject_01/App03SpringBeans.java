package com.pradeep.learnspringproject_01;

import com.pradeep.learnspringproject_01.game.GameRunner;
import com.pradeep.learnspringproject_01.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03SpringBeans {
    public static void main(String[] args) {
        var gameContext=new AnnotationConfigApplicationContext(GamingConfiguration.class);

        gameContext.getBean(GamingConsole.class).up();
        gameContext.getBean(GameRunner.class).run();

    }
}
