class MM {
    static int mx(int[] a, int i) {
        if (i == a.length - 1) return a[i];
        int t = mx(a, i + 1);
        return (a[i] > t) ? a[i] : t;
    }
    static int mn(int[] a, int i) {
        if (i == a.length - 1) return a[i];
        int t = mn(a, i + 1);
        return (a[i] < t) ? a[i] : t;
    }
    public static void main(String[] args) {
        int[] a = {4,1,7,3,9,2};
        System.out.println(mx(a,0));
        System.out.println(mn(a,0));
    }
}
