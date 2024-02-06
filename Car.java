class Car {
	String name;
	int model;
	String color;
	int price;
Car()
	{
	name = "Swift";
	model = 2019;
	color = "Silver";
	price = 5500000;
}
	Car(String n,int m,String c,int p)
	{
		name = n;
		model = m;
		color = c;
		price = p;
}
	Car(Car ref)
	{
		name = ref.name;
		model = ref.model;
		color = ref.color;
		price = ref.price;
		}
}
