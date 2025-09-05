package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("호출전 dataA.value = " + dataA.value); //10
        changeReference(dataA); //dataA의 참조값을 복사해서 dataX에 넘김
        System.out.println("호출후 dataA.value = " + dataA.value); //20
    }

    public static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
