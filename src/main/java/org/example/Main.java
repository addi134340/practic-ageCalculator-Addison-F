package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter their age
        System.out.print("Please enter your age: ");
        byte age = scanner.nextByte();
        byte yearsLeft = (byte)(100-age);

        //Output the message
        System.out.print("You are " + yearsLeft + " years away from 100!");
    }
}