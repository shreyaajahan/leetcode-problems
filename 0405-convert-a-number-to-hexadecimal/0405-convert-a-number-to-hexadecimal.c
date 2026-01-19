char* toHex(int num) {
    static char res[9];   // 8 hex digits + '\0'

    if (num == 0) {
        res[0] = '0';
        res[1] = '\0';
        return res;
    }

    char hex[] = "0123456789abcdef";
    unsigned int n = (unsigned int)num;

    int i = 8;
    res[i] = '\0';

    while (n > 0) {
        res[--i] = hex[n & 15];  // n % 16
        n >>= 4;                 // n /= 16
    }

    return &res[i];
}
