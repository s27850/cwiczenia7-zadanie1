import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        double promien = 3d;
        Figure circle = new Circle(promien);

        double bazowaSciana = 10d;
        double innaSciana = 5d;
        double wysokosc = 8d;
        Figure parallelogram = new Parallelogram(bazowaSciana, innaSciana, wysokosc);

        double bokA = 15d;
        double bokB = 10;
        Figure rectangle = new Rectangle(bokA, bokB);

        List<Figure> figures = new ArrayList<>(3);
        figures.add(circle);
        figures.add(parallelogram);
        figures.add(rectangle);

        for (Figure figure : figures) {
            System.out.println(figure.getTyp());
            System.out.println("Area: " + figure.getPole() + " units.");
            System.out.println("Perimeter: " + figure.getObwod() + " units.\n");
        }
    }
}