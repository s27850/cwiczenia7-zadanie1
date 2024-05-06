public class Parallelogram implements Figure {
    public double bazowaSciana;
    public double innaSciana;
    public double wysokosc;

    public Parallelogram(double bazowaSciana, double innaSciana, double wysokosc) {
        this.bazowaSciana = bazowaSciana;
        this.innaSciana = innaSciana;
        this.wysokosc = wysokosc;
    }

    public double getObwod(){
        return 2*bazowaSciana+2*innaSciana;
    }

    public double getPole(){
        return (bazowaSciana*wysokosc)/2;
    }

    public String getTyp(){
        return "Parallelogram";
    }
}
