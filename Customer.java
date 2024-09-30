package module6;

public class Customer {
	private int custId;
	private String name;
	private int mobile;
	private String address;

	public Customer() {
		custId = 0;
		name = "";
		mobile = 0;
		address = null;

	}

	public Customer(int custId, String name, int mobile, String address) {
		super();
		this.custId = custId;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", mobile=" + mobile + ", address=" + address + "]";
	}

	
}
