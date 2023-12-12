//import java.lang.reflect.Array;
import java.util.*;
//import java.util.Scanner;

public class bmi {
  /*Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. Note: - 1 pound=.45359237 Kg and 1 inch=.0254 meters*/

  static String weight = "", height = "";
  static double pounds = 0.45359237, inches = .0254, bmi = 0, placeHolder = 0;
  static int i = 0, len = 0;
  static boolean check = false;

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter Weight in kg or lb: ");

    weight = input.nextLine();
    weight = weight.replaceAll("\\s+", "");
    String[] digits = weight.split("\\D+");
    String[] weightUnit = weight.split("\\d+");

    // System.out.println(weightUnit);

    // Weight Input
    for (int x = 0; x < weightUnit.length; x++) {
      if (weightUnit[x].equalsIgnoreCase("kg")
          || weightUnit[x].equalsIgnoreCase("lb")
          || weightUnit[x].equalsIgnoreCase("kilograms")) {
        i = x;
        check = true;
        break;
      }
    }
    System.out.print("Weight: ");

    if (check == true) {
      if (weightUnit[i].equalsIgnoreCase("kg") || weightUnit[i].equalsIgnoreCase("kilograms")) {

        mergeDecimal(digits);
        pounds = placeHolder;
        System.out.print(pounds + " kilogram");
        if (pounds > 1) {
          System.out.print("s.");
        } else {
          System.out.print(".");
        }
      } else if (weightUnit[i].equalsIgnoreCase("lb") || weightUnit[i].equalsIgnoreCase("pounds")) {

        mergeDecimal(digits);
        pounds *= placeHolder;
        
        System.out.print(pounds + " kilogram");
        if (pounds > 1) {
          System.out.print("s.");
        } else {
          System.out.print(".");
        }
      }
    } else {
      System.out.print("Wrong Input.\nRestarting Program\n\n");
      main(null);
    }
    check = false;

    // Height Input
    System.out.println("\nEnter Height in inches or meters: ");
    height = input.nextLine();

    height = height.replaceAll("\\s+", "");
    String[] digit = height.split("\\D+");
    String[] heightUnit = height.split("\\d+");
      if (heightUnit[0].isEmpty() && heightUnit.length == 1) {
      height = null;
      digit = null;
      //System.out.println("Enter Height: ");
      height = input.nextLine();
      height = height.replaceAll("\\s+", "");
      digit = height.split("\\D+");
      heightUnit = height.split("\\d+");
    }
    for (int x = 0; x < heightUnit.length; x++) {
      if (heightUnit[x].equalsIgnoreCase("in")
          || heightUnit[x].equalsIgnoreCase("\"")
          || heightUnit[x].equalsIgnoreCase("m")
          || heightUnit[x].equalsIgnoreCase("inches")
          || heightUnit[x].equalsIgnoreCase("meters")) {
        i = x;
        check = true;
        break;
      }
    }
    System.out.print("Height: ");
    if (check == true) {
      if (heightUnit[i].equalsIgnoreCase("in")
          || heightUnit[i].equalsIgnoreCase("\"")
          || heightUnit[i].equalsIgnoreCase("inches")) {

        mergeDecimal(digit);
        inches *= placeHolder;

        System.out.print(inches);
        if (inches > 1) {
          System.out.print("meters.");
        } else {
          System.out.print("meter.");
        }
      } else if (heightUnit[i].equalsIgnoreCase("m") || heightUnit[i].equalsIgnoreCase("meters")) {

        mergeDecimal(digit);
        inches = placeHolder;
        System.out.print(inches + " meter");
        if (inches > 1) {
          System.out.print("s.");
        } else {
          System.out.print(".");
        }
      }
    } else {
      System.out.print("Wrong Input.\nRestarting Program.\n\n");
      main(null);
    }
    check = false;
    bmi = pounds / (inches * inches);
    System.out.print("\nYour Body Mass Index is: " + bmi + " kg/m².");
  }

  public static void mergeDecimal(String[] digits) {
    if (digits.length == 1) {
      placeHolder = Double.valueOf(digits[0]);
    }
    if (digits.length > 1) {
      len = digits[1].length();
      if (len > 0) {
        String decimalNumber = digits[0] + "." + digits[1];
        placeHolder = Double.valueOf(decimalNumber);
      }
    }
  }
}
