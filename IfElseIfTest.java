public class IfElseIfTest {
    public static void main(String[] args) {
        //Q. 80점 이상의 학생 중에서 90점 이상은 A반, 85점 이상은 B반, 그렇지 않으면 C반으로 편성하고 점수가 80미만이면 불합격 처리하는 프로그램을 작성하시오
        // 단, 점수는 0~100사이 값으로 입력받는다.
        System.out.println("점수를 입력하시오");
        int a = 95;
        if (a>=90){
            System.out.println("A반 입니다");
        } else if (a<=90&&a>=85) {
            System.out.println("B반 입니다");
        } else if (a<=85&&a>=80) {
            System.out.println("C반 입니다");
        } else {
            System.out.println("불합격입니다");
        }
    }
}
