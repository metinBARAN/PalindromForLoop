import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int temp,number,reverse,reminder;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        number=input.nextInt();
        temp=number;
        for(reverse=0;temp!=0;temp/=10){

            reminder=temp%10;
            reverse=(reverse*10)+reminder;

        }
        System.out.println("Reverse of entered is: "+reverse);
        if (number==reverse)
            System.out.println("Palindrome is a number: "+number);
        else
            System.out.println("Palindrome is not a number: "+number);

    }
}
