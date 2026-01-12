#include <string.h>
#include <stdbool.h>

bool isIsomorphic(char* s, char* t) {
    int mapST[256];
    int mapTS[256];

    // Initialize mappings to -1
    for (int i = 0; i < 256; i++) {
        mapST[i] = -1;
        mapTS[i] = -1;
    }

    int n = strlen(s);
    for (int i = 0; i < n; i++) {
        unsigned char c1 = s[i];
        unsigned char c2 = t[i];

        // Check s -> t mapping
        if (mapST[c1] != -1) {
            if (mapST[c1] != c2)
                return false;
        } else {
            mapST[c1] = c2;
        }

        // Check t -> s mapping
        if (mapTS[c2] != -1) {
            if (mapTS[c2] != c1)
                return false;
        } else {
            mapTS[c2] = c1;
        }
    }

    return true;
}
