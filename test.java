package baithuchanh2;

public class test {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("Tra" ,18, false);

        student.eat();
        student.sleep();
        student.registerCourse("English");
        student.attendClass();
        student.study();

    }
}
