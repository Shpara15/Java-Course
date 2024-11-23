import java.util.Scanner;

public class Intern {
    public static Candidate getCandidateDetails() throws InvalidInternException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the candidate details.");
        System.out.println("NAME:");
        String name = scanner.next();
        System.out.println("GENDER:");
        String gender = scanner.next();

        System.out.println("Enter percentage in tenth.");
        int percentage = scanner.nextInt();

        if (percentage < 50) {
            throw new InvalidInternException("Registration failed. Mark cannot be below 50%.");
        }
        else{
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setPercentage(percentage);
            return candidate;
        }


    }
    public static void main(String[] args){
        System.out.println("Welcome to Intern Hiring tool.");

        try{
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration successful.");

        } catch(InvalidInternException e){
            System.out.println(e.getMessage());
        }
    }
}

public class Candidate{
    private String name;
    private S
}