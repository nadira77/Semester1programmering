package Lesson05;

import java.lang.foreign.SymbolLookup;
import java.util.Scanner;
public class TivoliRideTest {
    public static void main (String[] args ){
        TivoliRide ride1 = new TivoliRide( "Dæmen",160);

        Scanner in = new Scanner (System.in);
        System.out.print("What is your name?");
        String name = in.nextLine();
        System.out.print ( "How tall are you?");
        int height = in.nextInt();
        System.out.println(ride1.checkHeight(height));
    }
}
