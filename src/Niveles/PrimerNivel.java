package Niveles;
import Selección_Personaje.*;
import javax.swing.*;
import java.awt.*;

public class PrimerNivel extends JFrame{

    public PrimerNivel(JLabel aux){


        JFrame PaginaIntro = new JFrame();

        ImageIcon fondomenu = new ImageIcon("nivel1_def.jpg");
        Image fondoImagen = fondomenu.getImage();
        Image Agrandada = fondoImagen.getScaledInstance(750,800,Image.SCALE_SMOOTH);
        ImageIcon FondoAgrandado = new ImageIcon(Agrandada);
        JLabel Labeldefondo = new JLabel(FondoAgrandado);
        Labeldefondo.setBounds(0, 0, 750, 800);

        ImageIcon fondomenu2 = new ImageIcon("nivel1_2def.jpg");
        Image fondoImagen2 = fondomenu2.getImage();
        Image Agrandada2 = fondoImagen2.getScaledInstance(750,800,Image.SCALE_SMOOTH);
        ImageIcon FondoAgrandado2 = new ImageIcon(Agrandada2);
        JLabel Labeldefondo2 = new JLabel(FondoAgrandado2);
        Labeldefondo2.setBounds(750, 0, 750, 800);

        aux.setBounds(200,350,200,275);

        PaginaIntro.add(aux);
        PaginaIntro.add(Labeldefondo2);
        PaginaIntro.add(Labeldefondo);

        ImageIcon icono = new ImageIcon("Logo2.PNG");
        PaginaIntro.setIconImage(icono.getImage());
        PaginaIntro.setTitle("DUNGEONS OF LEGENDS");
        PaginaIntro.setLayout(null);
        PaginaIntro.setSize(1500,800);
        PaginaIntro.setResizable(false);
        PaginaIntro.setLocationRelativeTo(null);
        PaginaIntro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PaginaIntro.setVisible(true);


    }
}
