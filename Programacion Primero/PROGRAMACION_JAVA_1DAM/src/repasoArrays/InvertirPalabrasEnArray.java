package repasoArrays;

public class InvertirPalabrasEnArray {

    /*Invertir las palabras en un array
      Escribe un programa que lea un array de String con palabras
      ingresadaspor el usuario. Luego, implementa un método que
      reciba este array y devuelva otor array de Strings con las palabras invertidas.
      Ejemplo de entrada: ["Java", "Python", "C++"]
      salida esperada["avaJ", "nohtyp", "++C"]
     */
    public static void main(String[] args) {
        String[] entrada={"Java", "Python","C++"};
        String[] salida=devuelta(entrada);


    }
    public static String[] devuelta(String[] entrada){
        String[] invertido=new String[entrada.length];

        /*for(int i=0;i<entrada.length;i++){
            invertido[i]="";
            for(int j=entrada[i].length()-1; j>=0 ; j--){
                invertido[i]+=entrada[i].charAt(j);
            }
        }*/
        String entrada2="";
        for(int i=0;i<entrada.length;i++){
            entrada2+=entrada[i] +" ";
        }
        for(int i=0;i<entrada2.length()-1;i++){
            System.out.println();
        }
        return null;
    }
}
