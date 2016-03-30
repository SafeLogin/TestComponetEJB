package ejb.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import safe.beans.ReomoteBeanRemote;
import javax.naming.*;

public class test {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)  {
        try {
            System.out.println("1**********************************************************1");
            
            InitialContext ic=new InitialContext();
            System.out.println("2**********************************************************1");
            
            ReomoteBeanRemote bean = (ReomoteBeanRemote) ic.lookup("safe.beans.ReomoteBeanRemote");
            System.out.println("3**********************************************************1");
            
            System.out.println(bean.Listausuarios());
        } catch (Exception ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
        
        
        
    }
    
}
