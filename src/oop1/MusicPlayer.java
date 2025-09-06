package oop1;

public class MusicPlayer {

    int volume;
    boolean isOn;

    void off() {
        isOn = false;
        System.out.println("종료합니다.");
    }

    void on() {
        isOn = true;
        System.out.println("시작합니다.");
    }

    void VolumeUp() {
        volume++;
        System.out.println("volume = " + volume);
    }

    void VolumeDown() {
        volume--;
        System.out.println("volume = " + volume);
    }

    void playerStatus() {
        if (isOn) {
            System.out.println("volume" + volume);
            System.out.println("ison");
        } else {
            System.out.println("off");
        }
    }
}
