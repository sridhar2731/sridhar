class sridhar{
public static void main(String[] args){
String name="SRIDHAR";
String rev="";                                                                                    
for(int i=0;i<name.length();i++){
char ch=name.charAt(i);
rev=ch+rev;
}
System.out.println("original:"+name);
System.out.println("reverse:"+rev);
}
}