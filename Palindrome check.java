class PA {
    static boolean p(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return p(s, i + 1, j - 1);
    }
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(p(s, 0, s.length() - 1));
    }
}
