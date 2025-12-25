class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        char[][] all = new char[numRows][s.length()];
        int row = 0, col = 0, curr = 0;
        while (curr < s.length()) {
            while (row < numRows && curr < s.length()) {
                all[row++][col] = s.charAt(curr++);
            }
            row = Math.max(0, row - 2);
            while (row > 0 && curr < s.length()) {
                all[row--][++col] = s.charAt(curr++);
            }
            col++;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (all[i][j] != '\0') {
                    ans.append(all[i][j]);
                }
            }
        }
        return ans.toString();
    }
}
