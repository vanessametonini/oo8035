class Conta {
    String titular;
    String agencia;
    Data dataAbertura;
    int numero;
    double saldo;

    void saca(double valor){
        this.saldo -= valor;
    }

    void deposita(double valor){
        this.saldo += valor;
    }

    double mostraSaldo(){
        return this.saldo;
    }

    double calculaRendimento(){
        return this.saldo*0.1;
    }

    void transfereValor(double valor, Conta conta){
        this.saca(valor);
        conta.saldo += valor;
    }

    String recuperarDadosParaImpressao(){

        String dados = "Titular: "+this.titular;
        dados += "\nAgência: "+this.agencia;
        dados += "\nNúmero: "+this.numero;
        dados += "\nData de abertura: "+this.dataAbertura;
        dados += "\nSaldo: "+this.mostraSaldo();
        dados += "\nValor do rendimento: "+this.calculaRendimento();

        return dados;
    }

}

class Data {
    int dia;
    int mes;
    int ano;
}