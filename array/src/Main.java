//******IMPORTANT NOTES*************
//Objective:   >Enter specified number of students' details in an array of type Student.
//             >Also handle exception for mismatched input
//             >Allow the user another chance to enter the correct input during runtime.
//
//Challenges:  > Not clearing the invalid input causes skips and infinite loops
//             > InputMismatchException not included in the available libraries.
//             > ERROR: program thinks variable might not have been initialized after do-while
//
//resolutions: > Import all .util classes to include the InputMismatchedException classes
//             > use a do while to repeat prompts
//             > use a try-catch InputMismatchedException e to catch wrong input.
//             > clear the input after nextInt(), both try and catch statements.
//             > initialize dummy values on all user input variables on the catch statement e.g. numOfStudents = 0;
//             > for do-while initialize validInput as false, set to true at end of try, loop while validInput is false.

import java.util.*;

class Students{
    String name;
    int grade;
    Students(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    Students(){}//always include the default constructor if any constructor provided.
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
}
public class Main {
    public static String selector(int num){
        return switch (num){ //use the return-switch statement
           case 1 -> "st";
           case 2 -> "nd";
           case 3 -> "rd";
           default -> "th";
        };// ATTENTION!!! remember to end with semicolon PLEASE
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents;
        String studentName;
        int studentGrade;
        Students[] students;
        boolean validInput = false;
        do {
            try {
                System.out.println("Enter the number of students");
                numberOfStudents = sc.nextInt();
                sc.nextLine();//clear the '\n' character
                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Please enter a valid number");
                System.out.println();
                numberOfStudents = 0;
                sc.nextLine();//clear the input
            }
        }while(!validInput);// ATTENTION!!! remember to end with semicolon PLEASE
        students = new Students[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            do{
                try {
                        System.out.println("Enter the name of the "+(i+1)+selector(i+1)+" student");
                        studentName = sc.nextLine();
                        System.out.println("Enter the grade of the "+(i+1)+selector(i+1)+" student");
                        studentGrade = sc.nextInt();

                        validInput = true;
                        sc.nextLine();//Attention!! clear input for next for loop
                } catch (InputMismatchException e){
                    System.out.println("Invalid input");
                    System.out.println();
                    sc.nextLine(); //Attention!! clear input for next while loop
                    studentGrade = 0;
                    studentName = "";
                    validInput = false;
                }

            }while(!validInput);
        students[i] = new Students(studentName, studentGrade);
        }//end for

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i].getName() + " " + students[i].getGrade());
        }

    }// end main method
}//end Main class
