/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author LAB06
 */
public class Calificaciones 
{
    public static void main(String[] args)
    
    {
  float nota1,nota2,nota3;
  float promedio ;
       nota1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese una nota"));  
    
       nota2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese una nota"));
       nota3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese una nota"));
       promedio =Float.parseFloat(JOptionPane.showInputDialog("Ingrese promedio"));
       

if (promedio > 4)
{
    JOptionPane.showMessageDialog(null,"Aprobo");
    
}
else
{
    JOptionPane.showMessageDialog(null,"Reprobo");
}

    }
}








    


