package i.solvesomething;

public class ArrayMatrixMulti {

    public void matrixMulti(int a[][], int b[][]) {

        int c[][] = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        ArrayMatrixMulti object = new ArrayMatrixMulti();
        object.matrixMulti(new int[][]{{2, 2}, {2, 2}}, new int[][]{{3, 3}, {3, 3}});
    }
}
