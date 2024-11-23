import java.util.ArrayList;

public class AnimalArray {
public static void main(String[] args){
    ArrayList<String> animals = new ArrayList<>();
    animals.add("Lion");
    animals.add("Bird");
    animals.add("Fish");
         System.out.println("==========Printing Current Array==========");
    System.out.println(animals);
         animals.clear();
         System.out.println("==========Printing Cleared Array==========");
         System.out.println("Empty array: "+animals);
         if (animals.isEmpty()){
            System.out.println("Array is empty");

         }
         else{
             System.out.println("Array is not empty");
         }
         animals.add("Lion");
    animals.add("Bird");
    animals.add("Fish");
         System.out.println("Size of the array: "+animals.size());
         System.out.println("Adding more elements:"+ animals.add("Dog"));
         System.out.println(animals);
         animals.remove(2);
         System.out.println(animals);

}
    
}
