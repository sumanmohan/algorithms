import java.util.ArrayList;

public class StringPermutate {

    public ArrayList<String> permutationsFor(String stringToPermutate)
    {
        return permutationsHelper(new ArrayList<String>(), -1, stringToPermutate);
    }

    private ArrayList<String> permutationsHelper(ArrayList<String> permutations, int index, String stringToPermutate) {
        if (permutations.size() == 0) {
            permutations.add("");
        }

        if (index == stringToPermutate.length() - 1)
            return permutations;

        ArrayList<String> q = new ArrayList<String>();
        for (String s1 : permutations) {
            char characterAtIndex = stringToPermutate.charAt(index + 1);
            for (int ii = 0; ii <= index + 1; ii++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(s1);
                stringBuilder.insert(ii, characterAtIndex);
                q.add(stringBuilder.toString());
            }
        }
        index = index + 1;
        return permutationsHelper(q, index, stringToPermutate);
    }

}


