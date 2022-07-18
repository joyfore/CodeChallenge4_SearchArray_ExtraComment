class CodeChallenge4_SearchArray_extraComments {
    public static void main(String[] args) {

    /*
    Create an array of strings. Search through it to so prints the the correct word.

    String[] Y = {"wrong", "wrong", "correct", "wrong"};
    System.out.println(Y[2]);

    */

        // Use For Each loop to do a search. Identifiers for arrays should be plural (end in s).
        // i identifies the counter.

        String[] words = {"wrong", "wrong", "correct", "wrong"};

        for (String i : words) {

            if (i.equals("correct")) {

                System.out.println(i);
            }
        }
    }
}