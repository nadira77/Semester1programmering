package Lesson06;

import java.util.Random;

public class Diceman {
    //Vi importerer vores random generator i java utility.

    //Vi laver vores variabler i vores DiceMan klasse.
    private String activity;   // The chosen activity
    private Random random;

    // Vi opretter vores konstruktør
    public Diceman() {
        this.random = new Random();
        this.activity = "Eat breakfast"; // default value
    }

    // Method to roll the dice
    public void roll() {
        int result = random.nextInt(6); // 0 to 5

        if (result == 0) {
            activity = "Eat breakfast";
        } else if (result == 1) {
            activity = "Study something boring";
        } else if (result == 2) {
            activity = "Go swimming";
        } else if (result == 3) {
            activity = "Go fishing";
        } else if (result == 4) {
            activity = "Call his mom";
        } else {
            activity = "Go back to bed";
        }
    }

    // Getter
    public String getActivity() {
        return activity;
    }

    @Override
    public String toString() {
        return activity;
    }
}

