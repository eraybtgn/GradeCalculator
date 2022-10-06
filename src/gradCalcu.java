import java.util.Scanner;

public class gradCalcu {
    public static void main(String[] args) {
        int quiz,midterm,finalexam,result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter quiz..");
        quiz= scan.nextInt();
        System.out.println("Please enter midterm..");
        midterm= scan.nextInt();
        System.out.println("please enter finalexam..");
        finalexam= scan.nextInt();
        result= (quiz*20/100);
        result+= (midterm*30/100);
        result+= (finalexam*50/100);
        if(result>=90){
            System.out.println("Your grade is AA. Congrutulations..");
        }else if (result<90 && result>=80){
            System.out.println("Your grade is BA..");
        } else if (result<80 && result>=70) {
            System.out.println("Your grade is BB..");
        } else if (result<70 && result>=60) {
            System.out.println("Your grade is CB..");
        } else if (result<60 && result>=50) {
            System.out.println("Your grade is CC..");
        }else{
            System.out.println("Sorry you failed...");

        }
    }
}