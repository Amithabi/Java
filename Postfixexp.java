import java.util.*;
public class Postfixexp
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Stack<Integer> st=new Stack<>();
String s=sc.nextLine();
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
if(Character.isDigit(ch)){
st.push(Character.getNumericValue(ch));
}
else
{
int a = st.pop();
int b = st.pop();
if(ch=='+')st.push(a+b);
else if(ch=='-')st.push(a-b);
else if(ch=='*')st.push(a*b);
else if(ch=='/')st.push(a/b);
}}
System.out.println(+st.pop());
}}