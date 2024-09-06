package Questions;

public class MaximumString {

    public static String purify(String a){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!='0') return a.substring(i);
        }
        return a;
    }
    public static String max(String m, String n){
        String a = purify(m); String b = purify(n);
        if(a.length()>b.length()) return m;
        if(a.length()<b.length()) return n;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                if(a.charAt(i)>b.charAt(i)){
                    return m;
                }
                else return n;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        String[] s = {"0000000000021012", "9359288942", "31013", "7249899086"};
        String mx = s[0];
        for(int i=0;i<s.length;i++){
            mx = max(mx,s[i]);
        }
        System.out.println(mx);
    }
}
