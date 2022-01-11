
class Conta {

    Private double saldo;
    int agencia;
    int numero;
    Cliente titular; // = new Cliente();

    void deposita(double valor) {

        this.saldo += valor; 

    }

    public boolean sacar(double valor) {

        if(this.saldo >= valor) {

            this.saldo -= valor;
            return true;

        } else {

            return false;

        }

    }

    public boolean transfere(double valor, Conta destino) {

        if(this.saldo >= valor) {

            this.saldo -= valor;
            destino.destino(valor);

            return true; 
        
        } else {

            retuurn false; 

        }

    }

    public double pegarSaldo() {
        
        return this.saldo;

    }

}