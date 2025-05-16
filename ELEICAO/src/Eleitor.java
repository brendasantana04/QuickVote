
class Eleitor {
 
    int NmrEleitor;
    String NmEleitor;
    int Sesao;
    
    //contrutor 
    Eleitor() {
        this (0,"",0);
       
    }
    
    Eleitor ( int PNmrEleitor,
              String PNmEleitor,
              int PSesao)
    {
        NmrEleitor = PNmrEleitor;
        NmEleitor = PNmEleitor;
        Sesao = PSesao; 
    }
    
}
