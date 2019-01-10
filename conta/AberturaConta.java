class AberturaConta {
    public static void main (String[] args){
        Conta c = new Conta();

        c.setTitular("Vanessa");
        c.setAgencia("90a");
        c.setNumeroConta(1234);
        c.setSaldo(10000);
        c.setAbertura(new Data(12, 03, 2004));

        //System.out.println(c.recuperarDadosParaImpressao());

        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.setTitular("Maria");
        c1.setSaldo(234);

        c1.setTitular("Maria");
        c2.setSaldo(234);

        //c2 = c1;

        if(c1 == c2){
            System.out.println("São iguais");
        }
        else {
            System.out.println("São diferentes");
        }
        System.out.println("Conta 00");
        System.out.println(c.recuperarDadosParaImpressao());
        System.out.println("Conta 01");
        System.out.println(c1.recuperarDadosParaImpressao());
        System.out.println("Conta 02");
        System.out.println(c2.recuperarDadosParaImpressao());
        System.out.println(Conta.getIdentificador());

    }
}