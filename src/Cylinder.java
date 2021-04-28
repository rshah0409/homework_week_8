public class Cylinder extends Circle {   //this is child class of circle.single inheritance.

      double height;               //variable

      public Cylinder(double radius,double height){    //constructor with args.
          super(radius);                              //calling parent class constructor with keyword super.
          if(height<0){                             //if else statement.

               this.height=0;
          }else{

              this.height=height;
          }

      }

    public double getHeight() {
        return height;
    }     //method with return type.
    public double getVolume(){
          double volume = super.getArea()*height;    //calling parent class method with keyword super.
          return volume;
    }

}
