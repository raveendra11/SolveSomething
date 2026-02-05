package i.solvesomething;

public class ArrayThreeDim {

    public void doPrint(int arr[][][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + "  ");
                }
                System.out.println();
            }
        }


    }

    public static void main(String[] args) {
        ArrayThreeDim object = new ArrayThreeDim();
        object.doPrint(new int[][][]{{{1, 2, 3}, {4, 5, 6}, {8, 9, 10}}});
    }
}
