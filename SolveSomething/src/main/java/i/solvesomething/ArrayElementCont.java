package i.solvesomething;

public class ArrayElementCont {

    public void doCount(int arr[]) {

        System.out.println(arr.length);
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            i++;
        }
        System.out.println(i);
    }

    public static void main(String[] args) {

        ArrayElementCont object = new ArrayElementCont();
        object.doCount(new int[]{1, 2, 3, 4, 5, 6, 7});

    }
}
