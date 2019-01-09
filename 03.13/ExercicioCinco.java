public class ExercicioCinco {
    public static void main (String[] args){
        long fatorial = 1;
        int valor = 40;

        for(int n = 1; n <= valor; n++ ){

            fatorial = fatorial * n;

            System.out.println( "O fatorial de " + n + " é igual a " + fatorial );

        }
    }
}