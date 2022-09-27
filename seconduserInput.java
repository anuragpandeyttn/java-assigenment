/*Q2) Write a program to read user input until user writes XDONE and 
 * then show the entered text by the user on commandline

*/
import java.util.Scanner;
public class seconduserInput {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String st;
        String re=" ";
        do{
            st =sc.next();
            re=re+" "+st;
        }while(!st.equals("XDONE"));
        System.out.println(re);
    }
}