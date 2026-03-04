package Lesson07;

import java.util.Arrays;
//Code Lab hjælper rigtig meget!!!
//Jeg laver en objekt som er en blomst
public class FlowerShop {
    public static void main(String[] atgs) {
// Nu opretter jeg en flower objekt

        Flower f1 = new Flower("Pink", 24.0, 'A');
        Flower f2 = new Flower("Black", 30.2, 'N');
        Flower f3 = new Flower("Blue", 7.7, 'H');
        Flower f4 = new Flower("Burgandy", 4.6, 'O');
//lav en bouqet
        Flower[] bouquet = {f1, f2, f3, f4};
        System.out.println("🌼 Original bouquet:");
        displayFlowers(bouquet);

        // Sort flowers by price
        sortByPrice(bouquet);

        System.out.println("\n🌼 Bouquet sorted by price:");
        displayFlowers(bouquet);

        // Count white flowers
        int BlueCount = countColor(bouquet, 'H');
        System.out.println("\nNumber of Blue flowers: " + BlueCount);
    }

    // Display array of objects
    public static void displayFlowers(Flower[] flowers) {
        for (Flower f : flowers) {
            System.out.println(f);
        }
    }

    // Sort flowers by price (simple bubble sort)
    public static void sortByPrice(Flower[] flowers) {
        for (int i = 0; i < flowers.length - 1; i++) {
            for (int j = 0; j < flowers.length - 1; j++) {
                if (flowers[j].getPrice() > flowers[j + 1].getPrice()) {
                    Flower temp = flowers[j];
                    flowers[j] = flowers[j + 1];
                    flowers[j + 1] = temp;
                }
            }
        }
    }

    // Traverse and count by color
    public static int countColor(Flower[] flowers, char color) {
        int count = 0;
        for (Flower f : flowers) {
            if (f.getColorCode() == color) {
                count++;
            }
        }
        return count;


    }
}

