import java.util.Arrays;
import java.util.*;

public class Main {

    public static String reverse(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            stack.push(c);
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "OsamaShaikh";
        System.out.println(s);
        System.out.println(reverse(s));
    }
}
//time complexity --> O(n)
//space complexity --> O(n)