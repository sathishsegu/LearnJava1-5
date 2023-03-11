public class fibonacci {
    public static void main(String args[]){
        int i,n1=0,n2=1,n3;
        System.out.println(n1);
        System.out.println(n2);
        for(i=1;i<=10;i++){
            n3 = n1+n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            // comment is added to this file
        }
        }
    }
