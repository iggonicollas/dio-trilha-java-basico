public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        for(int numero = 1; numero <=5; numero ++){
            if (numero == 3)
                break;
                System.out.println(numero);
                //ele nao conta do 3 pra cima
        }

        for(int numero = 1; numero <=5; numero ++){
            if (numero == 3)
                continue;
                System.out.println(numero);
                //ele pula o 3 e segue contagem
        }
    }
}
