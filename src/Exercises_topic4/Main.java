package Exercises_topic4;

public class Main {
    public static void main(String[] args) {

        int numeroIf = -50;

        if(numeroIf  >= 0){
            System.out.println("Numero positivo");
        }else{
            System.out.println("Numero Negativo");
        }

        int numeroWhile = 0;

        while(numeroWhile < 3){
            System.out.println( "Numero While:" + numeroWhile);
            numeroWhile++;
        }
        
        do {
            System.out.println( "Numero Do While:" + numeroWhile);
            numeroWhile++;
        }while(numeroWhile < 3);

        int numeroFor = 0;

        for(; numeroFor <= 3; numeroFor++){
            System.out.println( "Numero For:" + numeroFor);
        }

        String estacion = "invierno";


        switch(estacion){
            case "verano":
                System.out.println( "Estamos en Verano");
                break;
            case "otoño":
                System.out.println( "Estamos en Otoño");
                break;
            case "invierno":
                System.out.println( "Estamos en Invierno");
                break;
            default:
                System.out.println( "Estamos en Primavera");
                break;

        }
    }


}