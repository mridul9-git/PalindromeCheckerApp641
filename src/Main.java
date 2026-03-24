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

        //UC8
        System.out.println("\nUC8 - Linked List Palindrome");

//Node class
        class Node {
            char data;
            Node next;
            Node(char d){ data=d; next=null; }
        }

//Create Linked List
        String input8 = "racecar";
        Node head = null, temp = null;
        for(char c : input8.toCharArray()){
            if(head == null){
                head = new Node(c);
                temp = head;
            } else {
                temp.next = new Node(c);
                temp = temp.next;
            }
        }

//Find middle
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

//Reverse second half
        Node prev = null, curr = slow;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

//Compare
        Node first = head, second = prev;
        boolean p8 = true;
        while(second != null){
            if(first.data != second.data){
                p8 = false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        System.out.println(input8 + " -> " + (p8 ? "Palindrome" : "Not Palindrome"));

        //UC9
        System.out.println("\nUC9 - Recursion");

        String input9 = "madam";

        class RecursionCheck {
            boolean check(String s, int l, int r){
                if(l >= r) return true;
                if(s.charAt(l) != s.charAt(r)) return false;
                return check(s, l+1, r-1);
            }
        }

        RecursionCheck rc = new RecursionCheck();
        System.out.println(input9 + " -> " + (rc.check(input9,0,input9.length()-1) ? "Palindrome":"Not Palindrome"));
//UC10
        System.out.println("\nUC10 - Ignore Case & Spaces");

        String input10 = "A man a plan a canal Panama";
        String norm = input10.replaceAll("\\s+","").toLowerCase();

        String rev10 = new StringBuilder(norm).reverse().toString();
        System.out.println(input10 + " -> " + (norm.equals(rev10) ? "Palindrome":"Not Palindrome"));

    }
}