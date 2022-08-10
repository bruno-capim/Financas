/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenvolvimento;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author rafaelcergoli
 */

@ManagedBean

public class CalculoFinancas {
    float receita, porcAlimentacao, valorAlimentacao, porcTransporte, valorTransporte, 
          porcSaude, valorSaude, porcMoradia, valorMoradia, porcCompras, valorCompras, 
          porcReserva, valorReserva, porcOutros, valorOutros, all;
    String resp;

    public void calcular(){
        
        all = porcAlimentacao + porcTransporte + porcCompras + porcSaude + porcMoradia + porcOutros + porcReserva;
        
        if (all == 100){
        valorAlimentacao = receita * porcAlimentacao / 100;
        valorTransporte = receita * porcTransporte / 100;
        valorSaude = receita * porcSaude / 100;
        valorMoradia = receita * porcMoradia / 100;
        valorCompras = receita * porcCompras / 100;
        valorReserva = receita * porcReserva / 100;
        valorOutros = receita * porcOutros / 100;  
        }
        else
            if (all < 100){
                resp = "Valor abaixo de 100%";
                valorAlimentacao = 0;
                valorTransporte = 0;
                valorSaude = 0;
                valorMoradia = 0;
                valorCompras = 0;
                valorReserva = 0;
                valorOutros = 0; 
            }
        else
             if (all > 100){
                resp = "Valor acima de 100%";
                valorAlimentacao = 0;
                valorTransporte = 0;
                valorSaude = 0;
                valorMoradia = 0;
                valorCompras = 0;
                valorReserva = 0;
                valorOutros = 0; 
             }
  

    
    }
    
    public void limpar(){
        receita = 0;
        valorAlimentacao = 0;
        valorTransporte = 0;
        valorSaude = 0;
        valorMoradia = 0;
        valorCompras = 0;
        valorReserva = 0;
        valorOutros = 0; 
        porcAlimentacao = 0;
        porcTransporte = 0;
        porcSaude = 0;
        porcMoradia = 0;
        porcCompras = 0;
        porcReserva = 0;
        porcOutros = 0; 

    }

    public float getAll() {
        return all;
    }

    public void setAll(float all) {
        this.all = all;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }
    
    
     
    
    
    public float getReceita() {
        return receita;
    }

    public void setReceita(float receita) {
        this.receita = receita;
    }

    public float getPorcAlimentacao() {
        return porcAlimentacao;
    }

    public void setPorcAlimentacao(float porcAlimentacao) {
        this.porcAlimentacao = porcAlimentacao;
    }

    public float getValorAlimentacao() {
        return valorAlimentacao;
    }

    public void setValorAlimentacao(float valorAlimentacao) {
        this.valorAlimentacao = valorAlimentacao;
    }

    public float getPorcTransporte() {
        return porcTransporte;
    }

    public void setPorcTransporte(float porcTransporte) {
        this.porcTransporte = porcTransporte;
    }

    public float getValorTransporte() {
        return valorTransporte;
    }

    public void setValorTransporte(float valorTransporte) {
        this.valorTransporte = valorTransporte;
    }

    public float getPorcSaude() {
        return porcSaude;
    }

    public void setPorcSaude(float porcSaude) {
        this.porcSaude = porcSaude;
    }

    public float getValorSaude() {
        return valorSaude;
    }

    public void setValorSaude(float valorSaude) {
        this.valorSaude = valorSaude;
    }

    public float getPorcMoradia() {
        return porcMoradia;
    }

    public void setPorcMoradia(float porcMoradia) {
        this.porcMoradia = porcMoradia;
    }

    public float getValorMoradia() {
        return valorMoradia;
    }

    public void setValorMoradia(float valorMoradia) {
        this.valorMoradia = valorMoradia;
    }

    public float getPorcCompras() {
        return porcCompras;
    }

    public void setPorcCompras(float porcCompras) {
        this.porcCompras = porcCompras;
    }

    public float getValorCompras() {
        return valorCompras;
    }

    public void setValorCompras(float valorCompras) {
        this.valorCompras = valorCompras;
    }

    public float getPorcReserva() {
        return porcReserva;
    }

    public void setPorcReserva(float porcReserva) {
        this.porcReserva = porcReserva;
    }

    public float getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(float valorReserva) {
        this.valorReserva = valorReserva;
    }

    public float getPorcOutros() {
        return porcOutros;
    }

    public void setPorcOutros(float porcOutros) {
        this.porcOutros = porcOutros;
    }

    public float getValorOutros() {
        return valorOutros;
    }

    public void setValorOutros(float valorOutros) {
        this.valorOutros = valorOutros;
    }
    
    
    
}
