//08-11-2019
//Author: Oscar
package pk.oscar;
//Libraries:
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.time.chrono.MinguoDate;
import java.util.Enumeration;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    //GLOBAL DECLARATIONS
    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("000.000");
    static DecimalFormat df2 = new DecimalFormat("000.0");
    public static void main(String[] args) throws InterruptedException {
        //Variable declaration
        int option = -1;
        keyboard.useDelimiter("\n");

        do {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//start of switch
                case 1:
                    P1();
                    break;
                case 2:
                    P2();
                    break;
                case 3:
                    P3();
                    break;
                case 4:
                    P4();
                    break;
                case 5:
                    P5();
                    break;
                case 6:
                    P6();
                    break;
                case 7:
                    P7();
                    break;
                case 8:
                    P8();
                    break;
                case 9:
                    P9();
                    break;
                case 10:
                    P10();
                    break;
                case 0:
                    P0();
                    break;
                default:
                    System.out.println("\033[31mThis option is not valid.\033[30m");
            }//end of switch
        } while (option != 0);
    }

    private static void userMenu() {

        System.out.println("\033[31mUSER MENU\033[30m");
        System.out.println("Option1");
        System.out.println("Option2");
        System.out.println("Option3");
        System.out.println("Option4");
        System.out.println("Option5");
        System.out.println("Option6");
        System.out.println("Option7");
        System.out.println("Option8");
        System.out.println("Option9");
        System.out.println("Option10");
        System.out.println("Option0: (Exit)");

        System.out.print("\nOption ? ");
    }

    private static void P1() {
        //Variable declarations
        int euros;
        System.out.println("\033[31mEXERCICE 1\033[30m");
        System.out.print("Amount in euros: ");
        euros=keyboard.nextInt();
        float dollars=intToFloat(euros);
        System.out.println(euros+"€ = "+df.format(dollars)+"$");
        System.out.println("\nPRESS ENTER TO RETURN TO THE MENU");
        String key = keyboard.next();
    }
    private static float intToFloat(int euro){
        float dollars=euro*1.08f;
        return dollars;
    }

    private static void P2() {
        //Variable declarations
        int euros;
        System.out.println("\033[31mEXERCICE 2\033[30m");
        System.out.print("Amount in euros: ");
        euros=keyboard.nextInt();
        //int*double
        double dollars=intToDouble(euros);
        System.out.println(euros+"€ = "+df.format(dollars)+"$");
        System.out.println("\nPRESS ENTER TO RETURN TO THE MENU");
        String key = keyboard.next();
    }
    private static double intToDouble(int euro){
        double dollars=euro*1.08;
        return dollars;
    }

    private static void P3() {
        //Variable declarations
        int euros;
        System.out.println("\033[31mEXERCICE 3)\033[30m");
        System.out.print("Amount in euros: ");
        euros=keyboard.nextInt();
        System.out.println(euros+"€ = "+intToString(euros));
        System.out.println("\nPRESS ENTER TO RETURN TO THE MENU");
        String key = keyboard.next();
    }
    private static String intToString (int euro){
        double operation = euro*1.08;
        String operationFormatted=df.format(operation);
        String dollars=String.valueOf(operationFormatted+"$");
        return dollars;
    }

    private static void P4() {
        //Variable declarations
        String euros;
        System.out.println("\033[31mEXERCICE 4\n\033[30m");
        System.out.print("Amount in euros: ");
        euros=keyboard.next();
        System.out.println(euros+"€ = "+stringToInt(euros)+"$");
        System.out.println("PRESS ENTER TO RETURN TO THE MENU");
        String key = keyboard.next();
    }
    private static int stringToInt (String euro){
        double eurosDoubled=Double.valueOf(euro);
        double operation=eurosDoubled*1.08;
        int dollars=(int)operation;
        return dollars;
    }

    private static void P5() {
        //Variable declarations
        float euros;
        System.out.println("\033[31mEXERCICE 5)\033[30m");
        System.out.print("Amount in euros: ");
        euros=keyboard.nextFloat();
        System.out.println(euros+"€ = "+floatToInt(euros)+"$");
        System.out.println("\nPRESS ENTER TO RETURN TO THE MENU");
        String key = keyboard.next();
    }
    private static int floatToInt (float euro){
        float operation=euro*1.08f;
        int dollars=(int)operation;
        return dollars;
    }

    private static void P6() {
        //Variable declarations
        float euros;
        System.out.println("\033[31mEXERCICE 6)\033[30m");
        System.out.print("Amount in euros: ");
        euros=keyboard.nextFloat();
        System.out.println(euros+"€ = "+floatToString(euros));
        System.out.println("\nPRESS ENTER TO RETURN TO THE MENU");
        String key = keyboard.next();
    }
    private static String floatToString (float euro){
        float operation=euro*1.08f;
        String operationFormatted=df2.format(operation);
        //float to string
        String dollars=String.valueOf(operationFormatted+"$");
        return dollars;
    }

    private static void P7() {
        //Variable declarations
        char letter;
        System.out.println("\033[31mEXERCICE 7)\033[30m");
        System.out.print("Letter: ");
        letter=(keyboard.next()).charAt(0);
        //Char to int
        System.out.println("Letter equivalent in int: "+charToInt(letter));
        //Char to binary
        System.out.println("Letter equivalent in Binary: "+charToBinary(letter));
        System.out.println("\nPRESS ENTER TO RETURN TO THE MENU");
        String key = keyboard.next();
    }
    private static int charToInt (char letter){
        int letterInt;
        letterInt=letter;
        return letterInt;
    }
    private static String charToBinary (char letter){
        String letterBinary=Integer.toBinaryString(letter);
        return letterBinary;
    }

    private static void P8() {
        //Variable declarations
        String name;
        System.out.println("\033[31mEXERCICE 8)\033[30m");
        System.out.print("Name: ");
        name=keyboard.next();
        for (int i = 0; i < name.length() ; i++) {
            System.out.print(name.charAt(i));
            System.out.print(" = ");
            System.out.println(charToBinary(name.charAt(i)));
        }
        System.out.println("\nPRESS ENTER TO RETURN TO THE MENU");
        String key = keyboard.next();
    }

    private static void P9() {
        //Variable declarations
        int number;
        System.out.println("\033[31mEXERCICE 9)\033[30m");
        System.out.print("Number 1-255: ");
        number=keyboard.nextInt();
        System.out.println("Equivalent of the number in char: "+intToChar(number));
        System.out.println("\nPRESS ENTER TO RETURN TO THE MENU");
        String key = keyboard.next();
    }
    private static char intToChar (int number) {
        char numberChar = (char) number;
        return numberChar;
    }

    private static void P10() {
        //Variable declarations
        char letter=0;
        System.out.println("\033[31mEXERCICE 10)\033[30m");
        System.out.println("El ASCII es, básicamente, un código de caracteres que tiene su base en el alfabeto romano o latino. Esto quiere decir que el ASCII sirve para convertir, a través de una serie de reglas, un carácter que forma \nparte de un lenguaje natural (como una letra de un alfabeto) en un símbolo que pertenece a otra clase de sistema representativo.");
        System.out.println("");
        for(int i=0; i<=255 ; i++ ){
            intToHexString(i);
            System.out.println("The ASCII code of the letter " + letter++ + " is " + i + " in numeric and "+intToHexString(i)+" in hexadecimal.");
        }
        System.out.println("\nPRESS ENTER TO RETURN TO THE MENU");
        String key = keyboard.next();
    }

    private static String intToHexString (int i){
        String iHex = Integer.toHexString(i);
        return iHex;
    }

    public static void P0() {
        System.out.println("\033[31mSee you later, thanks for using our program.\033[30m");
    }
}
