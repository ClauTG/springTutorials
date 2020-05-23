package ifdemo;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter your age: ");
        int userAge = input.nextInt();
        if (userAge<0 || userAge > 150) {
            System.out.print("Invalid age!\n");
            System.out.print("Age must be between 0 and 150\n");
            }
        else if (userAge < 18) {
            System.out.print("Sorry you are underage\n");
        }
        else if (userAge < 21) {
            System.out.print("You need parental consent\n");
        }
        else {
            System.out.print("Congratulations!!\nYou may sign up for the event\n");
        }

    }

}