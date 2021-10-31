package uscs;

import java.text.DecimalFormat;

public class Aluno {

	private String nome;
	private int codmat;
	private String cpf;
	private String sexo;
	private double notaP1;
	private double notaP2;
	private double notaP3;
	
	DecimalFormat df = new DecimalFormat("#,##");
	
	public Aluno() {}
	public Aluno(String nome,int codmat, String sexo, String cpf, double notaP1, double notaP2, double notaP3 ) {
		this.nome = nome;
		this.codmat = codmat;
		this.cpf = cpf;
		this.sexo= sexo;
		this.notaP1= notaP1;
		this.notaP2 = notaP2;
		this.notaP3 = notaP3;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCodmat(int codmat) {
		this.codmat = codmat;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setNotaP1(double notaP1) {
		this.notaP1 = notaP1;
	}
	public void setNotaP2(double notaP2) {
		this.notaP2 = notaP2;
	}
	public void setNotaP3(double notaP3) {
		this.notaP3 = notaP3;
	}
	
	
	public String getNome() {
		return nome;
	}
	public int getCodmat() {
		return codmat;
	}
	public String getCpf() {
		return cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public double getNotaP1() {
		return notaP1;
	}
	public double getNotaP2() {
		return notaP2;
	}
	public double getNotaP3() {
		return notaP3;
	}
	
	public void imprimeAluno(){
		System.out.println("Aluno: " + this.nome + "\nCódigo de matrícula: " + this.codmat +"\nCPF: " + this.cpf + "\nNota P1: "+ this.notaP1 + "\nNota P2: "+ this.notaP2 +  "\nNota P3: "+ this.notaP3 +  "\n\nMédia: " + mediaAluno (notaP1, notaP2, notaP3) + "\n\nResultado: " + imprimeResultado()  );
	}
	private double mediaAluno(double notaP1, double notaP2, double notaP3) {
		double media = (notaP1 + notaP2 + notaP3)/3;
		return Double.valueOf(df.format(media));
	}
	private String imprimeResultado() {
		if (mediaAluno(notaP1, notaP2, notaP3) >= 6) {
			return "Aprovado, Parabéns!!!";
		}else {
			return "Reprovado, não foi dessa vez :( ";
		}
	}
	
	
}
