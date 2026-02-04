package i.solvesomething;

public class StringReverse {

    public void doReverse(String name) {
        String reverse = "";

        for (int i = 0; i < name.length(); i++) {
            reverse = name.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        StringReverse object = new StringReverse();
        object.doReverse("Aish");

    }
}
