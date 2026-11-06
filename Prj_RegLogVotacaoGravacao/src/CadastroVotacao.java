class CadastroVotacao {
    int secao;
    int codcandidato;
    int numeleitor;
    
    CadastroVotacao() {
        this(0, 0, 0);
    }
    
    CadastroVotacao (int Secao, int CodCandidato, int NumEleitor) {
        secao = Secao;
        codcandidato = CodCandidato;
        numeleitor = NumEleitor;
    }
}