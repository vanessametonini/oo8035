public class CompraPagamento {

    public static void main (String [] args) {

        int compra = 2000;
        int qtd = 4;
        int pgto;


        if(compra > 1000 || qtd >= 3){
            pgto = compra * 0.9;
        }
        else if (qtd > 6){
            pgto = compra * 0.9;
        }
        else {
            pgto = compra;
        }
    }

    
}