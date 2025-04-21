package Project.example1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        String sum = "+";
//        String sub = "-";
//        String mul = "X";
//        String div = "/";
//        String mod = "%";
        String exit = "exit";

        int num1;
        int num2;
        int result;


        // 계산기 반복문
        for (;;) {
            System.out.print("계산 기호 입력(ex: +, -, X, /, %) 종료하려면 exit입력: ");
            String input = scanner.nextLine();

            // 탈출부분
            if (input.equals(exit)) {
                System.out.println("계산기를 종료합니다.");
                return;
            }

            // 입력이 비었을 경우
            if (input.isEmpty()) {
                System.out.println("입력이 비어있습니다. 다시 입력해주세요.");
                continue;
            }

            char res = input.charAt(0); // 응답을 charAt(0)으로 저장

            num1 = 0;
            num2 = 0;
            result = 0;

            switch (res) {
                case '+':
                    System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                    num1 = scanner.nextInt();

                    if (num1 < 0) {
                        for (;;) {
                            num1 = 0;
                            System.out.println("음의 정수는 입력이 불가합니다.\n 다시 입력해주세요");
                            System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                            num1 = scanner.nextInt();

                            if (num1 >= 0){
                                break;
                            }
                        }
                    }
                    System.out.print("두번째 숫자를 입력해주세요(0, 양의정수): ");
                    num2 = scanner.nextInt();

                    scanner.nextLine();
                    if (num2 < 0) {
                        for (;;) {
                            num2 = 0;
                            System.out.println("음의 정수는 입력이 불가합니다.\n 다시 입력해주세요");
                            System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                            num2 = scanner.nextInt();

                            if (num2 >= 0){
                                break;
                            }
                        }
                    }


                    result = num1 + num2;

                    System.out.println(num1 + " + " + num2 + " = " + result);

                    break;

                case '-':
                    System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                    num1 = scanner.nextInt();
                    if (num1 < 0) {
                        for (;;) {
                            num1 = 0;
                            System.out.println("음의 정수는 입력이 불가합니다.\n 다시 입력해주세요");
                            System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                            num1 = scanner.nextInt();

                            if (num1 >= 0){
                                break;
                            }
                        }
                    }
                    System.out.print("두번째 숫자를 입력해주세요(0, 양의정수): ");
                    num2 = scanner.nextInt();

                    scanner.nextLine();
                    if (num2 < 0) {
                        for (;;) {
                            num2 = 0;
                            System.out.println("음의 정수는 입력이 불가합니다.\n 다시 입력해주세요");
                            System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                            num2 = scanner.nextInt();

                            if (num2 >= 0){
                                break;
                            }
                        }
                    }

                    result = num1 - num2;

                    System.out.println(num1 + " - " + num2 + " = " + result);

                    break;

                case 'X':
                    System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                    num1 = scanner.nextInt();
                    if (num1 < 0) {
                        for (;;) {
                            num1 = 0;
                            System.out.println("음의 정수는 입력이 불가합니다.\n 다시 입력해주세요");
                            System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                            num1 = scanner.nextInt();

                            if (num1 >= 0){
                                break;
                            }
                        }
                    }
                    System.out.print("두번째 숫자를 입력해주세요(0, 양의정수): ");
                    num2 = scanner.nextInt();

                    scanner.nextLine();
                    if (num2 < 0) {
                        for (;;) {
                            num2 = 0;
                            System.out.println("음의 정수는 입력이 불가합니다.\n 다시 입력해주세요");
                            System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                            num2 = scanner.nextInt();

                            if (num2 >= 0){
                                break;
                            }
                        }
                    }

                    result = num1 * num2;

                    System.out.println(num1 + " X " + num2 + " = " + result);

                    break;

                case '/':

                    System.out.print("분자를 입력해주세요(0, 양의정수): ");
                    num1 = scanner.nextInt();
                    if (num1 < 0) {
                        for (;;) {
                            num1 = 0;
                            System.out.println("음의 정수는 입력이 불가합니다.\n 다시 입력해주세요");
                            System.out.print("분자를 입력해주세요(0, 양의정수): ");
                            num1 = scanner.nextInt();

                            if (num1 >= 0){
                                break;
                            }
                        }
                    }
                    System.out.print("분모를 입력해주세요(0, 양의정수): ");
                    num2 = scanner.nextInt();

                    if (num2 <= 0) {
                        num2 = 0;
                        for (;;) {
                            System.out.println("분모는 0보다 작을 수 없습니다. 다시 입력해주세요.");
                            System.out.print("분모를 입력해주세요(0, 양의정수): ");
                            num2 = scanner.nextInt();

                            if (num2 > 0) {
                                break;
                            }

                            scanner.nextLine();
                        }
                    }

                    double div = (double)num1 / (double)num2;

                    System.out.println(num1 + " / " + num2 + " = " + result);

                    break;

                case '%':
                    System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                    num1 = scanner.nextInt();
                    if (num1 < 0) {
                        for (;;) {
                            num1 = 0;
                            System.out.println("음의 정수는 입력이 불가합니다.\n 다시 입력해주세요");
                            System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                            num1 = scanner.nextInt();

                            if (num1 >= 0){
                                break;
                            }
                        }
                    }
                    System.out.print("두번째 숫자를 입력해주세요(0, 양의정수): ");
                    num2 = scanner.nextInt();

                    scanner.nextLine();
                    if (num2 < 0) {
                        for (;;) {
                            num2 = 0;
                            System.out.println("음의 정수는 입력이 불가합니다.\n 다시 입력해주세요");
                            System.out.print("첫번째 숫자를 입력해주세요(0, 양의정수): ");
                            num2 = scanner.nextInt();

                            if (num2 >= 0){
                                break;
                            }
                        }
                    }

                    result = num1 % num2;

                    System.out.println(num1 + " % " + num2 + " = " + result);

                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                    break;

            }
            System.out.println();
        }
    }
}
