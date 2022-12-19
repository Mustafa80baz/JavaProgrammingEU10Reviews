package Day39PracticeTask.AnimalTask;

public class ZoomObject {
    public static void main(String[] args) {
        Bear bear=new Bear("Polar","Holland",'F',20,'L',"white",true,false,false);
        System.out.println(bear);

        Cat cat=new Cat("gelin","tekir",'F',2,'M',"Brown",false,true,true);
        System.out.println("cat = " + cat);
cat.meow();
        Tiger tiger=new Tiger("Big Eyes","bengal",'M',4,'L',"Brown",true,false,false);
     System.out.println(bear);
        System.out.println(cat);
        System.out.println(tiger);

    }

}
