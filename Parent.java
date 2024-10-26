class Main1 {

    public static void main(String[] er) {

        Child x = new Child();

        x.Naming("Shlok");

        x.ageN(14);

    }

}

class Parent {

    int age, id;

    String name;

    void Naming(String name) {

        this.name = name; // Store the name in the instance variable

        System.out.println("Name: " + name);

    }

}

class Child extends Parent {

    void ageN(int age) {

        System.out.println("The age of student " + name + " is " + age);

    }

}
