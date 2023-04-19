package baithuchanh2;

public class Abstracttest {
    public static void main (String[] args) {
        Animal[] animals = new Animal[1];
        animals[0] = new Cat();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Cat) {
                Edible edible = (Cat) animal;
//                Edible edible = (Cat) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
