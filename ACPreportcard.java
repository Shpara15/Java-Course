public class ACPreportcard {
    public static void main(String[] args) {
        Score result1 = new Score();
        Score result2 = new Score();
        Score result3 = new Score();

        result1.displayDetails();
        result2.displayDetails();
        result3.displayDetails();

    }
}

class Score {
    int result1;
    int result2;
    int result3;

    Score() {
        System.out.println("*****Results*****");
       result1 = 84;
        result2 = 77;
        result3 = 93;
    }

    void displayDetails() {
        System.out.println(
                "Result 1 : " + result1 + " | Result 2 :" + result2 + " | Result 3 :" + result3);
    }

}