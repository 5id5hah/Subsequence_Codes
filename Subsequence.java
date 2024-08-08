import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        String str = "abc";
        subseq("",str);
        System.out.println(Sseq("",str));
        System.out.println(SseqAscii("",str));
    }
    public static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
    //For a list
    public static ArrayList<String> Sseq(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left =  Sseq(p+ch,up.substring(1));
        ArrayList<String> right = Sseq(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    //FOr a list of ascii 
    public static ArrayList<String> SseqAscii(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first =  SseqAscii(p+ch,up.substring(1));
        ArrayList<String> second = SseqAscii(p,up.substring(1));
        ArrayList<String> third = SseqAscii(p+(ch+0),up.substring(1));


        first.addAll(second);
        first.addAll(third);
        return first;
    }
}

