public class TiposVariaveis {
   
    public static void main(String[] args) {
        int a,b;
        a=5;
        b=6;

        String resultado = a==b ?"cahorro" : "gato";
        boolean booleanResultado = Boolean.parseBoolean(resultado);

        System.out.println(booleanResultado);

    }
}
