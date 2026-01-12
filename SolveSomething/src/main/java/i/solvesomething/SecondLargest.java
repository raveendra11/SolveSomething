package i.solvesomething;

public class SecondLargest {

    public void findSecondLargest(int arr[]) {
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > secondLargest && arr[j] < largest) {
                secondLargest = arr[j];
            }
        }
        System.out.println(secondLargest);
    }

    public static void main(String[] args) {
        SecondLargest object = new SecondLargest();
        object.findSecondLargest(new int[]{5, 3, 7, 2, 8, 2});
    }
}
