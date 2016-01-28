public class PhraseOMatic {
    public static void main (String[] args) {
        //word lists
        String[] wordListOne = {"rockstar", "in it to win it", "dynamic", "go-getter", "hungry", "responsive"};
        String[] wordListTwo = {"take charge", "pride", "ownership", "streamlined", "coopted"};
        String[] wordListThree = {"result", "solution", "organization", "synergy"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //random
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //build phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //output
        System.out.println("What we need is a " + phrase + ".");
    }

}