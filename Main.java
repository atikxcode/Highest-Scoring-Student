import java.security.Principal;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int score, highest = 0, secondHighest = 0;
        String name = "", student1 = "", student2 = "";

        System.out.println("Enter each student's name and score: ");
        for(int i = 0; i< numberOfStudents; i++){
            System.out.print("Student: " + (i + 1) + "\n  Name: ");
            name = input.next();
            System.out.print("  Score: ");
            score = input.nextInt();

            if(i==0){
                // assign the first student as the highest scoring
                highest = score;
                student1 = name;
            }
            // Second student entered scored
            // higher than first student
            else if(i==1 && score > highest){
                secondHighest = highest;
                highest = score;
                student2 = student1;
                student1 = name;
            }
            else if(i==1){
                secondHighest = score;
                student2 = name;
            }
            else if(i > 1 && score > highest && score > secondHighest){
                secondHighest = highest;
                student2 = student1;
                highest = score;
                student1 = name;
            }
            else if(i > 1 && score > secondHighest){
                student2 = name;
                secondHighest = score;
            }
        }

        System.out.println("Highest scoring student: " + student1 + "\nSecond highest Scoring Student: " + student2);
        }
    }





