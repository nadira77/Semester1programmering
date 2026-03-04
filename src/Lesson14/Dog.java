package Lesson14;

public class Dog extends Tamagotchi {

    public Dog(String name, int energy,Mood mood) {
        super(name, energy,mood,Food.BONE);
    }


    @Override
    public String feed() {
        return "hej";
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
