package Project.example2;

import java.util.ArrayList;

public class Calculator {

    // 속성
    private double num1;
    private double num2;
    private String operator;
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
    // 더하기
    public int sum(int num1, int num2) {
        operator = "+";
        int result = num1 + num2;
        history.add(num1 + " " + operator + " " + num2 + " = " + result);
        return result;
    }
    // 빼기
    public int sub(int num1, int num2) {
        operator = "-";
        int result = num1 - num2;
        history.add(num1 + " " + operator + " " + num2 + " = " + result);
        return result;
    }
    // 곱하기
    public int mul(int num1, int num2) {
        operator = "X";
        int result = num1 * num2;
        history.add(num1 + " " + operator + " " + num2 + " = " + result);
        return result;
    }
    // 나누기
    public int div(int num1, int num2) {
        operator = "/";
        int result = num1 / num2;
        history.add(num1 + " " + operator + " " + num2 + " = " + result);
        return result;
    }
    // 나머지
    public int mod(int num1, int num2) {
        operator = "%";
        int result = num1 % num2;
        history.add(num1 + " " + operator + " " + num2 + " = " + result);
        return result;
    }

}
