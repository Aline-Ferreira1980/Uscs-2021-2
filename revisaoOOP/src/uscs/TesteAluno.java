package uscs;

public class TesteAluno {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setNome("Paulo");
		aluno.setCodmat(55123);
		aluno.setCpf("800912345-12");
		aluno.setSexo("M");
		aluno.setNotaP1(7.0);
		aluno.setNotaP2(5.0);
		aluno.setNotaP3(8.0);
		
		aluno.imprimeAluno();
		
	}

}
