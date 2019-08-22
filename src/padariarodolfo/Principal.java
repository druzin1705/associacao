
package padariarodolfo;


public class Principal {

   
    public static void main(String[] args) {
        // 
        Produto produto1 = new Frios();
        produto1.setNome("mussarela");
        produto1.setQuantidade(200);
        produto1.setValor(2.20);
        
        Produto produto2 = new Paozinho();
        produto2.setNome("baguete");
        produto2.setQuantidade(2);
        produto2.setValor(4.50);
        
        Produto produto3 = new Doces();
        produto2.setNome("Torta de morango");
        produto2.setQuantidade(1);
        produto2.setValor(5.99);
        
        Pedido pedido = new Pedido();
        pedido.setProduto1(produto1);
        pedido.setProduto2(produto2);
        pedido.setProduto3(produto3);
        
                
    }
    
    
}
