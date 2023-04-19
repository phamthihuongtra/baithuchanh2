package baithuchanh2;

public class Cat extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "meo meo";
    }
    @Override
    public String howToEat(){
        return "jjj";
    }
}
