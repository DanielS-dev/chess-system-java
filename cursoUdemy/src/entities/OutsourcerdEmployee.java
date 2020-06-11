package entities;

public class OutsourcerdEmployee extends Employee3{
	private Double additionalCharge;

	public OutsourcerdEmployee() {
		super();
	}
	
	public OutsourcerdEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + getAdditionalCharge() * 1.10;
	}
	
	@Override
	public String toString() {
		return getName() + " - $ "
				+ payment() + "\n";
	}
}