package Aplicacion;
/**
 *
 * @author Fernando Calmet <github.com/fernandocalmet>
 */
import GUI.*;

public class Programa 
{
    public static void main(String[]args)
    {
        // TODO: Prueba de conexion a base de datos
        /*
        BaseDatos.MySql conexion = new BaseDatos.MySql();
        conexion.prueba();
        */
        
        // TODO: Crear el objeto principal del programa
        new AccesoGUI();
    }
}
