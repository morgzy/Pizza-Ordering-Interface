package mgpizza;

import java.util.ArrayList;

public class Order {
	
	private Customer customer;
	private ArrayList<Pizza> pizzas;
	private boolean delivery;
	private boolean discount;
	private double totalCost;
	
	public boolean isDelivered()
	{
		return true;
	}
	
	public boolean isDiscounted()
	{
		return true;
	}
	
	public double calculateTotalCost()
	{
		return 1.1;
	}
	
	public String displayPizzas()
	{
		return "Pizzas!";
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(customer);
		sb.append(pizzas);
		sb.append(delivery);
		sb.append(discount);
		sb.append(totalCost);
		return(sb.toString());
	}

}
