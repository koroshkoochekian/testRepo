
public abstract class Employee {
	
	
	private String name;
	private String familyName;
	private int hourpayment;
	
	
	public Employee()
	{
		name="";
		familyName="";
		hourpayment=1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public int getHourpayment() {
		return hourpayment;
	}
	public void setHourpayment(int hourpayment) {
		this.hourpayment = hourpayment;
	}
	
	public  int getSalary()
	{
		return hourpayment*2;
	}
	
	


}
