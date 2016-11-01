package code.nasir.generalpractice;

import java.util.*;

/**
 * Created by NasirAhmed on 10-Oct-16.
 */
public class AlphabeticallySort {

    public static void main(String args[]) {
        String s = "banana";
        List<String> strings = new ArrayList<>();
        HashSet<String> sHash = new HashSet<>();
        int i,j;
        for(i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            for(j=i+1; j<=s.length(); j++) {
                System.out.println(s.substring(i,j));
                strings.add(s.substring(i,j));
                sHash.add(s.substring(i,j));
            }
        }

        TreeSet<String> sTree = new TreeSet<>();
        sTree.addAll(sHash);
        Collections.sort(strings);

        System.out.println(strings);
        System.out.println(sTree);
    }
}
