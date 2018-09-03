
package catalogo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Catalogo extends JFrame implements ActionListener {

        JButton b=new JButton("Elfo");
        JButton b2=new JButton("Humano");
        JButton b3=new JButton("Orco");
        
        JLabel Arma=new JLabel("Arma");
        JLabel Montura=new JLabel("Montura");
        JLabel Aspecto=new JLabel("Aspecto");
        JLabel Armadura=new JLabel("Armadura");
        
        JLabel img1;
        JLabel img2;
        JLabel img3;
        JLabel img4;
        
    public static void main(String[] args) {
        
        Catalogo P=new Catalogo();
        P.setSize(700, 500);
        P.setVisible(true);
        
    }
    
    @Override
    public void paint (Graphics g){
        
        super.paint(g);
        int xpoints[] = {0, 0, 1000, 1000};
        int ypoints[] = {0, 600,600, 0};
        int npoints = 4;
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillPolygon(xpoints, ypoints, npoints);
        b.setBounds(130, 50, 100, 35);
        b.setBackground(Color.CYAN);
        b2.setBounds(130, 200, 100, 35);
        b2.setBackground(Color.CYAN);
        b3.setBounds(130, 350, 100, 35);
        b3.setBackground(Color.CYAN);

        Arma.setBounds(300, 50, 50, 20);
        Armadura.setBounds(300, 270, 75, 20);
        Aspecto.setBounds(500, 50, 50, 20);
        Montura.setBounds(500, 270, 50, 20);
        
    }
    public Catalogo(){
        
        Container c=getContentPane();
        c.setLayout(null);
        
        c.add(b);
        c.add(b2);
        c.add(b3);
        c.add(Arma);
        c.add(Montura);
        c.add(Armadura);
        c.add(Aspecto);
        
        b.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
