package module_303.glab_303_13_1;
//
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ScanDelimitedFile  {
    static File file = new File("src/main/java/module_303/glab_303_13_1/cars.csv");
    static ArrayList<String[]> checkFile() {
        ArrayList<String[]> carsArray = new ArrayList<String[]>();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String[] cars = sc.nextLine().split(",");
                carsArray.add(cars);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return carsArray;
    }

    public static void main(String[] args) {

        for (String[] line: checkFile()) {
            System.out.println(Arrays.toString(line));
            /*
                [Car, MPG, Cylinders, Displacement, Horsepower, Weight, Acceleration, Model, Origin]
                [Chevrolet Chevelle Malibu, 18, 8, 307, 130, 3504, 12, 70, US]
                [Buick Skylark 320, 15, 8, 350, 165, 3693, 11.5, 70, US]
                [Plymouth Satellite, 18, 8, 318, 150, 3436, 11, 70, US]
                [AMC Rebel SST, 16, 8, 304, 150, 3433, 12, 70, US]
                ...
            */
        }
    }
}


