class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        vector<int> st;
        for (int a : asteroids) {
            while (!st.empty() && st.back() > 0 && a < 0) {
                if (st.back() < -a) {
                    st.pop_back(); // current left asteroid destroyed
                    continue;      // check again with new top
                } else if (st.back() == -a) {
                    st.pop_back(); // both destroy each other
                }
                a = 0; // current asteroid destroyed
                break;
            }
            if (a != 0) st.push_back(a); // survives
        }
        return st;  // ✅ return final result
    }
};
