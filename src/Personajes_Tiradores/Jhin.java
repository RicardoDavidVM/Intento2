package Personajes_Tiradores;

public class Jhin extends Super_Clase_tirador{
    private int vida_base = 526;
    private double regen_vida_base = 3.6;

    private double  mana_base = 318.84; //PUEDE SER ENERGIA O NO LLEVAR MANA, NO NECESARIAMENTE ES MANA LITERAL.
    private double regen_mana_base = 7.147;

    private double daño_ataque = 55.66;
    private double daño_mágico = 0;

    private double armadura = 26.6;
    private double resistencia_mágica = 30;

    private double velocidad_movimiento = 326;
    private double velocidad_ataque = 0.625;

    private int alcance = 583;

    public int getVida_base_Jhin() {return vida_base;}
    public double getRegen_vida_base_Jhin() {return regen_vida_base;}

    public double getMana_base_Jhin() {return mana_base;}
    public double getRegen_mana_base_Jhin() {return regen_mana_base;}

    public double getDaño_ataque_Jhin() {return daño_ataque;}
    public double getDaño_mágico_Jhin() {return daño_mágico;}

    public double getArmadura_Jhin() {return armadura;}
    public double getResistencia_mágica_Jhin() {return resistencia_mágica;}

    public double getVelocidad_movimiento_Jhin() {return velocidad_movimiento;}
    public double getVelocidad_ataque_Jhin() {return velocidad_ataque;}

    public int getAlcance_Jhin() {return alcance;}

    @Override
    public void Aumento_de_nivel_personaje() {
        vida_base += 91;
        regen_vida_base += 0.58;
        mana_base += 40;
        regen_mana_base += 0.66;
        daño_ataque += 3.42;
        velocidad_ataque += (0.033);
        armadura += 3.33;
        resistencia_mágica += 0.5;
    }

    public Jhin() {
    }
}
