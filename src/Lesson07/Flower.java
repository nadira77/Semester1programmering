package Lesson07;
//Jeg har defineret en klasse med en contructor(skabe en ny give værdier)
// og attributer(Hvad kan der være i)
// Forskellige datatyper som giver metoder til at fortælle og tekst eller double til komma eller char til en bogstav


public class Flower {
    private String name;
    private double price;
    private char colorCode;

    public Flower(String name, double price, char colorCode) {
        this.name = name;
        this.price = price;
        this.colorCode = colorCode;
    }


// Getters(er den man tag en attribut og sender den til klassen ændre værdien udefra)

    //For at kunne bruge getter skal den være public ,hvad er det man får en attribut man får tilbage

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public char getColorCode() {
        return colorCode;
    }
    // setter (giver den private attribute)der bliver ikke retuneret tilbage (void) ikke brug for information
    //de skal øndre på attributor hvorimod getter bare læser

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    // Tag classen og laver den om.tostring=hvis jeg vil have en flower skal printes,hvad vil jeg vise når den skal printes
    @Override
    public String toString() {
        return "Flower{name='" + name + "', price=" + price + ", color=" + colorCode + "}";
    }
}
//override beskriver en overskrifter en eksiterende metode