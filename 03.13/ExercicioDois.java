public class ExercicioDois {
    public static void main (String[] args) {
        int numero = 1;
        int soma = 0;

        while(numero <= 1000){
            soma = numero + soma;
            System.out.println(soma);
            numero++;
        }
    }
}