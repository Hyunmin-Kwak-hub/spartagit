package Project.example2;

import java.util.ArrayList;

public class Calculator {

    // 속성
    private int num1;
    private int num2;
    private char formula;
    private double result;
    private ArrayList<String> history;

    // 생성자
    public Calculator() {
        history = new ArrayList<>();
    }

    // 게터
    public double getNum1() {
        return num1;
    }
    public double getNum2() {

        return num2;
    }
    public ArrayList<String> getHistory() {
        return history;
    }

    // 세터
    public void setNum1(int num1) {

        this.num1 = num1;
    }
    public void setNum2(int num2) {

        this.num2 = num2;
    }

    // 기능
    // 계산 기능
    public double calculate(int num1, int num2, char sign) {

        switch (sign) {
            case '+':
                result = num1 + num2;
                formula = '+';
                break;
            case '-':
                result = num1 - num2;
                formula = '-';
                break;
            case 'X':
                result = num2 * num2;
                formula = 'X';
                break;
            case 'x':
                result = num2 * num2;
                formula = 'X';
                break;
            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2;
                    formula = '/';
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    formula = '%';
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }

        // history 추가
        history.add(num1 + " " + formula + " " + num2 + " = "  + result);

        return  result;
    }

    // 히스토리에서 가장 오래된 기록 제거 기능
    public void removeResult() {
        if (!history.isEmpty()) {
            history.remove(0);
            System.out.println("가장 오래된 기록이 삭제되었습니다.");
        } else {
            System.out.println("이전 계산 기록이 없습니다.");
        }
    }
}
