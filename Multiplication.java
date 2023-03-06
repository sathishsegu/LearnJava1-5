import java.util.Scanner;
public class Multiplication {
    public static void main(String args[]){
        Scanner S = new Scanner(System.in);
        float n1,n2,mult;
        System.out.println("Enter n1: ");
        n1 = S.nextFloat();
        System.out.println("Enter n2: ");
        n2 = S.nextFloat();
        mult = n1*n2;
        System.out.println("multiplication of "+ n1 + " & "+ n2 +" is: "+mult);
        S.close();
    }
}
