class NotEligibleForEngineering extends RuntimeException {
    public NotEligibleForEngineering(String s) {
        super(s);
    }
}
class NotEligibleForVJIT extends RuntimeException {
    public NotEligibleForVJIT(String s) {
        super(s);
    }
}
public class TSEngineeringAdmission {
    public static void main(String[] args) {
        try {
            int score = Integer.parseInt(args[0]);
            if (score < 50) {
                throw new NotEligibleForEngineering("Sorry! You are not eligible for Engineering.");
            } else if (score < 70) {
                throw new NotEligibleForVJIT("Sorry! You are eligible for Engineering but not for VJIT.");
            } else {
                System.out.println("Welcome to VJIT - Thanks For Your Registration!");
            }
        } catch (NotEligibleForEngineering | NotEligibleForVJIT e) {
            e.printStackTrace();     
            System.out.println(e.getMessage());
            System.out.println(e.toString());   
        }
        System.out.println("Rest of the Code");
    }
}