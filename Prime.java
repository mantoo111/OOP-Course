import java.util.Scanner;
class Prime{
public static void main(String[] args){
Scanner inn=new Scanner(System.in);
int i ,chk=0,j;
for(i =1 ; i<=999 ;i++){
for(j=2 ; j<i;j++){

if(i%j==0){
chk++;
break;
}
}
if(chk==0 && i!=1)
System.out.println(i);
chk=0;

}

System.out.println();

}
}
