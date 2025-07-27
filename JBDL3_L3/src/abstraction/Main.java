package abstraction;

public class Main {

    public static void main(String[] args) {
        Bank bank = new HDFCBank();
        bank.loanProcedure();

        System.out.println(calculateArea(new Circle()));

    }

    public static double calculateArea(Shape shape){
        return shape.area();
    }
}
