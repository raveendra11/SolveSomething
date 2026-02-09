package i.solvesomething;

public class ArraysIdentical {

    public String checkIdentical(int arr1[], int arr2[]) {

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return "Arrays are not identical.";
                }
            }
        } else {
            return "Arrays are not identical.";
        }
        return "Arrays are identical.";
    }

    public static void main(String[] args) {
        ArraysIdentical obejct = new ArraysIdentical();
        String output = obejct.checkIdentical(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(output);
    }
}
