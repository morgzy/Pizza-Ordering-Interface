package mgpizza;

public class Customer
{

	private String name;
	private String phone;
	private String address;

	public Customer()
	{

	}
	
	public Customer(String name, String phone, String address)
	{
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(name+"\n");
		sb.append(phone+"\n");
		sb.append(address+"\n");
		return(sb.toString());
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}

}
