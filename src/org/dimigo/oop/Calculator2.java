package org.dimigo.oop;

public class Calculator2 {
    private boolean powerFlag;
    public static double PI = 3.141592;

    /* 인스턴스 메소드 */
    public void powerOn() {
      if(powerFlag == false) {
          System.out.println("전원을 켭니다");
          powerFlag = true;
        }

    }

        public void powerOff() {
        if(this.powerFlag == true) {
            System.out.println("전원을 끕니다");
            this.powerFlag = false;
        }
    }

    public static int add(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1+num2;
    }

    public static int sub(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 - num2;
    }

    public static int mul(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 * num2;
    }

    public static double div(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return (double)num1 / num2;
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
