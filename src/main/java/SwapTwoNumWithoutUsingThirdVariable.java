import java.util.Scanner;

public class SwapTwoNumWithoutUsingThirdVariable {

    public static void main(String[] args)
    {
    ReverseNumber();
    }

    public static void ReverseNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first integer");
        int num1 = sc.nextInt();

        System.out.println("Enter second integer");
        int num2 = sc.nextInt();

        num1 = num1+num2;
        num2= num1-num2;
        num1 = num1-num2;

        System.out.printf("First Number after reverse : %d%n",num1);
        System.out.printf("Second Number after reverse : %d%n",num2);

    }
}
