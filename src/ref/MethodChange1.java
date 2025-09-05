package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 a = " + a);
        changePrimitive(a); //a의 값만 복사해서 x한테 값만 넘김.
        System.out.println("메서드 호출 후 a = " + a);
    }

    public static void changePrimitive(int x) {
        x = 20;
    }
}
