/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

/**
 *
 * @author Technologyland
 */
public class EquipoSonido {

    /**
     * @return the tieneBluetooth
     */
    public boolean isTieneBluetooth() {
        return tieneBluetooth;
    }

    /**
     * @param tieneBluetooth the tieneBluetooth to set
     */
    public void setTieneBluetooth(boolean tieneBluetooth) {
        this.tieneBluetooth = tieneBluetooth;
    }

    /**
     * @return the musica
     */
    public String getMusica() {
        return musica;
    }

    /**
     * @param musica the musica to set
     */
    public void setMusica(String musica) {
        this.musica = musica;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the potenciaSonido
     */
    public String getPotenciaSonido() {
        return potenciaSonido;
    }

    /**
     * @param potenciaSonido the potenciaSonido to set
     */
    public void setPotenciaSonido(String potenciaSonido) {
        this.potenciaSonido = potenciaSonido;
    }

    /**
     * @return the salidaAudio
     */
    public String getSalidaAudio() {
        return salidaAudio;
    }

    /**
     * @param salidaAudio the salidaAudio to set
     */
    public void setSalidaAudio(String salidaAudio) {
        this.salidaAudio = salidaAudio;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    private String marca;
    private String potenciaSonido;
    private String salidaAudio;
    private String modelo;
    private boolean tieneBluetooth;
    private String musica;
    
}
