 class Eleicao {
     int Sesao;
     int CodCandidato;
     int NumEleitor;
     
   
     
     Eleicao(){
         this (0,0,0);
     }
     
     
     
     Eleicao(int PSesao,
             int PCodCandidato,
             int PNumEleitor)
     {
         Sesao = PSesao;
         CodCandidato = PCodCandidato;
         NumEleitor = PNumEleitor;
         
     }
}