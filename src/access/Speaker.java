package access;

public class Speaker {

    //필드에 직접 접근 방지, Speaker 안에서만 접근 가능
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("최대 음량. 볼륨 증가 불가");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("음량을 10 감소");
    }

    void showVolume() {
        System.out.println("volume = " + volume);
    }

}
