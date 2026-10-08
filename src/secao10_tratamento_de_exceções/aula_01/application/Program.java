package secao10_tratamento_de_exceções.aula_01.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    static void main() {

        method1();

        System.out.println("End of program");
    }

    public static void method1() {
        System.out.println("***METHOD 1 START***");
        method2();
        System.out.println("***METHOD 1 END***");
    }

    public static void method2() {
        System.out.println("***METHOD 2 START***");
        Scanner sc = new Scanner(System.in);

        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);


        sc.close();
        System.out.println("***METHOD 2 END***");

    }
}
