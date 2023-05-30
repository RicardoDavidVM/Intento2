package Personajes_apoyos;

public class Pyke extends Super_Clase_Apoyo{
    private int vida_base = 554;
    private double regen_vida_base = 5;

    private double  mana_base = 379.93; //PUEDE SER ENERGIA O NO LLEVAR MANA, NO NECESARIAMENTE ES MANA LITERAL.
    private double regen_mana_base = 10.33;

    private double daño_ataque = 55.19;
    private double daño_mágico = 0;

    private double armadura = 34.33;
    private double resistencia_mágica = 30.6;

    private double velocidad_movimiento = 330;
    private double velocidad_ataque = 0.625;

    private int alcance = 125;

    public int getVida_base_Pyke() {return vida_base;}
    public double getRegen_vida_base_Pyke() {return regen_vida_base;}

    public double getMana_base_Pyke() {return mana_base;}
    public double getRegen_mana_base_Pyke() {return regen_mana_base;}

    public double getDaño_ataque_Pyke() {return daño_ataque;}
    public double getDaño_mágico_Pyke() {return daño_mágico;}

    public double getArmadura_Pyke() {return armadura;}
    public double getResistencia_mágica_Pyk() {return resistencia_mágica;}

    public double getVelocidad_movimiento_Pyke() {return velocidad_movimiento;}
    public double getVelocidad_ataque_Pyke() {return velocidad_ataque;}

    public int getAlcance_Pyke() {return alcance;}


    @Override
    public void Aumento_de_nivel_personaje() {
        vida_base += 91;
        regen_vida_base += 0.51;
        mana_base += 53.3;
        regen_mana_base += 0.63;
        daño_ataque += 2.76;
        velocidad_ataque += 0.0231;
        armadura += 4.2;
        resistencia_mágica += 0.83;
    }

    public Pyke() {
    }
}
