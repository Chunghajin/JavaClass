package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        // 1.string
        String str = "디미고 ";
        str += "2학년 ";
        str += "6반 ";
        str += "정하진 ";

        // 2.StringBuilder
        StringBuilder sb = new StringBuilder("디미고 ");
        sb.append("2학년 ").append("6반 ").append("김종수");

        System.out.println(sb.toString());
        System.out.println(sb);

        //속도 비교 메소드
        compareSpeed();
    }

    private static  void compareSpeed() {
        long start = System.currentTimeMillis();


       String str = "abc";
       StringBuffer sb = new StringBuffer("abc");
       StringBuilder sb2 = new StringBuilder("abc");
       for(int i=0;i<1000000;i++) {
           sb2.append("def");
       }

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        }
    }
