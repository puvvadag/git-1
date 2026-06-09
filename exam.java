import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;
        boolean pass = true;

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            total += marks[i];

            if (marks[i] < 35) {
                pass = false;
            }
        }

        double percentage = total / 5.0;

        System.out.println("\n===== EXAM RESULT =====");
        System.out.println("Total Marks : " + total + "/500");
        System.out.println("Percentage  : " + percentage + "%");

        if (pass) {
            System.out.println("Result      : PASS");
            
	    if (percentage >= 90) 
            if (percentage >= 90)
                System.out.println("Grade       : A+");
            else if (percentage >= 75)
                System.out.println("Grade       : A");
            else if (percentage >= 60)
                System.out.println("Grade       : B");
            else if (percentage >= 50)
                System.out.println("Grade       : C");
            else
                System.out.println("Grade       : D");
        } else {
            System.out.println("Result      : FAIL");
            System.out.println("Grade       : F");
        }

        sc.close();
    }
}
