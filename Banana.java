import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// implement the abstract Fruit interface
public class Banana implements Fruit {
    @Override
    public void getPrice() {
        int r = 2;
        int c = 3;

        String[][] banana = new String[r][c];

        try {
            int i = -1, j = 0;

            File object = new File("fruit_labels.txt");
            Scanner read = new Scanner(object);
            while (read.hasNextLine()) {
                String fruit = read.nextLine();
                String total = read.nextLine();
                //
                if (fruit.contains("Banana")) {
                    i++;
                    banana[i][j] = fruit;
                    j++;

                    banana[i][j] = total;
                }
            }
            read.close();
        } catch (FileNotFoundException cat) {
            System.out.println("Error");
            cat.printStackTrace();
        }

        String test = FactoryTest.products;

        if (test.toLowerCase().equals("plantain")) {
            System.out.println("A " + banana[0][0] + " is $" + banana[0][1]);
        } else if (test.toLowerCase().equals("yellow banana")) {
            System.out.println("A " + banana[1][1] + " is $" + banana[1][2]);
        }
    }
}
