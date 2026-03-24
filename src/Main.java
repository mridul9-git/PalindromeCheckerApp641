import java.util.*;

public class PalindromeApp{
    public static void main(String[] args){

        System.out.println("=== Palindrome Checker Management System ===");
        System.out.println("-------------RA642-------------");

//UC1
        System.out.println("\nUC1 - Basic Reverse Check");
        String word1="MalayalaM";
        String rev1="";
        for(int i=word1.length()-1;i>=0;i--){rev1+=word1.charAt(i);}
        System.out.println(word1+" -> "+(word1.equals(rev1)?"Palindrome":"Not Palindrome"));

//UC2
        System.out.println("\nUC2 - StringBuilder Reverse");
        String word2="maLAYALam";
        System.out.println(word2+" -> "+(word2.equals(new StringBuilder(word2).reverse().toString())?"Palindrome":"Not Palindrome"));

//UC3
        System.out.println("\nUC3 - Loop Reverse");
        String word3="malayalam";
        String rev3="";
        for(int i=word3.length()-1;i>=0;i--){rev3+=word3.charAt(i);}
        System.out.println(word3+" -> "+(word3.equals(rev3)?"Palindrome":"Not Palindrome"));

//UC4
        System.out.println("\nUC4 - Two Pointer");
        String input4="level";
        char[] arr=input4.toCharArray();
        int s=0,e=arr.length-1;boolean p4=true;
        while(s<e){if(arr[s]!=arr[e]){p4=false;break;}s++;e--;}
        System.out.println(input4+" -> "+(p4?"Palindrome":"Not Palindrome"));

//UC5
        System.out.println("\nUC5 - Stack");
        String input5="madam".toLowerCase();
        Stack<Character> st=new Stack<>();
        for(char c:input5.toCharArray()){st.push(c);}
        boolean p5=true;
        for(char c:input5.toCharArray()){if(c!=st.pop()){p5=false;break;}}
        System.out.println(input5+" -> "+(p5?"Palindrome":"Not Palindrome"));

//UC6
        System.out.println("\nUC6 - Queue + Stack");
        String input6="radar".toLowerCase();
        Queue<Character> q=new LinkedList<>();
        Stack<Character> st2=new Stack<>();
        for(char c:input6.toCharArray()){q.add(c);st2.push(c);}
        boolean p6=true;
        while(!q.isEmpty()){if(q.remove()!=st2.pop()){p6=false;break;}}
        System.out.println(input6+" -> "+(p6?"Palindrome":"Not Palindrome"));

//UC7
        System.out.println("\nUC7 - Deque");
        String input7="refer".toLowerCase();
        Deque<Character> dq=new ArrayDeque<>();
        for(char c:input7.toCharArray()){dq.addLast(c);}
        boolean p7=true;
        while(dq.size()>1){if(dq.removeFirst()!=dq.removeLast()){p7=false;break;}}
        System.out.println(input7+" -> "+(p7?"Palindrome":"Not Palindrome"));

        System.out.println("\nProgram executed successfully.");
    }
}