package Project.example2;

// 해야할것
// 계산기 기능을 Calculator에서 가져와서 사용하기.
// Calculator클래스에서 calculate 를 구현하기. (계산식을 다 calcutale에서 추가하면 될듯[Switch문])
// removeResult기능 추가하기.(맨 처음 히스토리 삭제하는 기능)

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 입력 Scanner
        Scanner scanner = new Scanner(System.in);

        // 계산기 클래스 Calculator
        Calculator calculator = new Calculator();

        String exit = "종료";
        String history = "이전기록";
        String view = "이전기록보기";
        String remove = "기록삭제";
        String back = "돌아가기";
        String calculatingMachine = "계산기";

        String messageNum1 = "첫번째 수를 입력해주세요(0또는 양의정수): ";
        String messageNum2 = "두번째 수를 입력해주세요(0또는 양의정수): ";
        String divMsg1 = "분자에 들어갈 수를 입력해주세요(0또는 양의정수): ";
        String divMsg2 = "분모에 들어갈 양수를 입력해주세요(0 불가): ";
        String modMsg1 = "나누어질 수를 입력해주세요(0또는 양의정수): ";
        String modMsg2 = "나눌 수를 입력해주세요(0 불가): ";

        int num1;
        int num2;
        double result;

        // 계산기 반복문
        while (true){
            System.out.print("기능을 선택하세요 ( 1. 계산기 | 2. 이전기록 | 3. 종료)");
            String firstInput = scanner.nextLine().trim();

            if (firstInput.isEmpty()) {
                System.out.println("입력이 비어있습니다. 다시 입력해주세요.");
                continue;
            }

            // 종료
            if (firstInput.equals(exit)) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            // 이전기록
            else if (firstInput.equals(history)) {
                while (true) {
                    System.out.println("이전기록을 선택하셨습니다.");
                    System.out.print("기능을 선택하세요 ( 1. 이전기록보기 | 2. 기록 삭제 | 0. 돌아가기)");
                    String historyFunction = scanner.nextLine().trim();

                    // 이전 기록 출력
                    if (historyFunction.equals(view)) {
                        System.out.println();
                        System.out.println("==== 이전 계산 히스토리 ====");
                        System.out.println();
                        for (int i = 0; i < calculator.getHistory().size(); i++) {
                            System.out.println(calculator.getHistory().get(i));
                        }
                        System.out.println("=========================");
                        System.out.println();
                        break;
                    }

                    // 이전 기록 삭제
                    else if (historyFunction.equals(remove)) {
                        calculator.removeResult();
                        break;
                    }

                    // 이전으로 돌아가기
                    else if (historyFunction.equals(back)) {
                        // 이전으로 돌아가기
                        System.out.println("돌아가기를 선택하셨습니다.");
                        break;
                    }

                    // 입력이 비어있을 경우
                    else if (historyFunction.isEmpty()) {
                        System.out.println("입력이 없습니다. 다시 입력해주세요. ");
                    }

                    // 입력 오류
                    else {
                        System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
                    }
                }
                continue;
            }

            // 계산기
            else if (firstInput.equals(calculatingMachine)) {
                System.out.println("계산기를 선택하셨습니다.");

                String signInput;

                while (true) {
                    System.out.print("계산할 연산자를 입력하세요. (+, -, X, /, %): ");
                    signInput = scanner.nextLine().trim();

                    // 유효성 검사
                    if (signInput.length() != 1 || !signInput.matches("[+\\-Xx/%]")) {
                        System.out.println("잘못된 연산자입니다. 연산자는 +, -, X, /, % 중에서만 입력 가능합니다.");
                        continue;
                    } else {
                        break;
                    }
                }

                // char로 변환
                char sign = signInput.charAt(0);

                num1 = 0;
                num2 = 0;
                result = 0;

                if (sign == '/') {
                    num1 = getInput(scanner, divMsg1);
                    num2 = getPositiveInput(scanner, divMsg2);
                } else if (sign == '%') {
                    num1 = getInput(scanner, modMsg1);
                    num2 = getPositiveInput(scanner, modMsg2);
                } else  {
                    num1 = getInput(scanner, messageNum1);
                    num2 = getInput(scanner, messageNum2);
                }

                result = calculator.calculate(num1, num2, sign);
                System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
                System.out.println();
            }
            else {
                System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
                continue;
            }
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

