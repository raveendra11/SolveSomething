package i.solvesomething;

public class ArrayUniquePrint {

    public void printUnique(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i] == arr[j]) {
                    count = 1;
                    break;
                }
            }

            if (count == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        ArrayUniquePrint object = new ArrayUniquePrint();
        object.printUnique(new int[]{1, 2, 3, 4, 5, 5, 4, 6, 1, 3});
    }
}
