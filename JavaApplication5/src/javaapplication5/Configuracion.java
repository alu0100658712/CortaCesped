
package javaapplication5;

import java.awt.*;
import javax.swing.*;



public class Configuracion extends JFrame implements ActionListener{
    
    public String n;
    
    Configuracion(){
        super("Cortacesped");
        setSize(400,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout diseño = new FlowLayout();
        setLayout(diseño);
        
        
        //Componentes
        JTextField campo = new JTextField(20);
        JLabel label = new JLabel("Introduzca tamaño de ventana");
        n = campo.getText();
        
        JButton boton = new JButton("Aceptar");
        
        
        //Añadir
        add(campo);
        add(label);
        
        //Cosas de botones
        boton.addActionListener(new ActionListener()){
        public void actionPerformed (ActionEvent e){
            System.out.println("Clicked");
        }
        
    }
}
