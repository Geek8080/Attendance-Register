package sample;

public class SubjectTester {
    public static void main(String []args){
        Subject sub = new Subject("Maths");

        sub.setClasses(100);
        sub.setAttended(80);
        sub.updateSt();
        System.out.print(sub.getSt());
    }
}
