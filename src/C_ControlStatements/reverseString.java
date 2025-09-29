public static String reverseString(String str) {
    if (str == null) return null;
    char[] s = str.toCharArray();
    int i = 0, j = s.length - 1;
    while (i < j) {
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
        i++; j--;
    }
    return new String(s);
}

