package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        //음악 플레이어 켜기
        player.on();

        //볼륨 증가
        player.VolumeUp();

        //볼륨 증가
        player.VolumeUp();

        //볼륨 감소
        player.VolumeDown();

        //상태 확인
        player.playerStatus();

        //종료
        player.off();
    }
}
