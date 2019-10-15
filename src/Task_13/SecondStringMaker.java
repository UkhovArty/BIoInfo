package Task_13;

import java.util.List;

public class SecondStringMaker {
    public static String BuildNewString (String result, List<String> pattern, int k, int d) {
        String tmp1 = "";
        tmp1 = result.substring(k + d, result.length());
        String tmp = "";
        for (String kmer : pattern) {
            if (kmer.equals(tmp1.substring(0, k))) {
                tmp = kmer;
            }
        }
        pattern.remove(tmp);
        while (tmp.length() <= k + pattern.size() - 1) {
            for (String kmer : pattern) {
                if (tmp.substring(tmp.length() - k + 1, tmp.length()).equals(kmer.substring(0, k - 1))) {
                    tmp += kmer.charAt(k-1);
                    break;
                }
            }
        }
        //System.out.println(tmp);
        tmp = result.substring(0, k + d) + tmp;
        return tmp;
    }
}
