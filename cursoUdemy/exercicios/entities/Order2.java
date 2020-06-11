package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus2;

public class Order2 {
	
	private Date moment;
	private OrderStatus2 status;
	
	private List<OrderItem2> orderItem = new ArrayList<>();
	
	public Order2() {
		
	}

	public Order2(Date moment, OrderStatus2 status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus2 getStatus() {
		return status;
	}

	public void setStatus(OrderStatus2 status) {
		this.status = status;
	}

	public List<OrderItem2> getOrderItem() {
		return orderItem;
	}

	public void addOrderItem(OrderItem2 order) {
		orderItem.add(order);
	}
	
	public void removeOrderItem(OrderItem2 order) {
		orderItem.remove(order);
	}
	
	public Double total() {
		Double total = 0.0;
		for (OrderItem2 order : orderItem) {
			total += order.subTotal();
		}
		
		return total;
	}
}
