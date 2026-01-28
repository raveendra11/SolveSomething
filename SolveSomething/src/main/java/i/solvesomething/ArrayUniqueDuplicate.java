package i.solvesomething;

public class ArrayUniqueDuplicate {

    public void printUniqueDuplicates(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count = 1;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        ArrayUniqueDuplicate object = new ArrayUniqueDuplicate();
        object.printUniqueDuplicates(new int[]{1, 2, 3, 4, 5, 5, 4, 6, 1, 3});
    }
}
