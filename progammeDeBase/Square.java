public class Square extends Shape {
    private double cote;

    public Square(double cote) {
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public double perimetre() {
        return (cote * 4);
    }

    public double area() {
        return (cote * cote);
    }
}
