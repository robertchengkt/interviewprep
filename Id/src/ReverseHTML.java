/**
 * Created by robertcheng on 1/9/17.
 */
public class ReverseHTML {
    public String reverseHTML(String html){
        StringBuilder sb = new StringBuilder();
        for (int i = html.length() - 1; i >= 0; i--){
            sb.append(html.charAt(i));
        }
        int left = 0;
        for (int i = 0; i < sb.length(); i++){
            if (sb.charAt(i) == ';'){
                left = i;
            }

            if (sb.charAt(i) == '&' && sb.charAt(left) == ';'){
                int right = i;
                while (left < right){
                    char tmp = sb.charAt(right);
                    sb.setCharAt(right--, sb.charAt(left));
                    sb.setCharAt(left++, tmp);
                }
                left = i + 1;
            }
        }

        return sb.toString();
    }
}
