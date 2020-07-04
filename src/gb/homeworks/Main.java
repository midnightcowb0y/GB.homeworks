package gb.homeworks;

public class Main {

    public static void main(String[] args) {
        replaceValue();
        fillValue();
        changeValue();
        fillDiagonalValue();
        findMinMax();
    }

    public static void replaceValue()
    {
        int[] x= { 0, 0, 1, 0, 0, 1, 1, 0 };
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) { x[i] = 1;

            } else if (x[i] == 1) { x[i] = 0;

            }System.out.print(x[i]);
        } System.out.println();
    }

    public static void fillValue()
    {
        int [] y = new int [8];

        for (int i = 0; i < y.length; i++) {
            y[i]= i*3;

            System.out.print(y[i]);
        } System.out.println();

    }

    public static void changeValue()
    {
        float [] x = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for ( int i = 0; i < x.length; i++){
            if(x[i] < 6){
                x[i]=x[i]*2;
            }System.out.print(x[i]);
        }
    }
    public static void fillDiagonalValue() {
        int[][] d = new int[4][4];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                if (i == j || i == 3 - j) {
                    d[i][j] = 1;
                }
                System.out.print(d[i][j]);
            }
            System.out.println();
        }
    }
    public static void findMinMax()
    {
        float []m = {12,0,4,-5,2,4,0, -5.5f,17};
        float max=0;
        float min=0;
        for (int i = 0; i<m.length; i++){
            if (m[i]<=min) {
                min= m[i];
            } else if (m[i]>=max){
                max = m[i];
            }
        }System.out.println("Наименьшее число в массиве " + min +" и наибольшее " + max);
    }


    }










