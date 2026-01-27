package i.solvesomething;

public class ArraySwapFirstLast {

    public void swapFirstLast(int arr[]) {

        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        ArraySwapFirstLast object = new ArraySwapFirstLast();
        object.swapFirstLast(new int[]{6, 2, 3, 4, 5, 1});
    }
}
