package org.dimigo.oop;

public class Calculator {
    /* 인스턴스 필드 */
    private int num1;
    private int num2;
    private boolean powerFlag;

    public Calculator() {

    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /* 인스턴스 메소드 */
    public void powerOn() {
        if(this.powerFlag == false) {
            System.out.println("전원을 켭니다");
            this.powerFlag = true;
        }

     }

    public void powerOff() {
        if(this.powerFlag == true) {
            System.out.println("전원을 끕니다");
            this.powerFlag = false;
        }
    }

    public int add() {
        System.out.println(this);
        this.powerOn();
        return this.num1 + this.num2;
    }

    public int sub() {
        this.powerOn();
        return this.num1 - this.num2;
    }

    public int mul() {
        this.powerOn();
        return this.num1 * this.num2;
    }

    public double div() {
        this.powerOn();
        return (double)this.num1 / this.num2;
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        Calculator c = new Calculator(a, b);
        System.out.println(c);


        //c.powerOn();
        System.out.printf("%d + %d = %d\n",a,b,c.add());
        System.out.printf("%d - %d = %d\n",a,b,c.sub());
        System.out.printf("%d * %d = %d\n",a,b,c.mul());
        System.out.printf("%d / %d = %.1f\n",a,b,c.div());
        c.powerOff();
    }

}
