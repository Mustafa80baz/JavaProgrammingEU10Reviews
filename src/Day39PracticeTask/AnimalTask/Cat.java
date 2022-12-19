package Day39PracticeTask.AnimalTask;

public class Cat extends FriendlyAnimal {

    public Cat(String name, String breed, char gender, int age, char size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }
    public void scratch(){
        System.out.println(getName()+"is scratghing");
    }
    public void meow(){
        System.out.println(getName()+" is meowing");
    }

}