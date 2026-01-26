package i.solvesomething;

public class ArrayMovZeros {

    public void doMovZeros(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
            System.out.println(arr[i]);

        }

    }

    public static void main(String[] args) {
        ArrayMovZeros object = new ArrayMovZeros();
        object.doMovZeros(new int[]{0, 1, 0, 2, 0, 4, 5, 0, 6, 0, 0, 7});
    }
}
