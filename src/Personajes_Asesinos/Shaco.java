package Personajes_Asesinos;

public class Shaco extends Super_Clase_Asesino{
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

    public int getVida_base_Shaco() {return vida_base;}
    public double getRegen_vida_base_Shaco() {return regen_vida_base;}

    public double getMana_base_Shaco() {return mana_base;}
    public double getRegen_mana_base_Shaco() {return regen_mana_base;}

    public double getDaño_ataque_Shaco() {return daño_ataque;}
    public double getDaño_mágico_Shaco() {return daño_mágico;}

    public double getArmadura_Shaco() {return armadura;}
    public double getResistencia_mágica_Shaco() {return resistencia_mágica;}

    public double getVelocidad_movimiento_Shaco() {return velocidad_movimiento;}
    public double getVelocidad_ataque_Shaco() {return velocidad_ataque;}

    public int getAlcance_Shaco() {return alcance;}


    @Override
    public void Aumento_de_nivel_personaje() {
        vida_base += 91.3;
        regen_vida_base += 0.6;
        mana_base += 38.5;
        regen_mana_base += 0.625;
        daño_ataque += 3.2;
        velocidad_ataque += 0.0297;
        armadura += 3.33;
        resistencia_mágica += 1.25;
    }

    public Shaco(){
    }
}
