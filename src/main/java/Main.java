import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("3. 곱하기");
            System.out.println("4. 나누기");
            System.out.println("5. 나머지");
            System.out.println("q. 종료");
            System.out.print(">> ");

            String op = scanner.nextLine();

            System.out.print("피연산자 1 >> ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("피연산자 2 >> ");
            int b = Integer.parseInt(scanner.nextLine());

            switch (op) {
                case "1":
                    plus(a,b);
                    break;
                case "2":
                    minus(a,b);
                    break;
                case "3":
                    multifly(a,b);
                    break;
                case "4":
                    divide(a,b);
                    break;
                case "5":
                    modulo(a,b);
                    break;
                case "q":
                    return;
            }


        }
    }

    private static void plus(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    private static void minus(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }
    private static void multifly(int a, int b) {
       // System.out.println(a + " * " + b + " = " + (a * b));
    }
    private static void divide(int a, int b) {
       // System.out.println(a + " / " + b + " = " + (a / b));
    }
    private static void modulo(int a, int b) {
       // System.out.println(a + " % " + b + " = " + (a % b));
    }
}

