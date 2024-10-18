package Task2;
import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      // System.out.println("Average percentage:"+avg);
        System.out.println("Enter number of subject:");
        int n=sc.nextInt();
        System.out.println("Enter Marks:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<n;i++){
             sum +=arr[i];
        }
        int avg=(sum)/n;
        char grade;
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Total Marks:"+sum);
        System.out.println("Average percentage:"+avg);
        System.out.println("grade:"+grade);
    }
}
