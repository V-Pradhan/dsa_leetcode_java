import java.util.*;

public class add_num_2235 {

    public static int sum(int num1, int num2){
        if(-100<=num1 && num2<=100){
            return num1+num2;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("The sum is: "+sum(num1, num2));

    }
    
}
