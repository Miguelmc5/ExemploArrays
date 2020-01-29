package exemploarrays;

/**
 *
 * @author mmartinezcosta
 */
public class Metodos {

    int [] numeros=new int [6];
    
    public void crearArray(){
        
        for (int i=0 ; i<numeros.length; i++){
            
            numeros[i]=PedirDatos.pedirInt();
        }   
    }
    public void amosar(){
        for (int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
        // Recibimos o array como parámetro
        public void visualizar(int []lista){
            for(int i=0; i<lista.length; i++)
                System.out.println("*** "+lista[i]);
            
        }
        public int [] encherArray(int [] lista){
            for(int i=0; i<lista.length; i++)
                lista[i]=PedirDatos.pedirInt();
            return lista;
        }
    }


