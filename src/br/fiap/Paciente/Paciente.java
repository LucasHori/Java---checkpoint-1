package br.fiap.Paciente;

public class Paciente {

	protected String cpf;
	protected String nome;
	
	
	public Paciente(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}
	
	
	public String getCpf() 
	{
		return cpf;
	}
	
	public String getNome() 
	{
		return nome;
	}
	public String getDados() 
	{
		return "Cpf: " + this.cpf + "\n" + "nome" + this.nome + "\n";
	}
}
