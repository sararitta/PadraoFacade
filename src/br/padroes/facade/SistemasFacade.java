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
public class SistemasFacade {

    protected SistemasDeAudio audio;
    protected SistemasDeInput input;
    protected SistemasDeVideo video;

    public void inicializarSubsistemas() {
        video = new SistemasDeVideo();
        video.configurarCores();
        video.configurarResolucao();

        input = new SistemasDeInput();
        input.configurarJoystick();
        input.configurarTeclado();

        audio = new SistemasDeAudio();
        audio.configurarCanais();
        audio.configurarFrequencia();
        audio.configurarVolume();
    }

    public void reproduzirAudio(String arquivo) {
        audio.reproduzirAudio(arquivo);
    }

    public void renderizarImagem(String imagem) {
        video.renderizarImagem(imagem);
    }

    public void lerInput() {
        input.lerInput();
    }
}
