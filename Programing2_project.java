
package programing2_project;

import javax.swing.JFrame;

public class Programing2_project {

    
    
    public static void main(String args[]){
    
        
       JFrame m  =new JFrame();
       Mainframe mf = new Mainframe();
       
        m.setSize(500, 450);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
        m.setResizable(false);
        m.add(mf);
        
         
    
    
    }
    
}
