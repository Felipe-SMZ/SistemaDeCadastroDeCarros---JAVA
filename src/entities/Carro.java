package entities;

public class Carro {

	public String marca;
	public String modelo;
	public int ano;
	public double velocidade;

	public Carro() {
		
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}


	public Carro(String marca, String modelo, int ano, double velocidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.velocidade = velocidade;
	}
	
	public double acelerar() {
		this.velocidade += 10;
		return this.velocidade;
	}
	
	public double acelerar(double acelerar) {
		this.velocidade += acelerar;
		return this.velocidade;
	}

	
}
