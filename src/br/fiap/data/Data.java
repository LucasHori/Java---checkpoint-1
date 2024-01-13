package br.fiap.data;

public class Data {
	protected int dia;
	protected int mes;
	protected int ano;
	
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String getDados() 
	{
		return "dia: " + this.dia + "\n" + "mes" + this.mes + "\n" + "Ano" + this.ano;
	}
	
	public int getDia() 
	{
		return dia;
	}
	
	public int getMes() 
	{
		return mes;
	}
	
	public int GetAno() 
	{
		return ano;
	}

}
