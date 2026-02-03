package i.solvesomething;

public class ArrayMaxMinDiff {

    public int findMaxMinDiff(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        ArrayMaxMinDiff object = new ArrayMaxMinDiff();
        System.out.println(object.findMaxMinDiff(new int[]{6, 7, 3, 2}));
    }
}
