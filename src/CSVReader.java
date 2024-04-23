import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void readCSV(String csvFile, String csvSeparator) {
        String line = "";
        boolean headerSkipped = false;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                if (!headerSkipped) {
                    headerSkipped = true;
                    continue;
                }

                String[] data = line.split(csvSeparator);

                if (data.length == 3) {
                    double edgeA = Double.parseDouble(data[0]);
                    double edgeB = Double.parseDouble(data[1]);
                    double edgeC = Double.parseDouble(data[2]);

                    Cuboid cuboid = new Cuboid(edgeA, edgeB, edgeC);

                    double surfaceArea = cuboid.calculateSurfaceArea();

                    System.out.println("Luas kuboid dengan panjang " + edgeA + ", lebar " + edgeB + ", dan tinggi " + edgeC + " adalah: " + surfaceArea);
                } else {
                    System.out.println("Data tidak lengkap untuk menghitung luas kuboid.");
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
