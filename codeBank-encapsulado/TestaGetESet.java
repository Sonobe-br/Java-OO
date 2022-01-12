
public class TestaGetEset {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		
		Cliente daniel = new Cliente();
		
		daniel.setNome("Daniel Sonobe");
		
		conta.setTitular(daniel);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
	}
	
}
