package i.solvesomething;

public class ArrayReverse {

    public void doReverse(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ArrayReverse object = new ArrayReverse();
        object.doReverse(new int[]{1, 2, 3, 4, 5});
    }
}
