import java.util.Arrays;

public class Program{

    public static void main(String args[]){
        String s1=" HeLlo world how are you guys doing?";
        String s2="hello";
        String s3="HELLO";
        String s4="1768";   
        System.out.println(s1.contains("He"));
        System.out.println(s1.startsWith("He"));
        System.out.println(s1.endsWith("He"));
            System.out.println(s1.length());
            System.out.println(s1.trim().length());
            System.out.println(s3.toLowerCase());
            System.out.println(s1.trim().toUpperCase());
            char[] a=s1.toCharArray();
            System.out.println(s1.indexOf("w"));
            System.out.println(s1.lastIndexOf("w"));
             System.out.println(s1.substring(2));
             System.out.println(Arrays.toString(s1.split("\\^ ")));
             System.out.println(s1.replace("o","z"));
             System.out.println(s1.replace("how","where"));  
             System.out.println(Integer.valueOf(s4));
             int i=789563;
                String s5=String.valueOf(i);
                System.out.println(s5);        
                
                String s6;
                String s7="  ";
                String s8="";
                System.out.println(s7.length());
                System.out.println(s7.isEmpty());
                System.out.println(s7.isBlank()); 
                        

              

             





             


    }}



