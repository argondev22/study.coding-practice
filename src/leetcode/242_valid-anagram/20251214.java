class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        createMap(s, mapS);
        createMap(t, mapT);

        boolean isEqual = true;
        for (Map.Entry<Character, Integer> entryS : mapS.entrySet()) {
            for (Map.Entry<Character, Integer> entryT : mapT.entrySet()) {
                if (entryS.getKey() == entryT.getKey() && entryS.getValue() != entryT.getValue()) {
                    isEqual = false;
                }
            }
        }

        return isEqual;
    }

    private void createMap(String str, Map<Character, Integer> map) {
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
    }
}
