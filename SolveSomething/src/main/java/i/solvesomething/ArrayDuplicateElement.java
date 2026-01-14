package i.solvesomething;

public class ArrayDuplicateElement {

    public void findDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " is duplicate");
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayDuplicateElement object = new ArrayDuplicateElement();
        object.findDuplicate(new int[]{1, 2, 3, 5, 4, 5, 6, 6});
    }
}
