package exemploarrays;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class ExemploArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Metodos obx = new Metodos();
    obx.crearArray();
    obx.amosar();
    // creamos array
    
    int [] valores={1,2,3,4,5};
    obx.visualizar(valores);
        System.out.println("******************Array en Main******************************");
    int [] datos=new int [3];
   datos = obx.encherArray(datos);
    obx.visualizar(datos);
    
    }
    
}
