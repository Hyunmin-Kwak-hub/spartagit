package Project.example2;

public class Calculator {

    // 속성
    public int num1 = 0; // 첫번째 수
    public int num2 = 0; // 두번째 수

    // 생성자
    public Calculator(int num1, int num2) {
        this.num1 = num1;
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

}
