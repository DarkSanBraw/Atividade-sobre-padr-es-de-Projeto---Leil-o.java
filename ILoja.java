package observer;

/**
 * Representa a entidade que os observadores estão monitorando. 
 * Registra e remove observadores. 
 */
public interface ILoja {
    
    public void adicionarCliente(ICliente ic);
    
    public void removerCliente(ICliente ic);
    
    public void notificarClientes();
    
    public void realizarLeilao();
    
}