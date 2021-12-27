package com.koreait.spring.basic;

public class AppleSpeaker {
    private int volume;
    private final int Max_Volume;

    public AppleSpeaker(){
        System.out.println("---AppleSpeaker Created---");
        Max_Volume = 30;
    }
    //volume 1올린다 maxVolume값보다 커지면안된다
    public void speakUp(){
        if (volume < Max_Volume){
            volume ++;
        }
    }

    //volume 1내린다 0보다 작아지면안된다
    public void speakDown() {
        if (volume > 0){
            volume --;
        }
    }

    //volume getter 작성
    public int getVolume(){
        return volume;
    }

    //volume setter 작성
//    public void setVolume(int volume){
//        this.volume = volume;
//    }
}
