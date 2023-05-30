package Personajes_tanques;

public class Malphite extends Super_Clase_Tanque{
    private int vida_base = 577;
    private double regen_vida_base = 8;

    private double  mana_base = 277.2; //PUEDE SER ENERGIA O NO LLEVAR MANA, NO NECESARIAMENTE ES MANA LITERAL.
    private double regen_mana_base = 7.265;

    private double daño_ataque = 64.08;
    private double daño_mágico = 0;

    private double armadura = 37;
    private double resistencia_mágica = 32.1;

    private double velocidad_movimiento = 342;
    private double velocidad_ataque = 0.645;

    private int alcance = 125;

    public int getVida_base_Malph() {return vida_base;}
    public double getRegen_vida_base_Malph() {return regen_vida_base;}

    public double getMana_base_Malph() {return mana_base;}
    public double getRegen_mana_base_Malph() {return regen_mana_base;}

    public double getDaño_ataque_Malph() {return daño_ataque;}
    public double getDaño_mágico_Malph() {return daño_mágico;}

    public double getArmadura_Malph() {return armadura;}
    public double getResistencia_mágica_Malph() {return resistencia_mágica;}

    public double getVelocidad_movimiento_Malph() {return velocidad_movimiento;}
    public double getVelocidad_ataque_Malph() {return velocidad_ataque;}

    public int getAlcance() {return alcance;}

    @Override
    public void Aumento_de_nivel_personaje() {
        vida_base += 86;
        regen_vida_base += 0.71;
        mana_base += 40;
        regen_mana_base += 0.5;
        daño_ataque += 3.9;
        velocidad_ataque += 0.0254;
        armadura += 3.58;
        resistencia_mágica += 1.25;
    }

    public Malphite(){
    }
}
