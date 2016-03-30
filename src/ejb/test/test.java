package ejb.test;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import safe.beans.NewSessionBean;

public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic heres
         
       try {
            NewSessionBean remote = (NewSessionBean) new InitialContext().lookup("java:global/SafeLoginID/NewSessionBean");
           System.out.println("*********************************************************8");
            String num = remote.pruebaEJB();
            System.out.println(num);
            //LOGGER.log(Level.INFO, "factorial de {0}={1}", new Object[]{base, num});
        } catch (NamingException ex) {
            //LOGGER.log(Level.SEVERE, null, ex);
        }
        
    }
    
}
