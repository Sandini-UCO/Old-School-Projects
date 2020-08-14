package Dialogue;

import java.util.Scanner;

import static Functions.Division.*;

public class SelectionFOUR {

    public static float x, y;

    public static void FOUR(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the numbers you would like to Divide.");
        System.out.print("X: ");
        x = in.nextFloat();
        System.out.print("Y: ");
        y = in.nextFloat();
        System.out.println("");

        //From Functions Package Addition
        Divide(x,y);
        System.out.println("The Sum of "+x+" / "+y+" = "+getSum());
    }

}
