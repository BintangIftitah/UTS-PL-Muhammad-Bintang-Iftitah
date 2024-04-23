public class Cuboid {
    private double edgeA;
    private double edgeB;
    private double edgeC;

    public Cuboid(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    public double calculateSurfaceArea() {
        double surfaceArea = 2 * ((edgeA * edgeB) + (edgeA * edgeC) + (edgeB * edgeC));
        return surfaceArea;
    }
}
