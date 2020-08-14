import java.util.Scanner;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {

    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args){

        String log4ConfigFile = System.getProperty("user.dir")+File.separator
                +"log4j.properties";
        PropertyConfigurator.configure(log4ConfigFile);


        int Selection = 0;

        while(Selection != 7) {
            logger.info("Hey we are at the beginning of the loop.");
            CheckSelection(Selection);
        }
    }
    public static void CheckSelection(int Selection){
        Scanner in = new Scanner(System.in);

        if(Selection == 0){
            System.out.println("\n");
            System.out.println("Please make a selection of what Mathematical Operation you would like to perform");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exponential");
            System.out.println("7. Exit");
            System.out.print("Please type your number: ");
            Selection = in.nextInt();
        }
        if(Selection == 1){
            Dialogue.SelectionONE.ONE();
            logger.fatal("Fatal level can be displayed");
            logger.info("Choice "+Selection+" was selected");
            logger.warn("Warning level can be displayed");
            logger.error("Error level can be displayed");
            logger.debug("Debug level can be displayed");


        }else if(Selection == 2){
            Dialogue.SelectionTWO.TWO();
            logger.info("Choice "+Selection+" was selected");
        }else if(Selection == 3){
            Dialogue.SelectionTHREE.THREE();
            logger.info("Choice "+Selection+" was selected");
        }else if(Selection == 4) {
            Dialogue.SelectionFOUR.FOUR();
            logger.info("Choice "+Selection+" was selected");
        }else if(Selection == 5) {
            Dialogue.SelectionFIVE.FIVE();
            logger.info("Choice "+Selection+" was selected");
        }else if(Selection == 6){
            Dialogue.SelectionSIX.SIX();
            logger.info("Choice "+Selection+" was selected");
        }else if(Selection == 7){
            System.out.println("Thank you for your interest in mathematics and using my calculator.");
            System.out.println("Have a great day.");
            logger.info("Choice "+Selection+" was selected");
            System.exit(0);
        }else{
            Selection = 0;
        }
    }
}
