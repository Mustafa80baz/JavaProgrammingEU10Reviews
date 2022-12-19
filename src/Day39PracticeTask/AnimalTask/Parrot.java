package Day39PracticeTask.AnimalTask;

public class Parrot extends FriendlyAnimal {
    public Parrot(String name, String breed, char gender, int age, char size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }
 public void fly(){
     System.out.println("is singing");
 }
 public void sing()   {

     System.out.println("is singing");
 }

}
