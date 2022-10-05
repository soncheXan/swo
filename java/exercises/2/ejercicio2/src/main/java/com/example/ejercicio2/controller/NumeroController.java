import org.springframework.stereotype.Controller;

@Controller
public class NumeroController {
    
    public String senRandom(Model model){
        
        Numero numero = new Numero();
        
        Numero numeroAleatorio = numero.envioNumero();
        model.addAtribute("numero", numero.envioNumero());

        return "randomView";
    }
}
