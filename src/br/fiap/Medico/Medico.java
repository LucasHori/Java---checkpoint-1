package br.fiap.Medico;

public class Medico {
	protected String nome;
	protected String especialidade;
	
	public Medico(String nome, String especalidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public String getDados() 
	{
		return "Nome: " + this.nome + "\n" + "Especialidade" + this.especialidade + "\n";
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public String getEspecialidade() 
	{
		return especialidade;
	}

}
