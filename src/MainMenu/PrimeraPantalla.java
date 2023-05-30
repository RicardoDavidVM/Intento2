package MainMenu;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeraPantalla extends JFrame {
    
    JButton button;
    JLabel label1;

    PrimeraPantalla(){
        int width = 1000; // ancho de la página
        int height = 800; // altura de la página
        JFrame Menu = new JFrame();

        //ESTO ES PARA LA IMAGEN DE FONDO DEL MENU

        ImageIcon fondomenu = new ImageIcon("FondoMenu1z.PNG");
        Image fondoImagen = fondomenu.getImage();
        Image Agrandada = fondoImagen.getScaledInstance(1000,800,Image.SCALE_SMOOTH);
        ImageIcon FondoAgrandado = new ImageIcon(Agrandada);
        JLabel Labeldefondo = new JLabel(FondoAgrandado);
        Labeldefondo.setBounds(0, 0, 1000, 800);

        //ESTO ES PARA HACER EL TEXTO SOBRE EL BOTON, EL TITULO

        label1 = new JLabel("DUNGEONS OF LEGENDS");
        int labelWidth = 1000;
        int labelHeight = 300;
        int x1 =  0; //coordenada x del label de titulo
        int y1 =  0; //coordenada y del label de titulo
        label1.setBounds(x1, y1, labelWidth, labelHeight);
        label1.setForeground(new Color(245,245,245));
        label1.setFont(new Font("Georgia", Font.BOLD, 68));
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setHorizontalTextPosition(JLabel.RIGHT);
        label1.setVerticalTextPosition(JLabel.CENTER);
        Labeldefondo.add(label1);
        Menu.add(Labeldefondo);


        //ESTO ES PARA HACER EL BOTON Y LO QUE TIENE.

        button = new JButton();
        button.setPreferredSize(new Dimension(160, 60));
        int buttonWidth = 400; // ancho del botón
        int buttonHeight = 80; // altura del botón
        int x2 = (width / 2 - buttonWidth / 2); // coordenada x del botón
        int y2 = (height / 2 - buttonHeight / 2 + 80); // coordenada y del botón
        button.setBounds(x2, y2, buttonWidth, buttonHeight);
        ImageIcon fondoboton =  new ImageIcon("Imagen fondo nubes para el boton.jfif");
        button.setIcon(fondoboton);


        button.setText("COMENZAR AVENTURA");
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setForeground(new Color(139,69,19)); // Marrón oscuro.
        button.setFont(new Font("Old English Text MT", Font.BOLD,24));
        button.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(160, 82, 45)), // borde exterior marrón
                BorderFactory.createBevelBorder(BevelBorder.RAISED,
                        new Color(218, 165, 32), // borde interior dorado
                        new Color(139, 69, 19)) // borde interior marrón oscuro
        ));
        button.requestFocus();

        //lISTENER DEL BOTON

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               new Intro();
               Menu.dispose();
            }
        });

        //ESTO ES PARA CONFIGURAR EN ASPECTOS GENERALES LA PÁGINA (EL MENU)

        ImageIcon icono = new ImageIcon("Logo2.PNG");
        Menu.setIconImage(icono.getImage());
        Menu.setLayout(null);
        Menu.setSize(1000,800);
        Menu.setResizable(false);
        Menu.setLocationRelativeTo(null);
        Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out on application
        Menu.setTitle("DUNGEONS OF LEGENDS");
        Menu.setVisible(true); // make this visible
        Menu.add(button);

        }

    }
