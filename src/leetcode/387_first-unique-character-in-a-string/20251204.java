class Solution {
    public int firstUniqChar(String s) {
        // edge case
        if (s.length() <= 1) {
            return 0;
        }

        Map<Character, Integer> hashMap = new HashMap<>();

        for (char e : s.toCharArray()) {
            if (hashMap.containsKey(e)) {
                Integer tmp = hashMap.get(e);
                tmp++;
                hashMap.put(e, tmp);
            } else {
                hashMap.put(e, 1);
            }
        }

        for (Integer i = 0; i < s.length(); i++) {
            char e = s.charAt(i);
            if (hashMap.get(e) == 1) {
                return i;
            }
        }

        return -1;
    }
}
