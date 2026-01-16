package i.solvesomething;

public class ArraySorting {

    public void doSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        ArraySorting object = new ArraySorting();
        object.doSort(new int[]{0, 5, 4, 3, 2, 1, 6});

    }
}
