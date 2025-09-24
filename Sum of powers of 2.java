class SP {
    static int p2(int n) {
        if (n == 0) return 1;
        return 2 * p2(n - 1);
    }
    static int sp(int n) {
        if (n == 0) return 1;
        return p2(n) + sp(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sp(4));
    }
}
