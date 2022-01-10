
public class TestaMetodo {

    public static void main (String[] args) {

        Conta contaDoPrimeiroCliente = new Conta();
        
        contaDoPrimeiroCliente.saldo = 100;
        contaDoPrimeiroCliente.deposita (50);
        
        boolean operacaoComSucesso = contaDoPrimeiroCliente.sacar(30);
         
        System.out.println(contaDoPrimeiroCliente.saldo);
        System.out.println(operacaoComSucesso);

    }

}