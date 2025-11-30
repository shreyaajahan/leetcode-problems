class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mp = new HashMap<>();

for (int i = 0; i < s.length(); i++) {
    char key = s.charAt(i);
    char value = t.charAt(i);

    if (mp.containsKey(key)) {
        if (mp.get(key) != value) return false;
    } else {
        mp.put(key, value);
    }
}
return true;
    }
}