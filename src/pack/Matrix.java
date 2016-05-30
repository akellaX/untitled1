package pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by akella on 29.05.2016.
 */
public class Matrix {

    public int length;
    public int start,finish;
    public double[][] matrix;
    public Matrix()
    {

    }
    public void Reader()
    {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            start=sc.nextInt();
            finish=sc.nextInt();
            length=sc.nextInt();
            matrix=new double[length][length];
            while (sc.hasNext()) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                matrix[a][b] = c;
            }
        sc.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

}

    public void write() {

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }



}
