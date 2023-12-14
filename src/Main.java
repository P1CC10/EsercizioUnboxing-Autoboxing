public class Main {
    public static void main(String[]args){

        // int in input e stampa sommaInt
        int numero1 = 6;
        int numero2 = 8;
        sommaInt(numero1,numero2);
        System.out.println("la somma è= "+sommaInt(numero1,numero2));

        //charatter e richiamo funzione
        char char1='a';
        stampaChar(char1);

        // integer i input e stampa
        Integer numeroInteger1 = 6;
        Integer numeroInteger2 = 12;
        sommaInteger(numeroInteger1,numeroInteger2);
        System.out.println("la somma è= "+sommaInteger(numeroInteger1,numeroInteger2));

        //Character e richiamo funzione
        Character character='C';
        stampaCharacter(character);

        //primitvi per Autoboxing
        int num1=1;
        double num2 = 1.0;
        char char3='A';
        Integer numInteger = num1;
        Double numDouble = num2;
        Character charCharacter= char3;

        //oggetti per Unboxing
        Integer numInteger1= 8;
        Double numDouble1 = 12.0;
        Character charCharacter1='D';
        int numInt = numInteger1;
        double numDoub = numDouble1;
        char charChar = charCharacter1;

    }

    //metodo per somma
    public static int sommaInt(int numero1,int numero2) {
        int somma1 = numero1 + numero2;
        return somma1;
    }

    //metodo per stampare char
    public static void stampaChar(char char1){
        System.out.println("il carattere è= "+char1 );
    }

    //metodo per sommare Integer
    public static int sommaInteger(Integer numeroInteger1,Integer numeroInteger2){
        int somma2 = numeroInteger1 + numeroInteger2;
        return somma2;
    }

    //metodo per stampare Character
    public static void stampaCharacter(Character character){
        System.out.println("il carattere è= "+ character);
    }
}
