class Main1 {
    public static void main(String[] er) {
        Child x = new Child();
        x.Naming("Shlok");
        x.ageN(14);
        String name;
    }
}public class Parent {
    int age,id;
    String name;
    void Naming(String name){
        System.out.println("Name: "+name);
    }

    
}
class Child extends Parent{
    void ageN(int age)
    void name(String name)
    {
        System.out.println("The age of student "+name+" is "+age);

    }
}
