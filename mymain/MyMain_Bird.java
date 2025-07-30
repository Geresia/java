package mymain;

import myutil.*;

public class MyMain_Bird {
    public static void main(String[] args) {
        Bird[] birds = {
            new Eagle(),
            new Sparrow()
        };

        for (Bird bird : birds) {
            bird.fly();
            bird.eat();
            System.out.println("---[변경]---");
        }
    }
}
