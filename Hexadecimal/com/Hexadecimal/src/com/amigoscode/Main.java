package com.amigoscode;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;


public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Pick The Operation you will like to Perform");
        System.out.println("1.Conversion of Number to Binary Format");
        System.out.println("2.Conversion of Binary to Decimal");
        System.out.println("3.Conversion of Decimal to Binary");
        System.out.println("4.Conversion of Decimal to Hexadecimal");
        System.out.println("5.Conversion of Hexadecimal to Decimal");
        System.out.println("6.Conversion of Binary to Hexadecimal");
        System.out.println("7.Conversion of Hexadecimal to Binary");
        System.out.println("8.Perform Binary Addition of Two Numbers");
        Scanner input = new Scanner(System.in);
        int choice;
        choice = input.nextInt();
    // Declaring a Switch  Case
        switch (choice)
        {
            case 1 :
            {
                System.out.println("============================== You Choose Conversion of Number to Binary Format =================================");
                binaryFormat();
                break;
            }
            case 2:
            {
                System.out.println("============================== You Choose Conversion of Binary to Decimal Number =================================");
                binaryDecimal();
                break;
            }
            case 3 :
            {
                System.out.println("============================== You Choose Conversion of  Decimal Number to Binary Number =================================");
                decimalBinary();
                break;
            }
            case 4:
            {
                System.out.println("============================== You Choose Conversion of  Decimal Number to Hexadecimal Number =================================");
                decimalHexadecimal();
                break;
            }
            case 5 :
            {
                System.out.println("============================== You Choose Conversion of  Hexadecimal Number to Decimal Number =================================");
                hexadecimalDecimal();
                break;
            }
            case  6 :
            {
                System.out.println("============================== You Choose Conversion of  Binary Number to Hexadecimal Number =================================");
                binaryHexadecimal();
            }
            case 7 :
            {
                System.out.println("============================== You Choose Conversion of  Hexadecimal Number to Binary Number =================================");
                hexadecimaBinary();
            }
            case 8 :
            {
                System.out.println("============================== You want to Perform  Addition of  Two Binary Numbers =================================");
                binary();
                break;
            }

            default:
            {
                if (choice > 8)
                {
                    System.out.println("Error .. Try Again");
                }
            }

        }

    }
    //Creating Another Method for the conversion of integer to binary
    public static void binaryFormat() {
        // Declaring an Object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int number = input.nextInt();

        //  integer
        System.out.println("The Integer Number is : " + number);
        //Binary
        System.out.println("The Binary Format is : " + Integer.toBinaryString(number));
    }
    //Creating Another Method for the conversion of binary to decimal
    public static void binaryDecimal() {
        // Declaring an Object
        Scanner binary = new Scanner(System.in);
        System.out.println("Enter Your Binary Number");
        String binaryString = binary.nextLine();
        System.out.println("The Binary Number is : " + binaryString);
        //Converting to decimal
        int decimal = Integer.parseInt(binaryString, 2);

        //Output
        System.out.println("The Decimal Number is 👉 " + decimal);
    }
    //Creating Another Method for the conversion of decimal to binary
    public static void decimalBinary() {
        // Declaring an Object
     Scanner decimal = new Scanner(System.in);
        System.out.println("Enter Your Decimal Number");
        //Declaring a variable
        int dec = decimal.nextInt();
        System.out.println("The Decimal Number is : "+ dec);
       // Converting to Binary
        String  binary = Integer.toBinaryString(dec);

        System.out.println("The Binary NUmber of the Decimal Number is : " + binary);
    }
    //Creating Another Method for the conversion of decimal to hexadecimal
    public static void decimalHexadecimal()
    {
        //Declaring an Object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Decimal Number");
        int decimal = input.nextInt();
        System.out.println("The Decimal Number is : " + decimal);
        // Converting to Hexadecimal
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("The Hexadecimal Number is : " + hexadecimal);
    }

    //Creating Another Method for the conversion of hexadecimal to decimal
    public static void hexadecimalDecimal()
    {
        //Declaring an object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Hexadecimal Number is :");
        String decimal = input.nextLine();
        System.out.println("The Hexadecimal Number is : " + decimal);
        // Converting to Decimal
        int hexaDecimal = Integer.parseInt(decimal,16);
        System.out.println("The Decimal Number is : " + hexaDecimal);

    }
    //Creating Another Method for the Conversion of Binary to Hexadecimal
    public static void binaryHexadecimal()
    {
        // Declaring an Object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Binary NUmber");
        int binary = Integer.parseInt(input.nextLine(),2);
//        System.out.println("The Binary Number is : " + binary);
        // Converting to Hexadecimal
        String hexadecimal = Integer.toHexString(binary);
        System.out.println("The Hexadecimal Number is :  " + hexadecimal);


    }
    //Creating Another Method for the conversion of hexadecimal to Binary
    public static void hexadecimaBinary()
    {
        // Declaring an Object
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter Your Hexadecimal Number ");
        int binary = Integer.parseInt(input.nextLine() ,16);
        System.out.println("The Hexadecimal Number is : " + binary);
        //Converting to Binary
        String hexa = Integer.toBinaryString(binary);

        System.out.println("ThE Binary Number is : " + hexa);

    }
    //Creating Another Method for the Addition of Two Binary Numbers
    public static void binary()
    {
        // Declaring an Object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Binary Number :");
        int num1 =  Integer.parseInt(input.nextLine(),2);
//        System.out.println("The First Number is : " + num1);
        System.out.println("Enter Your Second Number ");
        int num2 = Integer.parseInt(input.nextLine(),2);
//        System.out.println("Your Second Number is : " + num2);
        //Converting integer to binary format
        String sum = Integer.toBinaryString(num1 + num2);
        //outputting  sum
        System.out.println("The Sum of the Binary Numbers are : " + sum);
    }
}


