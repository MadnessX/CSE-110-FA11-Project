import java.util.*;

public class Item {
	private int ownerID;
	private String name;
	private double price;
	private String category;
	
	public Item(int ownerID, 
			String name, 
			double price, 
			String category){
		this.ownerID = ownerID;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public int getOwnerID(){
		return this.ownerID;
	}
	
	public String getName(){
		return this.name;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public String getCategory(){
		return this.category;
	}
}
