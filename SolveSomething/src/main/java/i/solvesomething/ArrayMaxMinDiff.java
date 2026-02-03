package i.solvesomething;

public class ArrayMaxMinDiff {

    public int findMaxMinDiff(int arr[]) {
        int max=arr[0];
        int min=arr[0];
        int diff;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    max = arr[arr.length - 1];
                    min = arr[0];
                    diff = min-max;
                    return diff;
                } else {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    max = arr[arr.length - 1];
                    min = arr[0];
                    diff = min-max;
                    return diff;
                }

            }
        }
        return 0;
    }

    public static void main(String[] args) {

        ArrayMaxMinDiff object = new ArrayMaxMinDiff();
        System.out.println(object.findMaxMinDiff(new int[]{6,7,3,2}));
    }
}
