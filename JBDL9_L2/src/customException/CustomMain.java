package customException;

import java.util.ArrayList;
import java.util.List;

public class CustomMain {

    public static void main(String[] args) throws AgeNotEligible{
        List<String> list = new ArrayList<>();
        list.add("23"); // add method is abstract

        throw new AgeNotEligible("Age is Not Eligible");



    }
}
