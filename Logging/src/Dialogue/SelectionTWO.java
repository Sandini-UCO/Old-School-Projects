package Dialogue;

import java.util.Scanner;

import static Functions.Subtraction.*;


public class SelectionTWO {

    public static float x, y;

    public static void TWO(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the numbers you would like to Subtract.");
        System.out.print("X: ");
        x = in.nextFloat();
        System.out.print("Y: ");
        y = in.nextFloat();
        System.out.println("");

        //From Functions Package Subtraction
        Minus(x,y);
        System.out.println("The Sum of "+x+" - "+y+" = "+getSum());
    }

}
