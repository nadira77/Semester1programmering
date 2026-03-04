package Lesson14;

public class Cat extends Tamagotchi {
    public Cat(String name, int energy,Mood mood) {
        super(name, energy, mood,Food.FISH);
    }


    @Override
    public String feed() {
        return "hejhej";


    }


    @Override
    public String play() {
        return "ja";
    }

    @Override
    public boolean isDead() {
        return false;
    }
}