package Personajes_Combatientes;

public class Warwick extends Super_Clase_Combatiente{

    private int vida_base = 582;
    private double regen_vida_base = 7.33;

    private double  mana_base = 271.5; //PUEDE SER ENERGIA O NO LLEVAR MANA, NO NECESARIAMENTE ES MANA LITERAL.
    private double regen_mana_base = 7.033;

    private double daño_ataque = 65;
    private double daño_mágico = 0;

    private double armadura = 36;
    private double resistencia_mágica = 32.1;

    private double velocidad_movimiento = 338.33;
    private double velocidad_ataque = 0.635;

    private int alcance = 158;


    public int getVida_base_Warwick() {return vida_base;}
    public double getRegen_vida_base_Warwick() {return regen_vida_base;}

    public double getMana_base_Warwick() {return mana_base;}
    public double getRegen_mana_base_Warwick() {return regen_mana_base;}

    public double getDaño_ataque_Warwick() {return daño_ataque;}
    public double getDaño_mágico_Warwick() {return daño_mágico;}

    public double getArmadura_Warwick() {return armadura;}
    public double getResistencia_mágica_Warwick() {return resistencia_mágica;}

    public double getVelocidad_movimiento_Warwick() {return velocidad_movimiento;}
    public double getVelocidad_ataque_Warwick() {return velocidad_ataque;}

    public int getAlcance_Warwick() {return alcance;}

    @Override
    public void Aumento_de_nivel_personaje() {
        vida_base += 89.75;
        regen_vida_base += 0.73;
        mana_base += 36.25;
        regen_mana_base += 7.063;
        daño_ataque += 4.16;
        velocidad_ataque += (0.0206);
        armadura += 3.4;
        resistencia_mágica += 1.25;
    }
    public Warwick() {
    }
}
