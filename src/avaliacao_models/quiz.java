package avaliacao_models;

import java.util.Date;


public class quiz {
	 
	private String nome;
	private int id_Curso;
	private Date data_Inicio;
	private Date data_Fim;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId_Curso() {
		return id_Curso;
	}
	public void setId_Curso(int id_Curso) {
		this.id_Curso = id_Curso;
	}
	public Date getData_Inicio() {
		return data_Inicio;
	}
	public void setData_Inicio(Date data_Inicio) {
		this.data_Inicio = data_Inicio;
	}
	public Date getData_Fim() {
		return data_Fim;
	}
	public void setData_Fim(Date data_Fim) {
		this.data_Fim = data_Fim;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_Curso;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		quiz other = (quiz) obj;
		if (id_Curso != other.id_Curso)
			return false;
		return true;
	}
	
	
	
	
	

}
