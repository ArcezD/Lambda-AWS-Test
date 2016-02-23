package cr.arce.aws;

import com.amazonaws.services.lambda.runtime.Context;
import cr.arce.test.modelos.*;

/**
 * Hello world!
 *
 */

public class App {

    public static Respuesta a(Persona persona, Context context){
        String respuestaTexto = String.format("Hola: %s %s.", persona.getNombre(), persona.getApellido());
        return new Respuesta(respuestaTexto);
    }
    
    public static Respuesta holaMundoHandler(){
        String respuestaTexto = String.format("Hola Mundo!");
        return new Respuesta(respuestaTexto);
    }
    
}