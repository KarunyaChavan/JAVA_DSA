package Questions;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        char[] a = new char[128];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int index = (int)ch;
            if(a[index]=='\0') a[index] = dh;
            else{
                if(a[index]!=dh) return false;
            }
        }
        for(int i=0;i<128;i++) a[i] = '\0';
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            int index = (int)ch;
            if(a[index]=='\0') a[index] = dh;
            else{
                if(a[index]!=dh) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println("Is Isomorphic : "+ isIsomorphic(s,t));
        System.out.println("Is Isomorphic : "+ isIsomorphic("race","mood"));
    }
}
