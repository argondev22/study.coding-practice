class Solution {
    public void reverseString(char[] s) {
        int j = s.length - 1; 

        for (int i = 0; i < s.length; i++) {
            char pre = s[i];
            char post = s[j];
            s[i] = post;
            s[j] = pre;

            j--;

            if (i >= j) {
                return;
            }
        }

    }
}class Solution {
    public void reverseString(char[] s) {
        int j = s.length - 1; 

        for (int i = 0; i < s.length; i++) {
            char pre = s[i];
            char post = s[j];
            s[i] = post;
            s[j] = pre;

            j--;

            if (i >= j) {
                return;
            }
        }

    }
}
