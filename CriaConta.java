public class CriaConta {

    public static void main(String[] args){

        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 200;

        System.out.println(primeiraConta.saldo);
        
        primeiraConta.saldo += 100;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("A primeira conta tem saldo de R$ " + primeiraConta.saldo);
        System.out.println("A segunda conta tem saldo de R$ " + segundaConta.saldo);

    }

}