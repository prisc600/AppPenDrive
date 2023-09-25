/*

Criar a classe PenDrive, com os seguintes atributos e os Métodos de Acesso (Setters e Getters). 
Crie uma aplicação com entrada de dados através do teclado para testar a classe criada, que utilize todos os métodos disponibilizados. 
Atributos da classe PenDrive: 
- Marca: texto 
- Capacidade: inteiro 
- Comprimento: real 
- Largura: real 
- Profundidade: real 
- Peso: real 
- Preço: real 
+ Métodos de Acesso

 */
package pendrive;

/**
 *
 * @author uezo
 */
public class AppPenDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     PenDrive pd1 = new PenDrive();
        pd1.entradaDados();
         pd1.imprimir();
         
     PenDrive pd2 = new PenDrive();
        pd2.entradaDados();
        pd2.imprimir();
        
     PenDrive pd3 = new PenDrive();
        pd3.entradaDados();
        pd3.imprimir();
     
     
        
        
    }
    
}
