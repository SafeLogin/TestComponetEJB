package ejb.test;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import safe.beans.InterfaceBaseDeDatos;



public class test {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)  {
        try {
            Properties prop= new Properties();
            prop.setProperty("org.omg.CORBA.ORBInitialHost","localhost");
            prop.setProperty("org.omg.CORBA.ORBInitialPort","3700");

            InitialContext inc= new InitialContext(prop);
            
            InterfaceBaseDeDatos bean = (InterfaceBaseDeDatos) inc.lookup("java:global/SafeLoginID/SessionBeanBaseDeDatos");
            //System.out.println(bean.insertarUsuario());
            System.out.println(bean.LlamadoBaseAprocLog());
            
        } catch (NamingException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
            

    
    }
}