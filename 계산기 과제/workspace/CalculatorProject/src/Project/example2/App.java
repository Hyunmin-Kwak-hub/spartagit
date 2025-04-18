package Project.example2;

// 해야할것
// 계산기 기능을 Calculator에서 가져와서 사용하기.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 입력 Scanner
        Scanner scanner = new Scanner(System.in);

        // 계산기 클래스 Calculator
        Calculator calculator = new Calculator();

        String request = null;

//        String sum = "+";
//        String sub = "-";
//        String mul = "X";
//        String div = "/";
//        String mod = "%";
        String exit = "exit";
        String history = "이전기록";

        int num1;
        int num2;
        double result;
        

        // 계산기 반복문
        while (true){
            System.out.print("계산 기호(ex: +, -, X, /, %)또는 '이전기록' 입력 종료하려면 exit입력: ");
            String input = scanner.nextLine();

            // 탈출부분
            if (input.equals(exit)) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            // 이전기록 출력
            if (input.equals(history)) {
                System.out.println();
                System.out.println("==== 이전 계산 히스토리 ====");
                for (int i = 0; i < calculator.getHistory().size(); i++) {
                    System.out.println(calculator.getHistory().get(i));
                }
                continue;
            }

            // 입력이 비었을 경우
            if (input.isEmpty()) {
                System.out.println("입력이 비어있습니다. 다시 입력해주세요.");
                continue;
            }

            char res = input.charAt(0); // 응답을 charAt(0)으로 저장

            num1 =0;
            num2 =0;
            result = 0;

            String messageNum1 = "첫번째 수를 입력해주세요(0또는 양의정수): ";
            String messageNum2 = "두번째 수를 입력해주세요(0또는 양의정수): ";

            switch (res) {
                case '+':
                    num1 = getInput(scanner, messageNum1);
                    num2 = getInput(scanner, messageNum2);

                    result = calculator.sum(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + (int) result);
                    break;

                case '-':
                    num1 = getInput(scanner, messageNum1);
                    num2 = getInput(scanner, messageNum2);

                    result = calculator.sub(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + (int) result);
                    break;

                case 'X':
                    num1 = getInput(scanner, messageNum1);
                    num2 = getInput(scanner, messageNum2);

                    result = calculator.mul(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + (int) result);
                    break;

                case '/':
                    String divMsg1 = "분자에 들어갈 수를 입력해주세요(0또는 양의정수): ";
                    num1 = getInput(scanner, divMsg1);
                    String divMsg2 = "분모에 들어갈 양수를 입력해주세요(0 불가): ";
                    num2 = getPositiveInput(scanner, divMsg2);

                    result = calculator.div(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;

                case '%':
                    String modMsg1 = "나누어질 수를 입력해주세요(0또는 양의정수): ";
                    num1 = getInput(scanner, modMsg1);
                    String modMsg2 = "나눌 수를 입력해주세요(0 불가): ";
                    num2 = getPositiveInput(scanner, modMsg2);

                    result = calculator.mod(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + (int) result);
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                    break;

            }
            System.out.println();
        }
    }

    // 0혹은 양의정수만 받는 함수
    private static int getInput(Scanner scanner, String message) {
        int inputNum;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()){
                inputNum = scanner.nextInt();
                if (inputNum >= 0) {
                    scanner.nextLine();
                    return inputNum;
                } else {

                    System.out.println("0 또는 양수만 입력이 가능합니다. 다시 시도해주세요.");
                    scanner.nextLine(); // 잘못된 입력 제거
                }
            } else {
                System.out.println("허용된 범위내에 정수(0또는 양수)만 입력 가능합니다. 다시 시도해주세요.");
                scanner.next(); // 잘못된 입력 소비
            }
        }
    }

    // 0 불가 양의정수만 받는 함수
    // 0혹은 양의정수만 받는 함수
    private static int getPositiveInput(Scanner scanner, String message) {
        int inputNum;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()){
                inputNum = scanner.nextInt();

                if (inputNum > 0) {
                    scanner.nextLine();
                    return inputNum;
                } else {
                    System.out.println("양수만 입력이 가능합니다. 다시 시도해주세요.");
                    scanner.nextLine(); // 잘못된 입력 제거
                }
            } else {
                System.out.println("허용된 범위내에 정수(0또는 양수)만 입력 가능합니다. 다시 시도해주세요.");
                scanner.next(); // 잘못된 입력 소비
            }
        }
    }
}

