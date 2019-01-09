class AberturaConta {
    public static void main (String[] args){
        Conta c = new Conta();

        c.titular = "Vanessa";
        c.agencia = "90a";
        c.numero = 1234;
        c.saldo = 10000;
        c.dataAbertura = new Data();
        c.dataAbertura.dia = 12;
        c.dataAbertura.mes = 03;
        c.dataAbertura.ano = 2003;

        //System.out.println(c.recuperarDadosParaImpressao());

        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.titular = "Maria";
        c1.saldo = 234;

        c2.titular = "Maria";
        c2.saldo = 234;

        //c2 = c1;

        if(c1 == c2){
            System.out.println("São iguais");
        }
        else {
            System.out.println("São diferentes");
        }
    
    }
}