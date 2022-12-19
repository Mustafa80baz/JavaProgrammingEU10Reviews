package Day39PracticeTask.AnimalTask;

public class Dolphine extends FriendlyAnimal{
    public Dolphine(String name, String breed, char gender, int age, char size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void swim(){
            System.out.println("is swiming");
        }
    }

