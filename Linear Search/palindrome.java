import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(palin(num));
    }
    public static String palin(int num){
        if(num<0){
            return("Not Palindrome");
        }
        int x = num;
        int r2 = 0;
        while (num>0) {
            int r = num % 10;
            r2 = r2 *10+r;
            num = num/10;

        }
        if(x == r2){
            return ("Palindrome");
        }
        else{
            return("Not palindrome");
        }
    }
    
}
