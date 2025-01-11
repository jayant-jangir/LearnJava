import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String input = "abc";
        String perm = "";
        ArrayList<String> permutations = permutation (perm, input);
        System.out.println(permutations);
    }

    private static ArrayList<String> permutation(String perm, String input) {
        ArrayList<String> permutations = new ArrayList<String>();
        if (input.isEmpty()) {
            permutations.add(perm);
            return permutations;
        }

        for (int i = 0; i< perm.length()+1; ++i) {
            perm = perm.substring(0, i) + input.charAt(0) + perm.substring(i);
            permutations.addAll(permutation(perm, input.substring(1)));
            perm = perm.substring(0, i) + perm.substring(i+1);
        }

        return permutations;
    }


}
