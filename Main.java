import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Mini Project

        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.println("Guess my number: ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("Yep!!! You have guessed Correct Number.");
                break;
            }
            else if(userNumber < myNumber){
                System.out.println("Your Number is Too Small!");
            }
            else{
                System.out.println("Your number is too Large!");
            }
        }while(userNumber >= 0);
        System.out.println("My Number was: ");
        System.out.println(myNumber);


    }
}