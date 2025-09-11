package construct;

public class MethodInitMain2Review {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "멤버1", 15, 30);

        MemberInit member2 = new MemberInit();
        initMember(member2, "멤버2", 18, 50);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age
             + ", 성적: " + s.grade);

        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
