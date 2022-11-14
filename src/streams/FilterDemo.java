package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class showroom{
	String model;
	double milage;
	int price;
	String power;
	
public showroom(String model, double milage, int price, String power) {
		
		this.model = model;
		this.milage = milage;
		this.price = price;
		this.power = power;
	}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public double getMilage() {
	return milage;
}

public void setMilage(double milage) {
	this.milage = milage;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getPower() {
	return power;
}

public void setPower(String power) {
	this.power = power;
}
	
}

public class FilterDemo {

	public static void main(String[] args) {
		
		showroom m1 = new showroom("altroz",12.5,10,"560n-m");
		showroom m2 = new showroom("altro",10.5,10,"460n-m");
		showroom m3 = new showroom("altroz",11.00,18,"660n-m");
		showroom m4 = new showroom("altroz",17.5,16,"1560n-m");
		showroom m5 = new showroom("altroz",15.00,22,"560n-m");
		showroom m6 = new showroom("altroz",16.5,18,"460n-m");
		
		List<showroom> li = new ArrayList<showroom>();
		
		li.add(m1);
		li.add(m2);
		li.add(m3);
		li.add(m4);
		li.add(m5);
		li.add(m6);
		Scanner input = new Scanner(System.in);
		System.out.println("enter the price");
		int n = input.nextInt();
	//	 li.stream().filter(x->n.equals(x.getModel())).forEach(x->System.out.println(+x.milage+"|"+x.power+"|"+x.model+"|"+x.price));
	List<showroom> l = li.stream().filter(x->x.getPrice()==n).collect(Collectors.toList());	
	l.forEach(x->System.out.println("model is "+x.getModel()+" milage is = "+x.getMilage()));
	}

}
