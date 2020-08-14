package Dialogue;

import java.util.Scanner;

import static Functions.Modulus.*;

public class SelectionFIVE {
    public static float x, y;

    public static void FIVE(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the numbers you would like to Add");
        System.out.print("X: ");
        x = in.nextFloat();
        System.out.print("Y: ");
        y = in.nextFloat();
        System.out.println("");

        //From Functions Package Addition
        Mod(x,y);
        System.out.println("The Sum of "+x+" % "+y+" = "+getSum());
    }

}
