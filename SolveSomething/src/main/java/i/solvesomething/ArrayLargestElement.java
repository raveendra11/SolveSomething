package i.solvesomething;

public class ArrayLargestElement {

    public void findLargest(int arr[]) {

        int largest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        System.out.println(largest);

    }

    public static void main(String[] args) {
        ArrayLargestElement object = new ArrayLargestElement();
        object.findLargest(new int[]{1, 2, 5, 3, 4,6 });
    }
}
