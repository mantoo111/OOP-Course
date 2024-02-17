class Display{
void info(String name,int reg,String class_,String section){
System.out.println(name+reg+class_+section);
}
public static void main(String[] args)
{
Display obj=new Display();
obj.info("ansa",123,"university","a");
}
}