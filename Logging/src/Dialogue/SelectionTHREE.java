package Dialogue;

import java.util.Scanner;

import static Functions.Multiplication.*;

public class SelectionTHREE {

    public static float x, y;

    public static void THREE(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the numbers you would like to Multiply.");
        System.out.print("X: ");
        x = in.nextFloat();
        System.out.print("Y: ");
        y = in.nextFloat();
        System.out.println("");

        //From Functions Package Addition
        Multiply(x,y);
        System.out.println("The Sum of "+x+" * "+y+" = "+getSum());
    }

}
