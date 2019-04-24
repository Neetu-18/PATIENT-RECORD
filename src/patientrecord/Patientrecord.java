
package patientrecord;
import javax.swing.UIManager;
/**
 *
 * @author jitender singh
 */
public class Patientrecord {

    public static void main(String[] args) {
        try{
           for(UIManager.LookAndFeelInfo info:UIManager.getInstalledLookAndFeels()){
               if(info.getName().equals("Nimbus")){
                   UIManager.setLookAndFeel(info.getClassName());
                  
                       
                  
                   
                   break;
                   
               }
               
                       
                       }
           }
       catch(Exception e){
       
    }
       new MainFrame().setVisible(true);
      
       
    }
    }
    

