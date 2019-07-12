package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        int a = 5, b = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


        //2.5가 나오게 하려면?
        System.out.println((double)a/b);

        //System.out.println(a / 0);

        int i = 10;
        double d = 3.14;
        int r = (int)(i + d);
        double r2 = i+d;

        short s1 = 1,s2=2;
        short r3 = (short)(s1 + s2);
        int r4 = s1 + s2;

        //short-circuit
        boolean flag = true;

        if(flag || (10 / 0 == 0)) {
            System.out.println("OR 연산");
        }

        if(!flag && (10 / 0 == 0)) {
            System.out.println("AND 연산");
        }

        // 문자열 연결 연산자
        String school = "디미고";
        int grade = 2;
        int ban = 6;
        String name = "정하진";

        System.out.println(school + grade + ban + name);
        System.out.println(grade + ban + school +name);

        // 문제) 디미고 26이준형
        System.out.println(grade + "" + (ban + school) +name);
    }
}
