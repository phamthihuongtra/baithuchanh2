package baithuchanh2;

class StudentImpl extends People  implements Student
{
    public StudentImpl(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    @Override
    void eat() {
        System.out.println("Dang an banh my");
    }

    @Override
    void sleep() {
        System.out.println("dang ngu cam lam phien");
    }

    @Override
    void study() {
        System.out.println("cut cho bo may hoc");
    }

    @Override
    public void registerCourse(String course) {
        System.out.println("Tieng Em");
    }

    @Override
    public void attendClass() {
        System.out.println("chiu");
    }
}
