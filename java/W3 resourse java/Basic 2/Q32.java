import java.util.Scanner;
public class Q32 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter number 1: ");
        num1 = in.nextInt();
        System.out.println("Enter number 2 : ");
        num2 = in.nextInt();
        if (num1==num2){
            System.out.println("num1 is equal to num2");
        }
        else if (num1>num2){
            System.out.println("num1 is greater then num2");
        }
        else{
            System.out.println("num2 is greater then num1");
        }
    }
}
