package com.company;
import java.util.Scanner;


public class Main
{

    public static void main(String[] args)
    {
        /* Part 1
        Part A */
        for(int i = 4; i<=9; i++)
        {
            System.out.println(i);
        }
//------------------------------------------
        //Part B

        for(int i = 2; i<=8; i= i + 2)
        {
            System.out.println(i);
        }
//------------------------------------------
        //Part C
        for(int i = 5; i>=1; i= i - 1)
        {
            System.out.println(i);
        }

//--------------------------------------------------------

        for(int i = 3; i<=27; i= i *3)
        {
            System.out.println(i);
        }
//------------------------------------------

    // Part 2
        for(int i = 0; i<=100; i++)
        {
            System.out.println("Ryan");
        }
//------------------------------------------

        //Part 3
        for(int i = 1; i<=100; i++)
        {
            System.out.println(i);
        }
//------------------------------------------

        //Part 4.A
        for(int i = 10; i<=50; i=i + 2)
        {
            System.out.println(i);
        }
//------------------------------------------
        //Part 4.B
        for(int i = 10; i<=50; i=i + 5)
        {
            System.out.println(i);
        }
//------------------------------------------
         //Part 4.C
        for(int i = 50; i>=10; i=i - 5)
        {
            System.out.println(i);
        }
//------------------------------------------
         //Part 5
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer here: ");
        int user = scanner.nextInt();

        for(int i=0; i <= user; i++)
        {
            System.out.println(i);
        }
//------------------------------------------




    }
}
