package observer;


import observer.Cliente;
import observer.ICliente;
import observer.Loja;


public class Observer {

    public static void main(String[] args) {
        System.out.println("Demonstração do padrão observer");
        ICliente cliente1 = new Cliente("Petrus", 1500.00);
        ICliente cliente2 = new Cliente("Julius", 2000.00);
        ICliente cliente3 = new Cliente("Aloki", 3000.00);
        ICliente cliente4 = new Cliente("Totus", 2500.00);
        
        
        Loja vendedor = new Loja();
        vendedor.adicionarCliente(cliente1);
        vendedor.adicionarCliente(cliente2);
        vendedor.adicionarCliente(cliente3);
        vendedor.adicionarCliente(cliente4);
        
        vendedor.setProduto("Placa de video RTX 5060", 2000.00);
        vendedor.notificarClientes();
        
        vendedor.realizarLeilao();
        vendedor.finalizarLeilao();
    }
}