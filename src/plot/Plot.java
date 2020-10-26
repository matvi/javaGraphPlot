
package plot;

//import java.util.StringTokenizer;

import javax.swing.JOptionPane;


/**
 *
 * @author rick
 */
public class Plot {

    public static int c3,c2,c1,c;
    public static void main(String[] args) {
 //       int c4 = Integer.parseInt(JOptionPane.showInputDialog("dame el valor de []x^4"));
//        String signo4 = JOptionPane.showInputDialog("signo");
         c3 = Integer.parseInt(JOptionPane.showInputDialog("dame el valor de []x^3"));
//        String signo3 = JOptionPane.showInputDialog("signo");
         c2 = Integer.parseInt(JOptionPane.showInputDialog("dame el valor de []x^2"));
////        String signo2 = JOptionPane.showInputDialog("signo");
         c1 = Integer.parseInt(JOptionPane.showInputDialog("dame el valor de []x"));
////        String signo1 = JOptionPane.showInputDialog("signo");
         c = Integer.parseInt(JOptionPane.showInputDialog("dame el valor []"));
        
//        String ecuacion = JOptionPane.showInputDialog("dame la ecuacion f(x)=");

//StringTokenizer tokens = new StringTokenizer(ecuacion);  
//while(tokens.hasMoreTokens()){  
//System.out.println(tokens.nextToken());  
    new graphic().setVisible(true);
                
    }


}
