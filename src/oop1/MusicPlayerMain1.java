package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //음악 플레이어 켜기
        isOn = true;
        System.out.println("시작합니다.");

        //볼륨 증가
        volume++;
        System.out.println("volume = " + volume);

        //볼륨 증가
        volume++;
        System.out.println("volume = " + volume);

        //볼륨 감소
        volume--;


        //상태 확인
        if (isOn) {
            System.out.println("on");
            System.out.println("volume = " + volume);
        } else {
            System.out.println("off");
        }
        //종료
        isOn = false;
        System.out.println("종료");


    }
}
