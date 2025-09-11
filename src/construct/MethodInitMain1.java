package construct;

public class MethodInitMain1 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "멤버1";
        member1.age = 20;
        member1.grade = 30;

        MemberInit member2 = new MemberInit();
        member2.name = "멤버2";
        member2.age = 50;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age
             + ", 성적: " + s.grade);

        }
    }
}
