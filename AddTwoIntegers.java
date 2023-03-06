import java.util.Scanner;
public class AddTwoIntegers {
    public static void main(String args[]){
        int n1,n2,add;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter n1: ");
        n1 = S.nextInt();
        System.out.println("Enter n2: ");
        n2 = S.nextInt();
        add = n1 +n2;
        System.out.println("Addition of "+ n1 +" & "+ n2 +" is: "+add);
        S.close();
    }
}
