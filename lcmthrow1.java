package com.company;
import java.util.Scanner;

public class CALCULATOR_AK {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the frist number: ");
        int num1 =sc.nextInt();
        System.out.print("enter the second number: ");
        int num2 =sc.nextInt();
        int lcm;
        lcm = (num1 > num2) ? num1 : num2;
        while(true)
        {
            if(lcm % num1 == 0 && lcm % num2 == 0)
            {
                System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm + ".");
                break;
            }

            else if(num1<0 && num2<0){
                    throw new ArithmeticException("the number is not valid");



            }

        }++lcm;
    }
}
