package i.solvesomething;

public class StringPalindrome {

    public boolean checkPalindrome(String name) {
        String naam = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            naam = naam + name.charAt(i);
        }

        return name.equals(naam);
    }

    public static void main(String[] args) {
        StringPalindrome object = new StringPalindrome();
        if(object.checkPalindrome("AishuhsiA"))
            System.out.println("Your name is Palindrome");
        else
            System.out.println("Your name is not Palindrome");
    }
}
