package i.solvesomething;

public class ArrayMissingNum {

    public void findMissNum(int arr[]) {
        int n = arr.length + 1;
        int totalSum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum = arrSum + num;
        }
        int missingNum = totalSum - arrSum;
        System.out.println(missingNum);
    }

    public static void main(String[] args) {

        ArrayMissingNum object = new ArrayMissingNum();
        object.findMissNum(new int[]{1, 2, 4, 5, 6});
    }

}
