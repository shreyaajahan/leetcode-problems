#include <string>
#include <algorithm> // Not strictly necessary for this specific problem, but good practice

class Solution {
public:
    string longestPalindrome(string s) {
        int n = s.length();
        if (n == 0) return ""; // Handle empty string case
        
        int start = 0, maxLen = 1; // maxLen initialized to 1 for single character palindromes

        for (int i = 0; i < n; ++i) {
            // Case 1: Odd length palindromes (center at i)
            int l = i, r = i;
            // CORRECTED: l should be >= 0
            while (l >= 0 && r < n && s[l] == s[r]) {
                if (r - l + 1 > maxLen) {
                    start = l;
                    maxLen = r - l + 1;
                }
                --l; // Expand outwards
                ++r; // Expand outwards
            }

            // Case 2: Even length palindromes (centers at i and i+1)
            l = i;
            r = i + 1;
            // CORRECTED: l should be >= 0
            while (l >= 0 && r < n && s[l] == s[r]) {
                if (r - l + 1 > maxLen) {
                    start = l;
                    maxLen = r - l + 1;
                }
                --l; // Expand outwards
                ++r; // Expand outwards
            }
        }
        return s.substr(start, maxLen);
    }
};