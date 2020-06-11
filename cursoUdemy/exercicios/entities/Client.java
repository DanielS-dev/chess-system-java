package entities;

import java.util.Date;

public class Client {
	private String name;
	private String email;
	private Date birthDate;
	
	private Order2 order;
	
	public Client() {
		
	}

	public Client(String name, String email, Date birthDate, Order2 order) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Order2 getOrder() {
		return order;
	}

	public void setOrder(Order2 order) {
		this.order = order;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order momment: " + order.getMoment() + "\n");
		sb.append("Order status: " + order.getStatus() + "\n");
		sb.append("Client: " + getName());
		sb.append(" (" + getBirthDate() + ")");
		sb.append(" - " + getEmail() + "\n");
		sb.append("Order items:\n");
		for(OrderItem2 items : order.getOrderItem()) {
			sb.append(items.getProduct().getName() + ", ");
			sb.append("Quantity: " + items.getQuantity() + ", ");
			sb.append("SubTotal: $" + items.subTotal() + "\n");
		}
		sb.append("Total Price: $" + order.total());
		
		return sb.toString();
	}
}
