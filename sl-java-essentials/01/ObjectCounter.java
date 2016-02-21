// Static variable use
public class ObjectCounter {
    private static int count = 0;
    ObjectCounter() {  //missing void?
        count = count + 1;  //count increases each time class is invoked?  (or simply the method called?)
    }

    public static void main(String args[]) {
        int i;
        for (i = 0; i < 5; i++) {
            ObjectCounter o = new ObjectCounter();
        }
        System.out.println("There are " + ObjectCounter.count + " objects");
    }
}