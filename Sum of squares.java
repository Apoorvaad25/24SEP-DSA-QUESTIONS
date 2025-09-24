class SS {
    static int s(int n) {
        if (n == 1) return 1;
        return n * n + s(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(s(5));
    }
}
