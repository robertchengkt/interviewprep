import java.util.HashMap;

/**
 * Created by robertcheng on 1/10/17.
 */
public class FirstDupWords {
    public String firstDupWords(String[] words){
        HashMap<String, Integer> shown = new HashMap<String, Integer>();
        for (String wd : words){
            if (shown.containsKey(wd)) return wd;
            shown.put(wd, 1);
        }
        return "Not repeating word";
    }
}
