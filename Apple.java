import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// implement the abstract Fruit interface
public class Apple implements Fruit {
    @Override
    public void PriceChecker() {
        int r = 2;
        int c = 3;

        String[][] apple = new String[r][c];

        try {
            int i = -1, j = 0;

            File object = new File("fruit_labels.txt");
            Scanner read = new Scanner(object);
            while (read.hasNextLine()) {
                String fruit = read.nextLine();
                String total = read.nextLine();

                if (fruit.contains("apples")) {
                    i++;
                    apple[i][j] = fruit;
                    j++;

                    apple[i][j] = total;
                }
            }
            read.close();
        } catch (FileNotFoundException cat) {
            System.out.println("Error");
            cat.printStackTrace();
        }

        String test = FactoryTest.products;

        if (test.toLowerCase().equals("granny smith apple")) {
            System.out.println("A " + apple[0][0] + " is $" + apple[0][1]);
        } else if (test.toLowerCase().equals("red delicious apple")) {
            System.out.println("A " + apple[1][1] + " is $" + apple[1][2]);
        }
    }
}
