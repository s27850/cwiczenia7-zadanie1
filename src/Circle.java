public class Circle implements Figure {
    public double promien;
    public Circle (double radius){
        this.promien = radius;
    }

    public double getObwod(){
        return 2*promien*Math.PI;
    }

    public double getPole(){
        return promien*promien*Math.PI;
    }

    public String getTyp(){
        return "Circle";
    }

}
