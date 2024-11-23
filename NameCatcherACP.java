import java.util.ArrayList;

public class NameCatcherACP {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Shlok.");
        names.add("Raj");
        names.add("Rohit");
        names.forEach((x) -> {
            System.out.println(x);
        });
        names.forEach(x -> {
            if (x == "Virat")
                System.out.println("Found Virat!");
        });

    }
}
