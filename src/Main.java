import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char UserAns='Y';
        String enteredString;
        while (UserAns=='Y' || UserAns=='y'){
            System.out.print("Enter string: ");
            enteredString = sc.nextLine();
            System.out.println(enteredString.toUpperCase());
            System.out.print("Do you want to repeat(Y/N): ");
            enteredString = sc.nextLine();
            if(enteredString.length()>0)
                UserAns = enteredString.charAt(0);
            else
                UserAns='N';
        }


    }
}