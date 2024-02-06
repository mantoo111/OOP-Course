class Test{
public static void main(String[] args){
Car c1 = new Car();
Car c2 = new Car("black","cultus",6759,2300000);
Car sold = new Car(c2);
System.out.println("color is"+c1.color);
System.out.println("color is"+c1.name);
System.out.println("color is"+c1.number);
System.out.println("price is"+c1.price);
System.out.println("color is"+c2.color);
System.out.println("color is"+c2.name);
System.out.println("color is"+c2.number);
System.out.println("price is"+c2.price);

System.out.println("color is"+sold.color);
System.out.println("color is"+sold.name);
System.out.println("color is"+sold.number);
System.out.println("price is"+sold.price);
}
}