package entities;

/**
 * @author Daniel
 *
 * 30 de mar de 2020
 */
public class AccountBank {
	private String titular;
	private final int numberAccount;
	private double saldo;
	
	public AccountBank(String titular, int numberAccount, double deposito) {
		this.titular = titular;
		this.numberAccount = numberAccount;
		depositar(deposito);
	}
	
	public AccountBank(String titular, int numberAccount) {
		this.titular = titular;
		this.numberAccount = numberAccount;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumberAccount() {
		return numberAccount;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double value) {
		this.saldo += value;
	}
	
	public void sacar(double value) {
		this.saldo -= (value + 5.00);
	}
	
	public String toString() {
		return "Account " + getNumberAccount()
				+ ", Holder: " + getTitular()
				+ ", Balance: $ " 
				+ String.format("%.2f", getSaldo());
	}
	
}
