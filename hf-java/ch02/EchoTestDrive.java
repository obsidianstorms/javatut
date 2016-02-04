public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
//        Echo e2 = new Echo();
        Echo e2 = e1;
        int x = 0;
        while ( x < 4 ) {
            e1.hello();
            e1.count = e1.count + 1;
            if ( x == 3 ) {
                e2.count = e2.count + 1;
            }
            if ( x > 0) {
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
            System.out.println(e1.count);
            System.out.println(e2.count);
        }
        System.out.println(e2.count);
    }
}
// x, y, e2, count, x < 4, x < 5, x > 0, x > 1, x == 3, x == 4
// Echo, Tester, echo(), count(), hello()
// e2 = e1, e1 = e1 + 1; e1 = count + 1; e1.count = count + 1; e1.count = e1.count + 1;
// Echo e2; Echo e2 = e1; Echo e2 = new Echo();