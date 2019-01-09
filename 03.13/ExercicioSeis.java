public class ExercicioSeis {
    public static void main (String[] args){

        long fibonacci = 0;
        long increment = 1;
        int condicao = 144;

        while(fibonacci <= condicao){

            System.out.println(fibonacci + "f");

            if(increment < condicao){
                System.out.println(increment + "i");
            }

            fibonacci = fibonacci + increment;
            increment = increment + fibonacci;

        }
    }
}