public class CarpetMain {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor17 floor = new Floor17(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor17(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

    }










}
