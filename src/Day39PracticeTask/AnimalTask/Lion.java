package Day39PracticeTask.AnimalTask;

public class Lion extends WildAnimal {
    public Lion(String name, String breed, char gender, int age, char size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }
    public void hunt(){
        System.out.println("is hunting");
    }
}
