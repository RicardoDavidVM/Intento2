package Selección_Personaje;

import MainMenu.Intro2;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import java.awt.*;

public class Selec2 {

    public Selec2(){
        JFrame PaginaIntro = new JFrame();

        ImageIcon fondointro1 = new ImageIcon("Fondo_Seleccion_Personaje.PNG");
        Image fondoimagen1 = fondointro1.getImage();
        Image Agrandada1 = fondoimagen1.getScaledInstance(333,400,Image.SCALE_SMOOTH);
        ImageIcon fondoagrandado1 = new ImageIcon(Agrandada1);
        JLabel labelfondo1 = new JLabel(fondoagrandado1);
        labelfondo1.setBounds(0,-30,333,400);
        labelfondo1.setVisible(true);


        ImageIcon fondointro2 = new ImageIcon("Fondo_Seleccion_Personaje.PNG");
        Image fondoimagen2 = fondointro2.getImage();
        Image Agrandada2 = fondoimagen2.getScaledInstance(333,400,Image.SCALE_SMOOTH);
        ImageIcon fondoagrandado2 = new ImageIcon(Agrandada2);
        JLabel labelfondo2 = new JLabel(fondoagrandado2);
        labelfondo2.setBounds(333,-30,333,400);
        labelfondo2.setVisible(true);

        ImageIcon fondointro3 = new ImageIcon("Fondo_Seleccion_Personaje.PNG");
        Image fondoimagen3 = fondointro3.getImage();
        Image Agrandada3 = fondoimagen3.getScaledInstance(333,400,Image.SCALE_SMOOTH);
        ImageIcon fondoagrandado3 = new ImageIcon(Agrandada3);
        JLabel labelfondo3 = new JLabel(fondoagrandado3);
        labelfondo3.setBounds(666,-30,333,400);
        labelfondo3.setVisible(true);

        ImageIcon fondointro4 = new ImageIcon("Fondo_Seleccion_Personaje.PNG");
        Image fondoimagen4 = fondointro4.getImage();
        Image Agrandada4 = fondoimagen4.getScaledInstance(333,400,Image.SCALE_SMOOTH);
        ImageIcon fondoagrandado4 = new ImageIcon(Agrandada4);
        JLabel labelfondo4 = new JLabel(fondoagrandado4);
        labelfondo4.setBounds(0,370,333,400);
        labelfondo4.setVisible(true);

        ImageIcon fondointro5 = new ImageIcon("Fondo_Seleccion_Personaje.PNG");
        Image fondoimagen5 = fondointro5.getImage();
        Image Agrandada5 = fondoimagen5.getScaledInstance(333,400,Image.SCALE_SMOOTH);
        ImageIcon fondoagrandado5 = new ImageIcon(Agrandada5);
        JLabel labelfondo5 = new JLabel(fondoagrandado5);
        labelfondo5.setBounds(333,370,333,400);
        labelfondo5.setVisible(true);

        ImageIcon fondointro6 = new ImageIcon("Fondo_Seleccion_Personaje.PNG");
        Image fondoimagen6 = fondointro6.getImage();
        Image Agrandada6 = fondoimagen6.getScaledInstance(333,400,Image.SCALE_SMOOTH);
        ImageIcon fondoagrandado6 = new ImageIcon(Agrandada6);
        JLabel labelfondo6 = new JLabel(fondoagrandado6);
        labelfondo6.setBounds(666,370,333,400);
        labelfondo6.setVisible(true);

        //Personajes

        ImageIcon personaje1 = new ImageIcon("darius_splash.jpg");
        Image imagenpersonaje1 = personaje1.getImage();
        Image Agrandadapersonaje1 = imagenpersonaje1.getScaledInstance(200,275,Image.SCALE_SMOOTH);
        ImageIcon personajeagrandado1 = new ImageIcon(Agrandadapersonaje1);
        JLabel labelpersonaje1 = new JLabel(personajeagrandado1);
        labelpersonaje1.setBounds(70,40,200,275);
        labelpersonaje1.setVisible(true);
        labelpersonaje1.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(160, 82, 45)), // borde exterior marrón
                BorderFactory.createBevelBorder(BevelBorder.RAISED,
                        new Color(218, 165, 32), // borde interior dorado
                        new Color(139, 69, 19)) // borde interior marrón oscuro
        ));
        //agranda la imagen al pasar el ratón por encima y la vuelve a su tamaño original al salir
        labelpersonaje1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ImageIcon personaje1 = new ImageIcon("darius_splash.jpg");
                Image imagenpersonaje1 = personaje1.getImage();
                Image Agrandadapersonaje1 = imagenpersonaje1.getScaledInstance(250,350,Image.SCALE_SMOOTH);
                ImageIcon personajeagrandado1 = new ImageIcon(Agrandadapersonaje1);
                labelpersonaje1.setIcon(personajeagrandado1);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImageIcon personaje1 = new ImageIcon("darius_splash.jpg");
                Image imagenpersonaje1 = personaje1.getImage();
                Image Agrandadapersonaje1 = imagenpersonaje1.getScaledInstance(200,275,Image.SCALE_SMOOTH);
                ImageIcon personajeagrandado1 = new ImageIcon(Agrandadapersonaje1);
                labelpersonaje1.setIcon(personajeagrandado1);
            }
        });



        ImageIcon personaje2 = new ImageIcon("ww_splash.jpg");
        Image imagenpersonaje2 = personaje2.getImage();
        Image Agrandadapersonaje2 = imagenpersonaje2.getScaledInstance(200,275,Image.SCALE_SMOOTH);
        ImageIcon personajeagrandado2 = new ImageIcon(Agrandadapersonaje2);
        JLabel labelpersonaje2 = new JLabel(personajeagrandado2);
        labelpersonaje2.setBounds(400,40,200,275);
        labelpersonaje2.setVisible(true);
        labelpersonaje2.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(160, 82, 45)), // borde exterior marrón
                BorderFactory.createBevelBorder(BevelBorder.RAISED,
                        new Color(218, 165, 32), // borde interior dorado
                        new Color(139, 69, 19)) // borde interior marrón oscuro
        ));
        labelpersonaje2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ImageIcon personaje2 = new ImageIcon("ww_splash.jpg");
                Image imagenpersonaje2 = personaje2.getImage();
                Image Agrandadapersonaje2 = imagenpersonaje2.getScaledInstance(250,350,Image.SCALE_SMOOTH);
                ImageIcon personajeagrandado2 = new ImageIcon(Agrandadapersonaje2);
                labelpersonaje2.setIcon(personajeagrandado2);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImageIcon personaje2 = new ImageIcon("ww_splash.jpg");
                Image imagenpersonaje2 = personaje2.getImage();
                Image Agrandadapersonaje2 = imagenpersonaje2.getScaledInstance(200,275,Image.SCALE_SMOOTH);
                ImageIcon personajeagrandado2 = new ImageIcon(Agrandadapersonaje2);
                labelpersonaje2.setIcon(personajeagrandado2);
            }
        });

        ImageIcon personaje3 = new ImageIcon("garen_splash.jpg");
        Image imagenpersonaje3 = personaje3.getImage();
        Image Agrandadapersonaje3 = imagenpersonaje3.getScaledInstance(200,275,Image.SCALE_SMOOTH);
        ImageIcon personajeagrandado3 = new ImageIcon(Agrandadapersonaje3);
        JLabel labelpersonaje3 = new JLabel(personajeagrandado3);
        labelpersonaje3.setBounds(730,40,200,275);
        labelpersonaje3.setVisible(true);
        labelpersonaje3.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(160, 82, 45)), // borde exterior marrón
                BorderFactory.createBevelBorder(BevelBorder.RAISED,
                        new Color(218, 165, 32), // borde interior dorado
                        new Color(139, 69, 19)) // borde interior marrón oscuro
        ));
        labelpersonaje3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ImageIcon personaje3 = new ImageIcon("garen_splash.jpg");
                Image imagenpersonaje3 = personaje3.getImage();
                Image Agrandadapersonaje3 = imagenpersonaje3.getScaledInstance(250,350,Image.SCALE_SMOOTH);
                ImageIcon personajeagrandado3 = new ImageIcon(Agrandadapersonaje3);
                labelpersonaje3.setIcon(personajeagrandado3);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImageIcon personaje3 = new ImageIcon("garen_splash.jpg");
                Image imagenpersonaje3 = personaje3.getImage();
                Image Agrandadapersonaje3 = imagenpersonaje3.getScaledInstance(200,275,Image.SCALE_SMOOTH);
                ImageIcon personajeagrandado3 = new ImageIcon(Agrandadapersonaje3);
                labelpersonaje3.setIcon(personajeagrandado3);
            }
        });

        ImageIcon personaje4 = new ImageIcon("Ahri_splash.jpg");
        Image imagenpersonaje4 = personaje4.getImage();
        Image Agrandadapersonaje4 = imagenpersonaje4.getScaledInstance(200,275,Image.SCALE_SMOOTH);
        ImageIcon personajeagrandado4 = new ImageIcon(Agrandadapersonaje4);
        JLabel labelpersonaje4 = new JLabel(personajeagrandado4);
        labelpersonaje4.setBounds(70,430,200,275);
        labelpersonaje4.setVisible(true);
        labelpersonaje4.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(160, 82, 45)), // borde exterior marrón
                BorderFactory.createBevelBorder(BevelBorder.RAISED,
                        new Color(218, 165, 32), // borde interior dorado
                        new Color(139, 69, 19)) // borde interior marrón oscuro
        ));
        labelpersonaje4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ImageIcon personaje4 = new ImageIcon("Ahri_splash.jpg");
                Image imagenpersonaje4 = personaje4.getImage();
                Image Agrandadapersonaje4 = imagenpersonaje4.getScaledInstance(250,350,Image.SCALE_SMOOTH);
                ImageIcon personajeagrandado4 = new ImageIcon(Agrandadapersonaje4);
                labelpersonaje4.setIcon(personajeagrandado4);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImageIcon personaje4 = new ImageIcon("Ahri_splash.jpg");
                Image imagenpersonaje4 = personaje4.getImage();
                Image Agrandadapersonaje4 = imagenpersonaje4.getScaledInstance(200,275,Image.SCALE_SMOOTH);
                ImageIcon personajeagrandado4 = new ImageIcon(Agrandadapersonaje4);
                labelpersonaje4.setIcon(personajeagrandado4);
            }
        });

        ImageIcon personaje5 = new ImageIcon("Lux_splash.jpg");
        Image imagenpersonaje5 = personaje5.getImage();
        Image Agrandadapersonaje5 = imagenpersonaje5.getScaledInstance(200,275,Image.SCALE_SMOOTH);
        ImageIcon personajeagrandado5 = new ImageIcon(Agrandadapersonaje5);
        JLabel labelpersonaje5 = new JLabel(personajeagrandado5);
        labelpersonaje5.setBounds(400,430,200,275);
        labelpersonaje5.setVisible(true);
        labelpersonaje5.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(160, 82, 45)), // borde exterior marrón
                BorderFactory.createBevelBorder(BevelBorder.RAISED,
                        new Color(218, 165, 32), // borde interior dorado
                        new Color(139, 69, 19)) // borde interior marrón oscuro
        ));
        labelpersonaje5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ImageIcon personaje5 = new ImageIcon("Lux_splash.jpg");
                Image imagenpersonaje5 = personaje5.getImage();
                Image Agrandadapersonaje5 = imagenpersonaje5.getScaledInstance(250,350,Image.SCALE_SMOOTH);
                ImageIcon personajeagrandado5 = new ImageIcon(Agrandadapersonaje5);
                labelpersonaje5.setIcon(personajeagrandado5);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImageIcon personaje5 = new ImageIcon("Lux_splash.jpg");
                Image imagenpersonaje5 = personaje5.getImage();
                Image Agrandadapersonaje5 = imagenpersonaje5.getScaledInstance(200,275,Image.SCALE_SMOOTH);
                ImageIcon personajeagrandado5 = new ImageIcon(Agrandadapersonaje5);
                labelpersonaje5.setIcon(personajeagrandado5);
            }
        });

        ImageIcon personaje6 = new ImageIcon("vigo_splash.jpg");
        Image imagenpersonaje6 = personaje6.getImage();
        Image Agrandadapersonaje6 = imagenpersonaje6.getScaledInstance(200,275,Image.SCALE_SMOOTH);
        ImageIcon personajeagrandado6 = new ImageIcon(Agrandadapersonaje6);
        JLabel labelpersonaje6 = new JLabel(personajeagrandado6);
        labelpersonaje6.setBounds(730,430,200,275);
        labelpersonaje6.setVisible(true);
        labelpersonaje6.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(160, 82, 45)), // borde exterior marrón
                BorderFactory.createBevelBorder(BevelBorder.RAISED,
                        new Color(218, 165, 32), // borde interior dorado
                        new Color(139, 69, 19)) // borde interior marrón oscuro
        ));
        labelpersonaje6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ImageIcon personaje6 = new ImageIcon("vigo_splash.jpg");
                Image imagenpersonaje6 = personaje6.getImage();
                Image Agrandadapersonaje6 = imagenpersonaje6.getScaledInstance(250,350,Image.SCALE_SMOOTH);
                ImageIcon personajeagrandado6 = new ImageIcon(Agrandadapersonaje6);
                labelpersonaje6.setIcon(personajeagrandado6);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImageIcon personaje6 = new ImageIcon("vigo_splash.jpg");
                Image imagenpersonaje6 = personaje6.getImage();
                Image Agrandadapersonaje6 = imagenpersonaje6.getScaledInstance(200,275,Image.SCALE_SMOOTH);
                ImageIcon personajeagrandado6 = new ImageIcon(Agrandadapersonaje6);
                labelpersonaje6.setIcon(personajeagrandado6);
            }
        });

        ImageIcon fondoboton = new ImageIcon("BotonesPasarAdelante1.png");
        Image fondoboton2 = fondoboton.getImage();
        Image Agrandadaboton2 = fondoboton2.getScaledInstance(200,75,Image.SCALE_SMOOTH);
        ImageIcon fondoagrandadoboton2 = new ImageIcon(Agrandadaboton2);
        JLabel labelfondoboton2 = new JLabel(fondoagrandadoboton2);
        labelfondoboton2.setBounds(750,334,200,75);

        JLabel textoboton = new JLabel();
        textoboton.setText("Continuar");
        textoboton.setBounds(800,334,200,75);
        textoboton.setForeground(new Color(245,245,245));
        textoboton.setFont(new Font("Old English Text MT", Font.BOLD, 24));
        textoboton.setHorizontalTextPosition(JLabel.LEFT);

        labelfondoboton2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                new Selec3();
                PaginaIntro.dispose();
            }
        });

        ImageIcon fondoboton3 = new ImageIcon("BotonesPasarAdelante1.png");
        Image fondoboton4 = fondoboton3.getImage();
        Image Agrandadaboton4 = fondoboton4.getScaledInstance(200,75,Image.SCALE_SMOOTH);
        ImageIcon fondoagrandadoboton4 = new ImageIcon(Agrandadaboton4);
        JLabel labelfondoboton4 = new JLabel(fondoagrandadoboton4);
        labelfondoboton4.setBounds(26,334,200,75);

        JLabel textoboton1 = new JLabel();
        textoboton1.setText("Volver");
        textoboton1.setBounds(96,334,200,75);
        textoboton1.setForeground(new Color(245,245,245));
        textoboton1.setFont(new Font("Old English Text MT", Font.BOLD, 24));
        textoboton1.setHorizontalTextPosition(JLabel.LEFT);

        labelfondoboton4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                new Selección_de_personje();
                PaginaIntro.dispose();
            }
        });


        PaginaIntro.add(textoboton1);
        PaginaIntro.add(labelfondoboton4);
        PaginaIntro.add(textoboton);
        PaginaIntro.add(labelfondoboton2);
        PaginaIntro.add(labelpersonaje1);
        PaginaIntro.add(labelpersonaje2);
        PaginaIntro.add(labelpersonaje3);
        PaginaIntro.add(labelpersonaje4);
        PaginaIntro.add(labelpersonaje5);
        PaginaIntro.add(labelpersonaje6);
        PaginaIntro.add(labelfondo2);
        PaginaIntro.add(labelfondo1);
        PaginaIntro.add(labelfondo3);
        PaginaIntro.add(labelfondo4);
        PaginaIntro.add(labelfondo5);
        PaginaIntro.add(labelfondo6);

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
