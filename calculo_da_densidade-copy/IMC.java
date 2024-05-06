
/**
 * Modela o cálculo de IMC
 * 
 * @author VictorAlves
 * @version 0.01
 */
public class IMC
{
    double massa;
    double volume;
    
    public IMC() {
        this.massa = 0;
        this.volume = 0;
    }
    
    /**
     * Construtor para objetos da classe Densidade
     */
    public IMC(double massa, double volume)
    {
        this.massa = massa;  
        this.volume = volume;
    }

    /**
     * Calculo da Densidade
     * 
     * @return     o valor da Denisdade, dado por: volume/densidade
     */
    public double calcular()
    {
        if (this.massa <= 0 || this.volume <= 0)
            return 0;
        return this.massa / this.volume ;
    }
    
    /**
     * Interpreta a Densidade
     * 
     * @return     interpreta a Densidade
     * 
     */
    public String interpretar()
    {
        String resultado = "";
        double imc = this.calcular();
        if (imc == 0)
            resultado += "Densidade inexistente";
        else if (imc < 0.005 )
            resultado += "densidade muito baixa";
        else if (imc < 0.5)
            resultado += "densidade baixa";
        else if (imc == 1)
            resultado += "densidade análoga a da água";
        else if (imc < 5)
            resultado += "densidade alta";
        else if (imc < 10)
            resultado += "densidade muito alta";            
        else if (imc < 20)
            resultado += "densidade altíssima";
        else
            resultado += "densidade extrema";
        return resultado;
    }
}
