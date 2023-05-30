package Personajes_Magos;

public class Veigar extends Super_Clase_Mago {
    private int vida_base = 507;
    private double regen_vida_base = 6.16;

    private double  mana_base = 462.66;//PUEDE SER ENERGIA O NO LLEVAR MANA, NO NECESARIAMENTE ES MANA LITERAL.
    private double regen_mana_base = 8;

    private double daño_ataque = 52.55;
    private double daño_mágico = 0;

    private double armadura = 20.71;
    private double resistencia_mágica = 30;

    private double velocidad_movimiento =333.33;
    private double velocidad_ataque = 0.635;

    private int alcance = 550;

    public int getVida_base_Veigar() {return vida_base;}
    public double getRegen_vida_base_Veigar() {return regen_vida_base;}

    public double getMana_base_Veigar() {return mana_base;}
    public double getRegen_mana_base_Veigar() {return regen_mana_base;}

    public double getDaño_ataque_Veigar() {return daño_ataque;}
    public double getDaño_mágico_Veigar() {return daño_mágico;}

    public double getArmadura_Veigar() {return armadura;}
    public double getResistencia_mágica_Veigar() {return resistencia_mágica;}

    public double getVelocidad_movimiento_Veigar() {return velocidad_movimiento;}
    public double getVelocidad_ataque_Veigar() {return velocidad_ataque;}

    public int getAlcance_Veigar() {return alcance;}


    @Override
    public void Aumento_de_nivel_personaje() {
        vida_base += 90;
        regen_vida_base += 0.58;
        mana_base += 24.8;
        regen_mana_base += 0.8;
        daño_ataque += 2.975;
        velocidad_ataque += (0.0174);
        armadura += 3.75;
        resistencia_mágica += 0.5;
    }

    public Veigar(){
    }
}
