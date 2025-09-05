package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        data.isOn = true;
        System.out.println("시작합니다.");

        //볼륨 증가
        data.volume++;
        System.out.println("volume = " + data.volume);

        //볼륨 증가
        data.volume++;
        System.out.println("volume = " + data.volume);

        //볼륨 감소
        data.volume--;


        //상태 확인
        if (data.isOn) {
            System.out.println("on");
            System.out.println("volume = " + data.volume);
        } else {
            System.out.println("off");
        }
        //종료
        data.isOn = false;
        System.out.println("종료");
    }
}
