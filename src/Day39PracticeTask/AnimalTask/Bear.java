package Day39PracticeTask.AnimalTask;

public class Bear extends WildAnimal{
    public Bear(String name, String breed, char gender, int age, char size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }
    public void fishing(){
        System.out.println("is fishing");
    }
}
