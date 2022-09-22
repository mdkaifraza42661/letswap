package programe;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter the two number ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("before swaping " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swaping " + a + " " + b);
    }
}
