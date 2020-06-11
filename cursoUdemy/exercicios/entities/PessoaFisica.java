package entities;

public class PessoaFisica extends Pessoa{
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double imposto() {
		double impostoValue = 0.0;
		if (getRendaAnual() < 20000.0) {
			impostoValue += getRendaAnual() * 0.15;
		}
		else if (getRendaAnual() >= 20000.0) {
			impostoValue += getRendaAnual() * 0.25;
		}
		
		if (getGastosSaude() > 0) {
			impostoValue -= getGastosSaude() * 0.50;
		}
		
		return impostoValue;
	}
	
	@Override
	public String toString() {
		return getNome() + ": $" +
				String.format("%.2f", imposto());
	}

}
