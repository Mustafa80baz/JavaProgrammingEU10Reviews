package Day39PracticeTask.AnimalTask;

public class Python  extends WildAnimal{
    public Python(String name, String breed, char gender, int age, char size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }
    public void swallow(){
        System.out.println(" can swallow a rabit");
    }
}
