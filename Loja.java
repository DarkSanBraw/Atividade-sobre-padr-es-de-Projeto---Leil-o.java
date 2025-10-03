package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Sujeito. Mantém o estado e notifica os interessados.
 */

public class Loja implements ILoja {
    
    private List<ICliente> clientes; 
    private String produto;
    private double precoMinimo;
    private ICliente vencedor;
    private double maiorLance;
    
    public Loja(){
        clientes = new ArrayList(); 
        produto = "";
        precoMinimo = 0.0;
        vencedor = null;
        maiorLance = 0.0;
    }

    @Override
    public void adicionarCliente(ICliente ic) {
        clientes.add(ic);
        System.out.println("Comprador " + ic.getNome() + " adicionado ao leilão.");
    }

    @Override
    public void removerCliente(ICliente ic) {
        clientes.remove(ic);
        System.out.println("Comprador " + ic.getNome() + " removido do leilão.");
    }

    @Override
    public void notificarClientes() {
        for (ICliente i : clientes){
            i.atualizar("Produto: " + produto + " - Preço mínimo: R$ " + precoMinimo);
        }
    }
    
    @Override
    public void realizarLeilao(){
        System.out.println("\n=== RECEBENDO LANCES ===\n");
        
        maiorLance = precoMinimo;
        vencedor = null;
        
        for (ICliente cliente : clientes) {
            double lance = cliente.darLance();
            System.out.println("Cliente " + cliente.getNome() + " ofereceu: R$ " + lance);
            if (lance >= precoMinimo && lance > maiorLance) {
                maiorLance = lance;
                vencedor = cliente;
            }
        }
    }

    public void finalizarLeilao(){
        System.out.println("\n=== FINALIZANDO LEILÃO ===\n");
        
        String mensagem;
        if (vencedor != null) {
            mensagem = "VENDIDO! " + produto + " arrematado por " + vencedor.getNome() + " por R$ " + maiorLance;
        } else {
            mensagem = "Leilão encerrado sem vencedor. Nenhum lance válido foi oferecido.";
        }
        
        System.out.println(mensagem + "\n");
        
        for (ICliente cliente : clientes) {
            cliente.atualizar(mensagem);
        }
    }
    
    public List<ICliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<ICliente> clientes) {
        this.clientes = clientes;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto, double precoMinimo) {
        this.produto = produto;
        this.precoMinimo = precoMinimo;
        System.out.println("\n=== LEILÃO INICIADO ===");
        System.out.println("Produto: " + produto);
        System.out.println("Preço mínimo: R$ " + precoMinimo);
        System.out.println("========================\n");
    }
    
    public double getPrecoMinimo(){
        return precoMinimo;
    }
    
    public void setPrecoMinimo(double precoMinimo){
        this.precoMinimo = precoMinimo;
    }
}