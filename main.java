


import java.util.Arrays;
import javax.swing.JOptionPane;



public class main {
    public static void main(String[] args) {
       
       //Variables
        double media;
        int n;
        
        int mediana;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de datos"));
        JOptionPane.showMessageDialog(null, "Ingresa Los Datos");
        int[] xi = new int[n];  
        int mitad = xi.length / 2;
        
        double sum = 0.0;
        
        for (int i = 0; i < xi.length; i++) {
        
            xi[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los datos"));
   
         sum+=xi[i];
         
        }
        media=sum/xi.length;
        JOptionPane.showMessageDialog(null,""+sum);
        JOptionPane.showMessageDialog(null,""+media);
        
        Arrays.sort(xi);
        
        // Si la longitud es par, se deben promediar los del centro
        if (xi.length % 2 == 0) {
            mediana = (xi[mitad - 1] + xi[mitad]) / 2;
        } else {
            mediana = xi[mitad];
        }
        
        //valores de Mediana 
        JOptionPane.showMessageDialog(null,"El arreglo es");
        for (int x = 0; x < xi.length; x++) {
            System.out.printf("%d ", xi[x]);
            System.out.printf("%d ", xi[x]);        }
        
        JOptionPane.showMessageDialog(null,"\nla mediana es %d "+ mediana);