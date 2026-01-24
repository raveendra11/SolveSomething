package i.solvesomething;

public class ArrayIndexPrint {

    public void printIndex(int num[], int element) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 4) {
                System.out.println("Element index postion is : " +i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayIndexPrint object = new ArrayIndexPrint();
        object.printIndex(new int[]{1, 2, 3, 4, 5, 6}, 4);
    }
}
