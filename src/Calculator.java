public class Calculator {
    Floor17 floor;        //variable names are same here
    Carpet carpet;       //variable qname is same as class name.
    public Calculator(Floor17 floor, Carpet carpet){            //constructor with arguments.

        this.floor=floor;
        this.carpet=carpet;
    }
    public double getTotalCost(){                           //   calling methods from florr calss and carpet class.
        return floor.getArea() * carpet.getCost();

    }












}
