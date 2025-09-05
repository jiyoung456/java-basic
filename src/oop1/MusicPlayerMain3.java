package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);

        //볼륨 증가
        up(data);

        //볼륨 증가
        up(data);

        //볼륨 감소
        down(data);

        //상태 확인
        playerStatus(data);
        //종료
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("종료합니다.");
    }

    static void up(MusicPlayerData data) {
        data.volume++;
        System.out.println("volume = " + data.volume);
    }

    static void down(MusicPlayerData data) {
        data.volume--;
        System.out.println("volume = " + data.volume);
    }

    static void playerStatus(MusicPlayerData data) {
        if (data.isOn) {
            System.out.println("volume" + data.volume);
            System.out.println("ison");
        } else {
            System.out.println("off");
        }
    }
}
