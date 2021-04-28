public class Carpet {




    //floor,carpet and calculator class in method overriding concept of methodover riding.

    double cost;      //instance variable.
    public Carpet(double cost) {    //constructor
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }
    public double getCost(){

      //mehthod.
       return this.cost;

    }






}
