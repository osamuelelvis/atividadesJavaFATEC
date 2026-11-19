import java.io.*;
import javax.swing.*;
public class Metodos {
    public Produto[] FCargaProdutos(Produto[] produto) throws IOException {
        String filename = "PRODUTOS.txt";
        BufferedReader ler = new BufferedReader(new FileReader(filename));
        String linha = "in";
        int i = 0;
        while ((linha = ler.readLine()) != null) {
            int codigo = Integer.parseInt(linha);
            String descricao = ler.readLine();
            int anoLancamento = Integer.parseInt(ler.readLine());
            int qtdVendida = Integer.parseInt(ler.readLine());
            int notaSatisfacao = Integer.parseInt(ler.readLine());
            
            produto[i] = new Produto(codigo, descricao, anoLancamento, qtdVendida, notaSatisfacao);
            i++;
        }
        ler.close();
        return produto;
    }
    
    public String FConsultaProduto(Produto[] produto, int codigo, int i) {
        if (i >= produto.length) {
            return "Produto não cadastrado";
        }
        if (produto[i].codigo == codigo) {
            return produto[i].descricao;
        }
        return FConsultaProduto(produto, codigo, i + 1);
    }
}
