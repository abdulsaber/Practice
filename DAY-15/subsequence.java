public class subsequence {
    public static void main(String[] args) {
        String s = "baacd";
        String b = "abc";
        //String s = a + b;

        System.out.println(check(s, b));
    }
    static boolean check(String s,String b){
        if(s.contains(b)) return true;

        return false;
    }
    
}
