import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String args[]){
        Scanner S = new Scanner(System.in);
        double n1,n2,quotient,remainder;
        System.out.println("Enter n1 value: ");
        n1 = S.nextDouble();
        System.out.println("Enter n2 value: ");
        n2 = S.nextDouble();
        quotient = n1/n2;
        remainder =n1%n2;
        System.out.println("Quotient of " +n1+ " & "+ n2 +" is: "+quotient);
        System.out.println("Remainder of " +n1+ " & "+ n2 +" is: "+remainder);
        S.close(); 
    }
}
