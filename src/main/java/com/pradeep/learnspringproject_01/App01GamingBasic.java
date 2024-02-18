package com.pradeep.learnspringproject_01;
import com.pradeep.learnspringproject_01.game.*;

public class App01GamingBasic {
    public static void main(String[] args) {
        var game=new PacMan();
        var gameRunner=new GameRunner(game);

        gameRunner.run();
    }
}
