/**
 * Created by robertcheng on 1/9/17.
 */
public class ReverseString {
    public String reverseString(String str) {
        char[] chrs = str.toCharArray();
        int i = 0;
        int j = chrs.length - 1;
        while (i < j){
            char temp = chrs[i];
            chrs[i] = chrs[j];
            chrs[j] = temp;
            i++;
            j--;
        }

        String res = String.valueOf(chrs);
        return res;
    }
}
