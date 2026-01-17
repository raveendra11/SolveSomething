package i.solvesomething;

public class ArrayCopyElements {

    public void doCopy(int arr[]) {
        int[] arr2 = new int[arr.length];
        int i = 0;
        for (int x : arr) {
            arr2[i] = x;
            i++;
        }

        for (int x : arr2) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        ArrayCopyElements object = new ArrayCopyElements();
        object.doCopy(new int[]{6, 5, 4, 3, 2, 1});
    }
}
