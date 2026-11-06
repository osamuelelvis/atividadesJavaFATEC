class CadastroEleitor {
    int numeleitor;
    String nomeeleitor;
    int secao;
    
    CadastroEleitor() {
        this(0, "", 0);
    }
    
    CadastroEleitor(int NumeroEleitor, String NomeEleitor, int Secao) {
        numeleitor = NumeroEleitor;
        nomeeleitor = NomeEleitor;
        secao = Secao;
    }
}
