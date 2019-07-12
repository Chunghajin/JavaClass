package org.dimigo.oop;

import java.util.*;

public class Messenger {


    public Messenger() {
    }

    private int messengerSpeed;

    private float batteryEfficiency;

    private int price;

    private String design;

    private String company;

    public void sendMessege() {
        System.out.println("메시지를 보냈습니다!");
    }

    public void recieveMessege() {
        System.out.println("메시지를 받았습니다!");
    }

    public void sendEmoticon() {
        System.out.println("이모티콘을 보냈습니다!");
    }

    public void changeColor(int color) {
        System.out.println(color + "번 색깔로 변경합니다!");
    }

    public boolean exit() {
        System.out.println("종료합니다!");
        return true;
    }

}