package Day1;
import java.util.Scanner;
public class Leap_Year {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int yr = sc.nextInt();
        sc.close();
        System.out.println();
        if (yr%4==0 && yr%100 != 0 && yr%400 != 0){
            System.out.println("The Given Year is a Leap Year");
        }
        else{
            System.out.println("This is Not a Leap Year");
        }
    }
}
