public class Pattern {
    public static void main(String[] args) throws Exception {
        int n = 8;

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 0 ; j <= n-i-1 ; j++) {
                System.out.print("\t");
            }
            for(int j = 0 ; j < i ; j++) {
                System.out.print("\t" + i + "\t");
            }
            System.out.println();
        }
    }
}
