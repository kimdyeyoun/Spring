package com.koreait.spring.basic;

public class LgTv {
    private AppleSpeaker speaker;

    public LgTv() {
        System.out.println("---LgTv Created---");
        speaker = new AppleSpeaker();
    }

    public void volumeUp() {
        //소리크기 : ?
        speaker.speakUp();
        System.out.printf("소리크기 : %d\n", speaker.getVolume());
    }

    public void volumeDown() {
        //소리크기 : ?
        speaker.speakDown();
        System.out.printf("소리크기 : %d\n", speaker.getVolume());
    }
}
