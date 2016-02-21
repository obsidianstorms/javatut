class ConditionDemo {
    public static void main(String args[]) {
        int a = 10, b = 5; //multiple declarations
        if (a > b) {
            System.out.println(a + " is greater");
        } else
        if (b > a) {
            System.out.println(b + " is greater");
        } else {
            if (b == a) {
                Systeml.out.println("neither is greater");
            }
        }
    }
}