package br.fiap.consulta;
import br.fiap.Paciente.*;
import br.fiap.data.*;
import br.fiap.Medico.*;

public class Consulta {
	private Data data;
	private Paciente paciente;
	private Medico medico;
	
	
	public Consulta (Data data, Paciente paciente, Medico medico) 
	{
		this.data = data;
		this.paciente = paciente;
		this.medico = medico;
				
	}

	public String getDados() 
	{
		return "data: " + this.data + "\n" + "Paciente" + this.paciente + "\n" 
	+ "Medico" + medico;
		
	}

	public Data getData() {
		return data;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public Medico getMedico() {
		return medico;
	}
	
	


}
