import java.util.Scanner;
public class TextInput {
    public static void main(String args[]){
        Scanner S = new Scanner(System.in);
        String text;
        System.out.println("Enter the Text:");
        text = S.nextLine();
        System.out.println("Text entered is: "+text);
        S.close();
    }
}
