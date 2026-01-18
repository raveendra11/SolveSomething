package i.solvesomething;

public class ArrayAvg {

    public void findAvg(int arr[]) {
        float sum = 0;
        for (int x : arr) {
            sum = sum + x;
        }
        System.out.println(sum / arr.length);
    }

    public static void main(String[] args) {
        ArrayAvg object = new ArrayAvg();
        object.findAvg(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }
}
