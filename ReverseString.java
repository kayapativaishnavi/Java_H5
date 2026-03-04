import java.util.Scanner;
class ReverseString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(String.valueOf(input));
        sb.reverse();
        System.out.println("Reversed string: " + sb);
        sc.close();
    }
}
    
