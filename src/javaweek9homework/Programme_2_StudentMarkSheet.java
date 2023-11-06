package javaweek9homework;
/**
 * 2. Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */
import java.util.Scanner;

public class Programme_2_StudentMarkSheet {



        //declaring variables as static, to use in other methods
        static String stname;
        static String rollno;
        static int maths;
        static int science;
        static int english;
        static int total;
        static double percentage;
        static String result;
        static String grade;

        //main method
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char anotherOperation = 'Y';

            while (anotherOperation == 'Y' || anotherOperation == 'y') {
                System.out.println("Please enter Student Name and Roll no:");
                stname = sc.nextLine();
                rollno = sc.nextLine();
                System.out.println("Please enter marks in following subjects: ");
                System.out.println("Maths: ");
                maths = sc.nextInt();
                System.out.println("Science: ");
                science = sc.nextInt();
                System.out.println("English: ");
                english = sc.nextInt();
                validEntry();
                passOrFail();
                gradecalculator();
                System.out.println("Would you like to perfrom anoter operation? Y or N :");
                anotherOperation = sc.next().charAt(0);
            }
            sc.close();
        }

        //method to check valid entry
        public static void validEntry() {
            if ((maths < 0 || maths > 100) || (science < 0 || science > 100) || (english < 0 || english > 100)) {
                System.out.println("Invalid input, Marks should be between 0 and 100");
            } else {
                System.out.println("Calculating final result..");
            }
        }

        //method to check pass or fail
        public static void passOrFail() {
            if (maths < 35 || science < 35 || english < 35) {
                result = "Fail";
            } else {
                result = "Pass";
            }
        }

        //method to calculate grade and result
        public static void gradecalculator() {
            total = maths + science + english;
            percentage = (total) / 3;
            if (percentage >= 80) {
                // = "Pass";
                grade = "A+";
            } else if (percentage < 80 && percentage >= 60) {
                //result = "Pass";
                grade = "A";
            } else if (percentage < 60 && percentage >= 50) {
                // result = "Pass";
                grade = "B";
            } else if (percentage < 50 && percentage >= 35) {
                //result = "Pass";
                grade = "C";
            } else {
                // result = "Fail";
                grade = "Nil";
            }
            System.out.println(result + " " + grade);
            printresult();
        }

        //method to print result
        public static void printresult() {
            System.out.println("__________________________________________");
            System.out.println("|                                        |");
            System.out.println("|             Mark Sheet                 |");
            System.out.println("|________________________________________|");
            System.out.println("|   Name           :    " + stname + "           |");
            System.out.println("|   Rollno         :    " + rollno + "               |");
            System.out.println("|______________________________________|");
            System.out.println("|   Subjects       :     Marks         |");
            System.out.println("|______________________________________|");
            System.out.println("|   Maths          :    " + maths + "                |");
            System.out.println("|   Science        :    " + science + "             |");
            System.out.println("|   English        :    " + english + "           |");
            System.out.println("|______________________________________|");
            System.out.println("|   Total          :    " + total + "          |");
            System.out.println("|______________________________________|");
            System.out.println("|   Percentage     :  " + percentage + "%" + "       |");
            System.out.println("|   Result         :    " + result + "             |");
            System.out.println("|   Grade          :    " + grade + "                    |");
            System.out.println("|______________________________________|");

        }
    }
