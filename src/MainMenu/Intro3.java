package MainMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Intro3 extends JFrame {

    JLabel Historia1,Historia2,Historia3,Historia4,Historia5,Historia6,Historia7,Historia8,Historia9,Historia10;

    Intro3(){

        JFrame PaginaIntro = new JFrame();

        //EL FONDO
        ImageIcon fondointro1 = new ImageIcon("FondoIntro1.jpg");
        Image fondoimagen1 = fondointro1.getImage();
        Image Agrandada1 = fondoimagen1.getScaledInstance(1000,800,Image.SCALE_SMOOTH);
        ImageIcon fondoagrandado1 = new ImageIcon(Agrandada1);
        JLabel labelfondo1 = new JLabel(fondoagrandado1);
        labelfondo1.setBounds(0,0,1000,800);

        Historia1 = new JLabel("Hace mucho tiempo existía una tierra sin procedentes.");
        Historia1.setBounds(70,100,700,50);
        Historia1.setForeground(new Color(139,69,19));
        Historia1.setFont(new Font("Old English Text MT", Font.BOLD, 24));
        Historia1.setHorizontalTextPosition(JLabel.LEFT);

        Historia2 = new JLabel("Un mundo repleto de criaturas cruentas y entes que mantenían");
        Historia2.setBounds(70,150,700,50);
        Historia2.setForeground(new Color(139,69,19));
        Historia2.setFont(new Font("Old English Text MT", Font.BOLD, 24));
        Historia2.setHorizontalTextPosition(JLabel.LEFT);

        Historia3 = new JLabel("el unísono con su entorno. Reinos con una muerte inexorable, ");
        Historia3.setBounds(70,200,700,50);
        Historia3.setForeground(new Color(139,69,19));
        Historia3.setFont(new Font("Old English Text MT", Font.BOLD, 24));
        Historia3.setHorizontalTextPosition(JLabel.LEFT);

        Historia4 = new JLabel("que albergaban fuerzas más allá de su comprensión.");
        Historia4.setBounds(70,250,700,50);
        Historia4.setForeground(new Color(139,69,19));
        Historia4.setFont(new Font("Old English Text MT", Font.BOLD, 24));
        Historia4.setHorizontalTextPosition(JLabel.LEFT);

        Historia5 = new JLabel("Pero un día...No sabría decirte si se hizo manifiesto ");
        Historia5.setBounds(70,300,700,50);
        Historia5.setForeground(new Color(139,69,19));
        Historia5.setFont(new Font("Old English Text MT", Font.BOLD, 24));
        Historia5.setHorizontalTextPosition(JLabel.LEFT);

        Historia6 = new JLabel("del terror humano, o era meramente un castigo ");
        Historia6.setBounds(70,350,700,50);
        Historia6.setForeground(new Color(139,69,19));
        Historia6.setFont(new Font("Old English Text MT", Font.BOLD, 24));
        Historia6.setHorizontalTextPosition(JLabel.LEFT);

        Historia7 = new JLabel("merecido por guerras y destrucción, quizás una ");
        Historia7.setBounds(70,400,500,50);
        Historia7.setForeground(new Color(139,69,19));
        Historia7.setFont(new Font("Old English Text MT", Font.BOLD, 24));
        Historia7.setHorizontalTextPosition(JLabel.LEFT);

        Historia8 = new JLabel("respuesta ante aquello que anhelábamos.");
        Historia8.setBounds(70,450,700,50);
        Historia8.setForeground(new Color(139,69,19));
        Historia8.setFont(new Font("Old English Text MT", Font.BOLD, 24));
        Historia8.setHorizontalTextPosition(JLabel.LEFT);

        Historia9 = new JLabel("U a lo mejor una respuesta...de quienes no debíamos ");
        Historia9.setBounds(70,500,700,50);
        Historia9.setForeground(new Color(139,69,19));
        Historia9.setFont(new Font("Old English Text MT", Font.BOLD, 24));
        Historia9.setHorizontalTextPosition(JLabel.LEFT);

        Historia10 = new JLabel("involucrarnos, una respuesta que cambiaría todo.");
        Historia10.setBounds(70,550,700,50);
        Historia10.setForeground(new Color(139,69,19));
        Historia10.setFont(new Font("Old English Text MT", Font.BOLD, 24));
        Historia10.setHorizontalTextPosition(JLabel.LEFT);


        ImageIcon fondoboton = new ImageIcon("BotonesPasarAdelante1.png");
        Image fondoimagen2 = fondoboton.getImage();
        Image Agrandada2 = fondoimagen2.getScaledInstance(200,75,Image.SCALE_SMOOTH);
        ImageIcon fondoagrandado2 = new ImageIcon(Agrandada2);
        JLabel labelfondo2 = new JLabel(fondoagrandado2);
        labelfondo2.setBounds(750,650,200,75);

        labelfondo2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                new Intro4();
                PaginaIntro.dispose();
            }
        });

        JLabel textoboton = new JLabel();
        textoboton.setText("Continuar");
        textoboton.setBounds(800,650,200,75);
        textoboton.setForeground(new Color(245,245,245));
        textoboton.setFont(new Font("Old English Text MT", Font.BOLD, 24));
        textoboton.setHorizontalTextPosition(JLabel.LEFT);


        labelfondo1.add(Historia1);
        labelfondo1.add(Historia2);
        labelfondo1.add(Historia3);
        labelfondo1.add(Historia4);
        labelfondo1.add(Historia5);
        labelfondo1.add(Historia6);
        labelfondo1.add(Historia7);
        labelfondo1.add(Historia8);
        labelfondo1.add(Historia9);
        labelfondo1.add(Historia10);
        PaginaIntro.add(textoboton);
        PaginaIntro.add(labelfondo2);
        PaginaIntro.add(labelfondo1);

        ImageIcon icono = new ImageIcon("Logo2.PNG");
        PaginaIntro.setIconImage(icono.getImage());
        PaginaIntro.setTitle("DUNGEONS OF LEGENDS");
        PaginaIntro.setLayout(null);
        PaginaIntro.setSize(1000,800);
        PaginaIntro.setResizable(false);
        PaginaIntro.setLocationRelativeTo(null);
        PaginaIntro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PaginaIntro.setVisible(true);

    }
}

