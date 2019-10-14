package Task_11;

import java.util.List;

public class StringRebuilder {
    public static String StringRebuild(int k, List<String> pattern) {
        String result = pattern.get(0);
        while (result.length() != k + pattern.size() - 1) {
            for (String kmer : pattern) {
                if (result.substring(result.length() - k + 1, result.length()).equals(kmer.substring(0, k - 1))) {
                    result += kmer.substring(k - 1, k);
                }
                if (result.substring(0, k - 1).equals(kmer.substring(1, k))) {
                    char s2;
                    s2 = kmer.charAt(0);
                    result = s2 + result;
                }
            }
        }
        return result;
    }
}
