public class PalabraThis {
    public static void main(String[] args) {
       Persona persona =new Persona("juan");

    }


}
class Persona{
    String nombre;

    Persona (String nombre){ // este es el constructor
        this.nombre = nombre;// this apunta  a un objeto de tipo persona
        /// imprimir el objeto persona
        Imprimir imprimir =new Imprimir();
        imprimir.imprimir(this);// this contiene una referencia al objeto persona

    }

}

class Imprimir {

    public void imprimir(Persona p){// este es un metodo que resive un objeto de tipo persona
        System.out.println("impresion de argumento = " + p);// valor del objeto perona
        System.out.println("impresion objeto actual (this)" + this);// thus apunta a un objeto de tipo imprimir
    }
}