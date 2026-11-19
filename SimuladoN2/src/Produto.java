class Produto {
    int codigo;
    String descricao;
    int anoLancamento;
    int qtdVendida;
    int notaSatisfacao;
    
    Produto() {
        this(0, "", 0, 0, 0);
    }
    
    Produto(int codigoProduto, String descricaoProduto, int lancamento, int vendasFeitas, int avaliacaoProduto) {
        codigo = codigoProduto;
        descricao = descricaoProduto;
        anoLancamento = lancamento;
        qtdVendida = vendasFeitas;
        notaSatisfacao = avaliacaoProduto;
    }
}
