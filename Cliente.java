package observer;

/**
 * Observador concreto. 
 * Observador que será notificado quando o sujeito (vendedor) atualizar estado. 
 */
public class Cliente implements ICliente {
    
    private String nome;
    private double valorLance;
    
    public Cliente(){
        nome = "sem nome"; 
        valorLance = 0.0;
    }
    
    public Cliente ( String nome, double valorLance ){
        this.nome = nome;
        this.valorLance = valorLance;
    }
    
    @Override
    public void atualizar(String mensagem){
        System.out.println("Cliente: " + nome + " recebeu a mensagem: "+ mensagem);
    }
    
    @Override
    public double darLance(){
        return valorLance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getValorLance() {
        return valorLance;
    }
    
    public void setValorLance(double valorLance) {
        this.valorLance = valorLance;
    }
    
}