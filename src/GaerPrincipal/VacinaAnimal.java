package GaerPrincipal;



public class VacinaAnimal {

    public static void main(String[] args) {
       System.out.println("Esta data é válida! " + new ValidaData().dataValida("28/02/1800"));
       System.out.println("Esta data é inválida! " + new ValidaData().dataValida("10122017"));
        
        
    }
    
}
