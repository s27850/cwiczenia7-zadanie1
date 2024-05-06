public class Rectangle implements Figure {
    public double bokA;
    public double bokB;

    public Rectangle(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }


    public double getObwod() {
        return 2*bokA + 2*bokB;
    }

    public double getPole(){
        return bokA*bokB;
    }

    public String getTyp(){
        return "Rectangle";
    }

}
