import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("volume: " + smartTv.volume);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite canal: ");
        int novoCanal = scanner.nextInt();
        smartTv.canal = novoCanal;
        scanner.close();

        System.out.println("Canal: " + smartTv.canal);


    }
}
