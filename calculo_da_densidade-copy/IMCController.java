import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * Cálculo da Densidade
 * 
 * @author : VictorAlves
 * @version 001
 */
public class IMCController
{
    IMCView imcView;
    Stage stage;
    int imc;
    public TextField textFieldAltura;
    public TextField textFieldPeso;
    public Label labelResultado;
    
    /**
     * Construtor para objetos da classe IMCController
     */
    public IMCController()
    {
        this.stage = new Stage();
        this.imcView = new IMCView();
        this.imcView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.imcView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e) {
        try {
            double altura = Double.parseDouble(textFieldAltura.getText());
            double peso = Double.parseDouble(textFieldPeso.getText());
            IMC imc = new IMC(altura, peso);
            this.labelResultado.setText(imc.interpretar());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        textFieldAltura.setText("");
        textFieldPeso.setText("");
        labelResultado.setText("");
    }    
}
