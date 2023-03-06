package mgpizza;

public class Pizza
{
	private String size;
	private String type;
	private String instructions;
	private double cost;
	
	public Pizza()
	{
		
	}
	
	public Pizza(String size, String type, String instructions)
	{
		this.size = size;
		this.type = type;
		this.instructions = instructions;
		this.cost = calculateCost();
	}
	
	public double calculateCost()
	{
		double cost = 0;
		if (type.equals("Aussie") || type.equals("Hawaiian")|| type.equals("Vegetarian"))
		{
			cost = 6;
		}
		else
		{
			cost = 8;
		}
		
		if (size == "Medium")
		{
			cost += 4;
		}
		if (size == "Large")
		{
			cost += 8;
		}
		return cost;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(size + " ");
		sb.append(type + "\n");
		sb.append(cost+"\n");
		sb.append(instructions+"\n");
		return(sb.toString());
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	
}
