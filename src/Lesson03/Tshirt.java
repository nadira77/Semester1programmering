package Lesson03;


public class Tshirt  {
    String color;
    String size;
    String print;
    int cost;

public void Playit(){}

    public static void main  (String[] args) {
        Tshirt t1=new Tshirt();
        t1.color = "hvid";
        t1.size = "L";
        t1.print = "nike";
        t1.cost = 150;
        t1.Playit();

        System.out.println("---- TSHIRT 1 INFORMATION----" );
        System.out.println("Farve:"+ t1.color);
        System.out.println ("Størrelse:" +  t1.size);
        System.out.println("Mærke:"+ t1.print);
        System.out.println("Pris:"+t1.cost + " kr");

    ;

Tshirt t2=new Tshirt();
t2.color = "Mørke blå";
t2.size = "S";
t2.print = "Puma";
t2.cost = 250;
t2.Playit();

System.out.println("---- TSHIRT 2 INFORMATION----" );
System.out.println("Farve:"+ t2.color);
System.out.println("Størrelse: "+ t2.size);
System.out.println("Mærke:"+t2.print);
System.out.println("Pris:"+t2.cost + " kr");



    }
}


