package module6;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer();
		System.out.println(customer);
		//System.out.println("custId is" + customer.getCustId());
		//System.out.println("name is" + customer.getName());
		//System.out.println("mobile  is" + customer.getMobile());
		//System.out.println("adress is" + customer.getAddress());
		//System.out.println("============");

		System.out.println("creating new object");
		Customer customer1 = new Customer(3, "Akshay", 80100354, "jalgoan");
		//System.out.println("custId is" + customer1.getCustId());
		//System.out.println("name is" + customer1.getName());
		//System.out.println("mobile  is" + customer1.getMobile());
		//System.out.println("adress is" + customer1.getAddress());

		System.out.println(customer1);

	}

}
