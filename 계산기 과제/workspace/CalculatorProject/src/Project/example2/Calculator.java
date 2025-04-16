package Project.example2;

public class Calculator {

    // 속성
    private int num1 = 0; // 첫번째 수
    private int num2 = 0; // 두번째 수

    // 생성자
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // 게터
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
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
        return num1 + num2;
    }
    // 빼기
    public int sub(int num1, int num2) {
        return num1 - num2;
    }
    // 곱하기
    public int mul(int num1, int num2) {
        return num1 * num2;
    }
    // 나누기
    public double div(int num1, int num2) {
        return (double)num1 / num2;
    }
    // 나머지
    public int mod(int num1, int num2) {
        return num1 % num2;
    }
}
