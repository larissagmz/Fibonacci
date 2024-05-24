public class Fibonacci {

    public void verFibonacci(int numero){
        int fibonacci;
        int fibonacci2 = 1;
        int resultado = 0;
        boolean isfibonacci = false;
        numero += 7;
        for (int i = 0; i <= numero; i++){

            fibonacci = resultado + fibonacci2;
            resultado = fibonacci2;
            fibonacci2 = fibonacci;
            System.out.println(resultado);
//            if( numero == fibonacci){
//
//                isfibonacci = true;
//            }
        }
   //  return isfibonacci;
    }


    public boolean isPrimo(int numero){

        for (int i = 2; i < numero; i++){

            if ( numero % i == 0){

                return false;
            }
        }
        return true;
    }

    
}
