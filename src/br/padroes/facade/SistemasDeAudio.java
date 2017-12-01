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
public class SistemasDeAudio {

    public void configurarFrequencia() {
        System.out.println("Frequencia configurada");
    }

    public void configurarVolume() {
        System.out.println("Volume configurado");
    }

    public void configurarCanais() {
        System.out.println("Canais configurados");
    }

    public void reproduzirAudio(String arquivo) {
        System.out.println("Reproduzindo: " + arquivo);
    }
}
