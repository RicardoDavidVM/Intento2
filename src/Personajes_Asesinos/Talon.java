package Personajes_Asesinos;
import Personajes_apoyos.*;
import Personajes_tanques.*;
import Personajes_Combatientes.*;
import Personajes_Magos.*;

public class Talon extends Super_Clase_Asesino{

    private int nivel = 1;
    private double Barra_Experiencia = 500;

    private int vida_base = 586;
    private double regen_vida_base = 8;

    private double  mana_base = 317.2; //PUEDE SER ENERGIA O NO LLEVAR MANA, NO NECESARIAMENTE ES MANA LITERAL.
    private double regen_mana_base = 7.378;

    private double daño_ataque = 67.3;
    private double daño_mágico = 0;

    private double armadura = 31.3;
    private double resistencia_mágica = 34.4;

    private double velocidad_movimiento = 343;
    private double velocidad_ataque = 0.645;

    private int alcance = 125;

    private double Hemorragia_Talon = 0;
    private double Daño_Pasiva_Talon = (80+200/17*(nivel-1));
    private double Escala_Curación_Hab1_Talon = (9+46/17*(nivel-1));
    private double Hab1_Talon = (65 + daño_ataque);
    private double Hab2_Talon = (40 + (40/100)*daño_ataque);
    private double Hab2_Distacia_Talon = (50 + (80/100)*daño_ataque);
    private double Slow_Hab2_Talon = (40);

    private double daño_item_total_Talon = 0;

    public int getNivel() {return nivel;}
    public double getBarra_Experiencia() {return Barra_Experiencia;}

    public double getHemorragia_Talon() {return Hemorragia_Talon;}
    public double getDaño_Pasiva_Talon() {return Daño_Pasiva_Talon;}
    public double getEscala_Curación_Hab1_Talon() {return Escala_Curación_Hab1_Talon;}
    public double getHab1_Talon() {return Hab1_Talon;}
    public double getHab2_Talon() {return Hab2_Talon;}
    public double getHab2_Distacia_Talon() {return Hab2_Distacia_Talon;}
    public double getSlow_Hab2_Talon() {return Slow_Hab2_Talon;}

    public double getDaño_item_total_Talon() {return daño_item_total_Talon;}

    public int getVida_base_Talon() {return vida_base;}
    public double getRegen_vida_base_Talon() {return regen_vida_base;}

    public double getMana_base_Talon() {return mana_base;}
    public double getRegen_mana_base_Talon() {return regen_mana_base;}

    public double getDaño_ataque_Talon() {return daño_ataque;}
    public double getDaño_mágico_Talon() {return daño_mágico;}

    public double getArmadura_Talon() {return armadura;}
    public double getResistencia_mágica_Talon() {return resistencia_mágica;}

    public double getVelocidad_movimiento_Talon() {return velocidad_movimiento;}
    public double getVelocidad_ataque_Talon() {return velocidad_ataque;}

    public int getAlcance_Talon() {return alcance;}


    @Override
    public void Aumento_de_nivel_personaje() {
        nivel++;
        Barra_Experiencia += 1342;

        vida_base += 91;
        regen_vida_base += 0.6;
        mana_base += 38.5;
        regen_mana_base += 0.625;
        daño_ataque += 3.2;
        velocidad_ataque += 0.0297;
        armadura += 3.33;
        resistencia_mágica += 1.25;

        Daño_Pasiva_Talon = (80+200/17*(nivel-1));
        Escala_Curación_Hab1_Talon = (9+46/17*(nivel-1));
        Hab1_Talon += 20;
        Hab2_Talon += 10;
        Hab2_Distacia_Talon += 30;
    }
   public Talon(){
   }


}
