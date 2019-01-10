class Conta {
    private String titular;
    private String agencia;
    private int numeroConta;
    private Data dataAbertura;
    private double saldo;
    private int numeroInstancia;
    private static int identificador = 0;

    Conta(){
        this.numeroInstancia = identificador;
        identificador++;
    }

    Conta(String titular){
        this.titular = titular;
    }

    static public int getIdentificador() {
        return identificador;
    }

    public int getNumeroInstancia() {
        return this.numeroInstancia;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String nome){
        this.titular = nome;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public void setAgencia(String numeroAgencia){
        this.agencia = numeroAgencia;
    }

    public Data getAbertura(){
        return this.dataAbertura;
    }

    public void setAbertura(Data novaData){
        this.dataAbertura = novaData;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta (int novoNumeroConta){
        this.numeroConta = novoNumeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void saca(double valor){
        this.saldo -= valor;
    }

    void deposita(double valor){
        this.saldo += valor;
    }

    double calculaRendimento(){
        return this.saldo*0.1;
    }

    void transfereValor(double valor, Conta conta){
        this.saca(valor);
        conta.deposita(valor);
    }

    String recuperarDadosParaImpressao(){

        String dados = "Titular: "+this.getTitular();
        dados += "\nAgência: "+this.getAgencia();
        dados += "\nNúmero: "+this.getNumeroConta();
        dados += "\nData de abertura: "+this.getAbertura();
        dados += "\nSaldo: "+this.getSaldo();
        dados += "\nValor do rendimento: "+this.calculaRendimento();
        dados += "\n Número identificador:"+this.getNumeroInstancia();

        return dados;
    }

}

class Data {
    private int dia;
    private int mes;
    private int ano;

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // public void setDia(int novoDia){
    //     this.dia = novoDia;
    // }

    public int getDia(){
        return this.dia;
    }

    // public void setMes(int novoMes) {
    //     this.mes = novoMes;
    // }

    public int getMes() {
        return this.mes;
    }

    // public void setAno(int novoAno) {
    //     this.ano = novoAno;
    // }

    public int getAno() {
        return this.ano;
    }
    
}