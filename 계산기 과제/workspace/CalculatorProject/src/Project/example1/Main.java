package Project.example1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String request = null;

        String sum = "+";
        String sub = "-";
        String mul = "X";
        String div = "/";
        String mod = "%";
        String exit = "exit";


        for (;;) {
            System.out.print("계산 기호 입력(ex: +, -, X, /) 종료하려면 exit입력: ");
            String res1 = scanner.nextLine();
            if (res1.equals(exit)) {
                return;
            }

            int num1 =0;
            int num2 =0;
            int result = 0;

            switch (res1) {
                case sum:
                    System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                    num1 = scanner.nextInt();
                    System.out.print("두번째 숫자를 입력해주세요(0, 양의정수): ");
                    num2 = scanner.nextInt();

                    result = num1 + num2;

                    System.out.println(num1 + "+" + num2 + "= " + result);

                    break;

                case sub:
                    System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                    num1 = scanner.nextInt();
                    System.out.print("두번째 숫자를 입력해주세요(0, 양의정수): ");
                    num2 = scanner.nextInt();

                    result = num1 - num2;

                    System.out.println(num1 + "+" + num2 + "= " + result);

                    break;

                case mul:
                    System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                    num1 = scanner.nextInt();
                    System.out.print("두번째 숫자를 입력해주세요(0, 양의정수): ");
                    num2 = scanner.nextInt();

                    result = num1 * num2;

                    System.out.println(num1 + "+" + num2 + "= " + result);

                    break;

                case div:
                    System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                    num1 = scanner.nextInt();
                    System.out.print("두번째 숫자를 입력해주세요(0, 양의정수): ");
                    num2 = scanner.nextInt();

                    result = num1 / num2;

                    System.out.println(num1 + "+" + num2 + "= " + result);

                    break;

                case mod:
                    System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                    num1 = scanner.nextInt();
                    System.out.print("두번째 숫자를 입력해주세요(0, 양의정수): ");
                    num2 = scanner.nextInt();

                    result = num1 % num2;

                    System.out.println(num1 + "+" + num2 + "= " + result);

                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                    break;


            }
        }

    }
}
