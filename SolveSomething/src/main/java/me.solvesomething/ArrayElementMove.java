package me.solvesomething;

public class ArrayElementMove {

    public void doMoveElement(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[arr.length - 1] = 0;

        for (int x: arr) {
            System.out.println(x);
        }


    }

    public static void main(String[] args) {
        ArrayElementMove object = new ArrayElementMove();
        object.doMoveElement(new int[]{0, 1, 2, 3, 4, 5});
    }
}
