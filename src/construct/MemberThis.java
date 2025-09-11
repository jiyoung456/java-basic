package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
        
        //this를 적는 코딩스타일도 있음
//        this.nameField = nameParameter;
    }
}
