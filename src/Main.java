import pack.Matrix;


public class Main {

    public static void func(Matrix temp, double[] arr, int[] path, int start) {
        int a = temp.length;
        for (int j = 0; j < a; j++) {
            if (temp.matrix[start][j] != 0) {
                if (arr[j] > temp.matrix[start][j] + arr[start]) {
                    arr[j] = temp.matrix[start][j] + arr[start];
                    path[j] = start;
                }
                temp.matrix[start][j] = 0;
                func(temp, arr, path, j);

            }


        }


    }

    ;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Matrix temp = new Matrix();
        temp.Reader();
        double[] arr = new double[temp.length];
        int[] path = new int[temp.length];
        for (int i = 0; i < temp.length; i++)
            arr[i] = Double.POSITIVE_INFINITY;

        arr[temp.start] = 0;
        func(temp, arr, path, temp.start);


        System.out.print("Стартовая вершина:" + temp.start + "   ");
        System.out.println("Конечная вершина:" + temp.finish + "   ");
        System.out.print("Путь: ");
        String str = temp.finish + ">-";
        int k = temp.finish;
        if (arr[temp.finish] != Double.POSITIVE_INFINITY) {
            while (k != 0) {
                str = str + path[k] + ">-";
                k = path[k];


            }


            str = str.substring(0, str.length() - 3);

            str = new StringBuilder(str).reverse().toString();
            if (temp.start == 0)
                str = 0 + str;

            System.out.println(str);
            System.out.println("Длина маршрута=" + arr[temp.finish]);

        } else
            System.out.println("Данный маршрут проложить невозможно");


        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);


    }

}

