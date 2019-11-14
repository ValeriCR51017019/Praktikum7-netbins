/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowlayout;

import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;
/**
 *
 * @author User
 */
public class Flowlayout extends JFrame {

    /**
     * @param args the command line arguments
     */
public Flowlayout (){
    
    FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 5, 10);
    
    Container container = getContentPane ();
    
    container.setLayout(flowLayout);
    
    container.add(new JButton("Tombol 1"));
    container.add(new JButton("Tombol 2"));
    container.add(new JButton("Tombol 3"));
    container.add(new JButton("Tombol 4"));
    container.add(new JButton("Tombol 5"));
}
        public static void main(String[] args) {
        Flowlayout jendela = new Flowlayout();
    jendela.setTitle("Kelas DemoFlowLayout");
    jendela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jendela.setSize(390, 120);
    jendela.setVisible(true);
    }
    
}
