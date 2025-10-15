package repasoArrays;

public class ArrayCadenaTexto {

    /*Implementa y utiliza un metodo que reciba un array de cadenas de texto y devuelva un array
      de enteros con las longitudes de dichas cadenas y devuelva al final en un alemento independiente
      el índice en el que se encontraba la cadena de mayor longitud.
      Si recibe el array ["juan", "pepito", "juanito","luis"] devolverá [4,6,7,4,2] ya que el 2 indica
      que juanito es la palabra con mayor tamaño (indice 2).*/


    public static void main(String[] args) {

        String [] palabras= {"juan","amador","pedro"};

       // int [] tamano = longitudIndice(longitudIndice());
    }
    public static int longitudIndice(String[]palabras){
        int indice=0;
        for(int i=0;i<palabras.length;i++){
            System.out.println(palabras[i]);
            indice++;
        }
        return indice;

    }


}
