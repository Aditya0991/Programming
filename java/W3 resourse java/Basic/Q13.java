import java.util.Scanner;
public class Q13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = in.nextInt();

        System.out.print("Enter the third number : ");
        int num3 = in.nextInt();
        
        System.out.println("Average of above three number : " + (num1 +num2+num3)/3);
    }
    
}
