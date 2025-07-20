package customException;

public class CustomMain {

    public static void main(String[] args) throws AgeNotEligible{
        throw new AgeNotEligible("Age is Not Eligible");
    }
}
