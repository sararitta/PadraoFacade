/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.padroes.facade;

/**
 *
 * @author eng-sara
 */
public class SistemasDeVideo {

    public void configurarResolucao() {
        System.out.println("Resolução configurada");
    }

    public void configurarCores() {
        System.out.println("Esquema de cores configurado");
    }

    public void renderizarImagem(String imagem) {
        System.out.println("Imagem: " + imagem + " renderizada");
    }
}
