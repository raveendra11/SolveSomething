package i.solvesomething;

public class GridDashes2 {
    public static void main(String[] args) {
        String arr1[][] = new String[10][10];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length-i; j++) {
                System.out.print(" - ");
            }
            System.out.println();
        }
    }
}
