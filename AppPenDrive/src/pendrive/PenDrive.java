/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendrive;

import java.util.Scanner;

/**
 *
 * @author uezo
 */
public class PenDrive {
    
       String marca, modelo, unidade;
        int capacidade;
        double comprimento;
        double largura;
        double peso;
        double preco;
        
      public void setUnidade(){
            modelo = "";
        
    }
     
        
    public void setUnidade(String u){
        if(!u.isEmpty()){
            unidade = u;
        }
    }  
     
        
     public void setModelo(){
            modelo = "";
        
    }
     
        
    public void setModelo(String m){
        if(!m.isEmpty()){
            modelo = m;
        }
    }    
    
     public void setMarca(){
            marca = "";
        
    }
    
    
    public void setMarca(String m){
        if(!m.isEmpty()){
            marca = m;
        }
    }
 
    
     public void setCapacidade(){
            capacidade = 0;
        
    }
    public void setCapacidade(int c){
        if(c >= 0){
            capacidade = c;
        }
    }
    
     public void setComprimento(){
            comprimento = 0;
        
    }
    
    public void setComprimento(double c){
        if(c >= 0){
            comprimento = c;
        }
    }
    
     public void setLargura(){
            largura = 0;
        
    }
     
    public void setLargura(double l){
        if(l >= 0){
            largura = l;
        }
    }
    
     public void setPeso(){
            peso = 0;
        
    }
    
    public void setPeso(double p){
        if(p >= 0){
            peso = p;
        }
    }
    
     public void setPreco(){
            preco = 0;
        
    }
    
    public void setPreco(double p){
        if(p >= 0){
            preco = p;
        }
    }
    
    public String getUnidade(){
        return unidade;
    }
     public String getModelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
     public int getCapacidade(){
        return capacidade;
    }
      public double getComprimento(){
        return comprimento;
    }
      public double getLargura(){
        return largura;
    }
     public double getPeso(){
        return peso;
    }
     public double getPreco(){
        return preco;
    }
  
     //Realiza a atribuiação de todos os atributos ao mesmo tempo
     public void cadastrar(String marca, String modelo, int capacidade, double comprimento, 
                                double largura, double peso, double preco, String unidade  ){
         setMarca(marca);
         setModelo(modelo);
         setCapacidade(capacidade);
         setComprimento(comprimento);
         setLargura(largura);
         setPeso(peso);
         setPreco(preco);
         setUnidade(unidade);
         
     }
     //Define a forma que as informações serão exibidas ao executar

    public void imprimir() {
        System.out.println("Marca:       " + getMarca());
        System.out.println("Modelo:       " + getModelo());
        System.out.println("Capacidade:       " + getCapacidade());
        System.out.println("Comprimento:       " + getComprimento());
        System.out.println("Largura:       " + getLargura());
        System.out.println("Peso:       " + getPeso());
        System.out.println("Preço:       " + getPreco());
        System.out.println("Unidade de Armazenamento: " + getUnidade());
    }
    
    //Realiza a entrada dos dados
    
    public void entradaDados(){
        Scanner entrada = new Scanner(System.in);
        
         System.out.println("Marca: ");
            setMarca(entrada.nextLine());
         System.out.println("Modelo: ");
            setModelo(entrada.nextLine());
         System.out.println("Unidade de armazenamento: ");
            setUnidade(entrada.nextLine());
         System.out.println("Capacidade: ");
            setCapacidade(Integer.parseInt(entrada.next()));
         System.out.println("Comprimento: ");
            setComprimento(Double.parseDouble(entrada.next()));
         System.out.println("Largura: ");
            setLargura(Double.parseDouble(entrada.next()));
         System.out.println("Peso: ");
            setPeso(Double.parseDouble(entrada.next()));
         System.out.println("Preço: ");
            setPreco(Double.parseDouble(entrada.next()));
        
    }
     
     
}
