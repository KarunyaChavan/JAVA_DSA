package Basics;

public class CheckingEquality {
    public static void main(String[] args) {
        String s = "abcxyz";
        String t = "abc";
        t += "xyz";
        System.out.println("s: " + s +" t : "+ t);
        System.out.println("Equal : " + s==t);//Object address referncing
        System.out.println("Equal(.equals()) : "+s.equals(t));
    }
}
