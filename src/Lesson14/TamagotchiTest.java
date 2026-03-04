package Lesson14;

import java.util.ArrayList;

public class TamagotchiTest {

    public static void main(String[] args) {
        ArrayList<Tamagotchi> tamagotchislist = new ArrayList<>();

        tamagotchislist.add(new Cat("Mula",2,Mood.HAPPY));
        tamagotchislist.add(new Dog("Nulle",5,Mood.SAD));


System.out.println(tamagotchislist);

    }
}