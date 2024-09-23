public class AaBusquedaSecuencial {
    // lo bueno de aprender diferentes tipos de ordenamiento es para que puedas
    // tener idea de como ordenar en diferentes situaciones
    public static void main(String[] args) {

        /* 001 busqueda secuencial
         * 
         * busqueda secuencial
         * se suele usar para buscar un dato como "29" o "maria"
         * 
         * si el dato buscado esta en 0 de un array solo se necesitara una comparacion
         * en cambio sino se buscara n veces
         * 
         * pongamos de ejemplo un registro de 10 mil datos, es conveniente?
         */
        int[] arreglo = { 10, 12, 13, 15, 17, 18, 10, 23, 53 };
        int elemento = 10;

        //ponemos en una variable el resultado
        int resultado = busquedaSecuencial(arreglo, elemento);
        //imprimimos el "resultado"
        
        if (resultado == -1){
            System.out.println(" \n El elemento no esta en el arreglo");
        }else{
            System.out.println(" \n El elemento si esta en el arreglo en la posicion " + resultado);
        }
    }

    public static int busquedaSecuencial(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return i; // devuelve i si encuentra el elemento
            }
        }
        return -1; // si no encuentra ningun valor igual a "elemento" devuelve -1
    }

}