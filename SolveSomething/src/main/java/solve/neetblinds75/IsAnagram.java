package solve.neetblinds75;

import java.util.Arrays;

class IsAnagram {

    public boolean isAnagram(String s, String t) {

        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();

        Arrays.sort(sa);
        Arrays.sort(ta);

        if (Arrays.equals(sa, ta)) {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        IsAnagram object = new IsAnagram();
        boolean result = object.isAnagram("raviraju", "rajuravi");
        System.out.println(result);

    }
}
