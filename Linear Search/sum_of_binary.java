import java.util.Scanner;

public class sum_of_binary {

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first binary number: ");
        String a = sc.nextLine();

        System.out.print("Enter second binary number: ");
        String b = sc.nextLine();

        String sum = addBinary(a, b);
        System.out.println("Binary Sum = " + sum);

        sc.close();
    }
}
