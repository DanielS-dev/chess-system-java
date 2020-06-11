package entities;

public class OrderItem2 {
	private Integer quantity;
	
	private Product2 product;
	
	public OrderItem2() {
		
	}

	public OrderItem2(Integer quantity, Product2 product) {
		this.quantity = quantity;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product2 getProduct() {
		return product;
	}

	public void setProduct(Product2 product) {
		this.product = product;
	}
	
	public Double subTotal() {
		return getQuantity() * getProduct().getPrice();
	}
}
