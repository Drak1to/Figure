import java.util.ArrayList;
import java.util.List;

public class ComparatorOfAreas {

    List<GeometricFigure> geometricFigures = new ArrayList<>();
private String nameOfComparator;

    public ComparatorOfAreas(String nameOfComparator) {
        this.geometricFigures = geometricFigures;
        this.nameOfComparator = nameOfComparator;
    }

    public List<GeometricFigure> getGeometricFigures() {
        return geometricFigures;
    }

    @Override
    public String toString() {
        return "ComparatorOfAreas{" +
                "geometricFigures=" + geometricFigures +
                ", nameOfComparator='" + nameOfComparator + '\'' +
                '}';
    }

    public void setGeometricFigures(List<GeometricFigure> geometricFigures) {
        this.geometricFigures = geometricFigures;
    }

    public String getNameOfComparator() {
        return nameOfComparator;
    }

    public void setNameOfComparator(String nameOfComparator) {
        this.nameOfComparator = nameOfComparator;
    }

    public void getLargestArea() {
        GeometricFigure largestArea = null;
        int max = 0;
        for (GeometricFigure g : geometricFigures) {
            if (g.calculateArea() > max) {
                largestArea = g;
                max = g.calculateArea();

            }

        }
        if (largestArea != null) {
            System.out.println("The largest area is " + largestArea);
        } else {
            System.out.println("The largest area is doesnt founded ");
        }
    }
}