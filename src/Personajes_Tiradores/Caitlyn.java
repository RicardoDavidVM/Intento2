package Personajes_Tiradores;

public class Caitlyn extends Super_Clase_tirador{
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

    public int getVida_base_Cait() {return vida_base;}
    public double getRegen_vida_base_Cait() {return regen_vida_base;}

    public double getMana_base_Cait() {return mana_base;}
    public double getRegen_mana_base_Cait() {return regen_mana_base;}
    public double getDaño_ataque_Cait() {return daño_ataque;}
    public double getDaño_mágico_Cait() {return daño_mágico;}

    public double getArmadura_Cait() {return armadura;}
    public double getResistencia_mágica_Cait() {return resistencia_mágica;}

    public double getVelocidad_movimiento_Cait() {return velocidad_movimiento;}
    public double getVelocidad_ataque_Cait() {return velocidad_ataque;}

    public int getAlcance() {return alcance;}
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

    public Caitlyn() {
    }
}
