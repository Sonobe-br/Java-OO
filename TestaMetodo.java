
public class TestaMetodo {

    public static void main (String[] args) {

        Conta contaDoDaniel = new Conta();

        contaDoDaniel.saldo = 100;
        contaDoDaniel.deposita (50);

        System.out.println(contaDoDaniel.saldo);

        boolean saqueRealizadoComSucesso = contaDoDaniel.sacar(30); 
        System.out.println(contaDoDaniel.saldo);
        System.out.println(saqueRealizadoComSucesso);

        Conta contaDoPedro = new Conta();

        contaDoPedro.saldo = 1000;

        if(contaDoPedro.transfere(200, contaDoDaniel)){

            System.out.println("Transferencia Realizada com Sucesso");
            
        } else {
            
            System.out.println("Saldo Insulficiente");

        }

        System.out.println(contaDoPedro.saldo);
        System.out.println(contaDoDaniel.saldo);

    }

}