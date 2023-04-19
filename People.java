package baithuchanh2;

abstract class People  {
    private String name;
    private int age;
    private boolean gender;
    public People (String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    abstract void eat();
    abstract void sleep();
    abstract void study();
}
interface Student {
    void registerCourse(String course);
    void attendClass();
}
interface Employee {
    void work();
    void takeABreak();
}

