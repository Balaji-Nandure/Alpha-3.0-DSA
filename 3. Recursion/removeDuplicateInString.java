import javax.swing.Spring;

public class removeDuplicateInString {
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        // chars form a to z only (small)
        // a-a=0, b-a=1, c-a=2....z-a=25

        // basecase
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // work
        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a'] == true) {
            // if duplicate is found
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            // if duplicate is not found
            map[currentChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(currentChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnaacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
