package com.koreait.spring.basic;

public class SamsungTv {
    private HamanSpaeker speaker;

    public SamsungTv() {
        System.out.println("---SamsungTv Created---");
        speaker = new HamanSpaeker();
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
