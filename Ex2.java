class Ex3{
    public static voidmain(String args[]){
        StringBuffer sb1=new StringBuffer("vaishnavi");
        StringBuffer sb2=new StringBuffer("vaishnavi");
        System.out.println(sb1==sb2);
        sb1=sb1.append("kayapati");
        System.out.println(sb1==sb2);

        StringBuffer sb3=new StringBuffer("vaishnavikayapati");
        System.out.println(sb1==sb3);

        System.out.println("***************");

        
        String s1="Vaishnavi";
        String s2="vaishnavi";
        System.out.println(s1==s2);
        s1=s1+"kayapati";
        String s3="vaishnavikayapati";
        System.out.println(s1==s2);
    }
}