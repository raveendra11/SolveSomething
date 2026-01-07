package i.solvesomething;

import java.util.*;

public class ArrayElementSearch {

    int[] elements = {5, 4, 3, 2, 1};


    public String searchElement(int findElement) {

        for (int x : elements) {
            if (findElement == x) {
                return "Search successful - element found";
            }
        }
        return "Search failed - element not found";

    }

    public static void main(String[] args) {

        ArrayElementSearch object = new ArrayElementSearch();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an element to find...");
        System.out.println(object.searchElement(input.nextInt()));

    }

}
