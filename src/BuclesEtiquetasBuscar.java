public class BuclesEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "Tres tristes tigres, tragan trigo en un trigal";
        int max = frase.length();
        int cantidad = 0;
        char letra = 't';

        for (int m = 0; m < max; m++) {
            if (frase.charAt(m) != letra){
                continue;
            }

            cantidad++;
        }

        System.out.println("Se encontró " + cantidad + " veces el caracter " + letra);

        System.out.println("--------------------------------------------------------------------");
        String palabra = "tigre";
        int maxPalabra = palabra.length();
        int veces  = 0;

        buscar:
        for (int i = 0; i <= (max - maxPalabra); i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if(frase.charAt(k++) != palabra.charAt(j))
                    continue buscar;
            }
            veces++;
        }

        System.out.println("Se encontró " + veces + " veces la palabra " +palabra);

    }
}
