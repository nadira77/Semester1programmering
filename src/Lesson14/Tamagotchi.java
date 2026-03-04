package Lesson14;
//abstarct

public abstract class Tamagotchi {
    private String name;
    private int energy;
    private Mood mood;
    private Food food;

    //contructor
    public Tamagotchi(String name, int energy,Mood mood,Food food) {
        this.name = name;
        this.energy = energy;
        this.food= food;
        this.mood=mood;
    }

    public abstract String play();

    public abstract String feed();

    public abstract boolean isDead();
  @Override
  public String toString(){
      return "navn: " + name + "energy: "+ energy+"food: "+food + "mood: "+mood;
  }
}
