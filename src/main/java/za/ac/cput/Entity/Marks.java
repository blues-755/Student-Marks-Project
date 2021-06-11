/*
Klaus Traubner
218009496
11 June 2021
 */

package za.ac.cput.Entity;

import java.util.Scanner;

class marks {

    public static void main(String[] args) {

        int i;

        //Input from user
        Scanner input = new Scanner(System.in);
        //Accepts name from user
        System.out.println("Please enter your name: ");
        String name = input.next();
        //Number of subjects = number to be divided by
        System.out.println("Enter number of subjects");
        int numOfSubjects = input.nextInt();

        int[] subjectNo = new int[numOfSubjects];

        double average = 0;

        System.out.println("Enter marks");
        //Amount of subjects to be divided by
        for (i = 0; i < numOfSubjects; i++) {
            subjectNo[i] = input.nextInt();
            average = average + subjectNo[i];
        }

        for (i = 0; i < numOfSubjects - 1; i++) {
        }
        //
        System.out.println("Your average is = " + average / numOfSubjects);
    }
}


