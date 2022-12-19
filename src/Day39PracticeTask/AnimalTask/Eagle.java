package Day39PracticeTask.AnimalTask;

public class Eagle  extends WildAnimal{
    public Eagle(String name, String breed, char gender, int age, char size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }
    public void hightFlying(){
        System.out.println("is hight flying");
    }
}
