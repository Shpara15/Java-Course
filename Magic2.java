import java.util.ArrayList;

public class Magic2 {
public static void main(String[] args){
    System.out.println("=========LAMBDAS==========");
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(35);
    numbers.add(48);
    numbers.add(18);
    numbers.add(13);
    numbers.forEach( (x) -> {System.out.println(x);});
      numbers.forEach( n -> { if (n==48) System.out.println("Found 4!");});
}
    
}