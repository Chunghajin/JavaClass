package org.dimigo.basic;

import java.util.Random;

public class Condition {
    public static void main(String[] args) {
        // if문
        // 선거권 연령 : 만 19세
        int age = 17;

        if (age >= 19) {
            System.out.println("투표하러 가세요");
        } else {
            System.out.println("선거권이 없네요");
        }


        //주사위 랜덤뽑기 스위치

        int num = new Random().nextInt(6) + 1;
        System.out.println(num);

        switch (num % 2) {
            case 0:
                System.out.println("짝수입니다");
                break;
            case 1:
                System.out.println("홀수입니다");
                break;
        }

        String menu = "냉면";
        switch(menu) {
            case "냉면":
                System.out.println("냉면 선택");
                break;
            case "라면":
                System.out.println("라면 선택");
                break;
            default:
                System.out.println("다이어트 중");
        }
    }
}




