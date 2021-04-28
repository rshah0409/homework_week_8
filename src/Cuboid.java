public class Cuboid extends Rectangle{        //its child class that extends parent class rectangle.

    double height;


    public  Cuboid(double width,double length,double height){        //constructor with args.
        super(width, length );

        if(height<0){
            this.height=0;
        }else {
            this.height=height;
        }
    }
    public double getHeight() {
        return height;
    }  //method with no parameters and with return type.

    public double getVolume(){

        //double volume= height * super.getArea();
       // return volume;
       return super.getArea()*height;          //get area method called from rectangle class with the keyword super.

    }
}
