package i.solvesomething;

public class ArrayEvenPrint {

    public void printEven(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        ArrayEvenPrint object = new ArrayEvenPrint();
        object.printEven(new int[]{1,2,3,4,5,6,7,8,9,10});
    }
}
