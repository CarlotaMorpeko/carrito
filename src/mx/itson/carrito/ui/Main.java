/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;
import mx.itson.carrito.entidades.EquipoSonido;
import mx.itson.carrito.entidades.Propietario;
import mx.itson.carrito.enums.TipoMotor;
import mx.itson.carrito.enums.TipoTransmision;

/**
 *
 * @author Technologyland
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la distancia recorrida:");
        double distancia = sc.nextDouble();
        
        System.out.println("Ingrese la velocidad a la que viaja el carro:");
        double velocidad = sc.nextDouble();
        
        // Generamos una instancia de la clase Carro
        Carro bmw = new Carro();
        bmw.setMarca("BMW");
        bmw.setColor("Negro");
        bmw.setAnio(2021);
        bmw.setKilometraje(10000);
        bmw.setTipoMotor(TipoMotor.HIBRIDO);
        bmw.setTipoTransmision(TipoTransmision.ESTANDAR);
        
        
        Propietario prop = new Propietario();
        prop.setNombre("Gary");
        prop.setDomicilio("Calle 23 colonia cengro");
        prop.setTelefono("6221734422");
        prop.setEmail("panfilomeno@gmail.com");
        
        bmw.setPropietario(prop);
        
        EquipoSonido mamalon = new EquipoSonido();
        mamalon.setMarca("JBL");
        mamalon.setPotenciaSonido("75 watts");
        mamalon.setSalidaAudio("Estereo");
        mamalon.setModelo("GTO609C");
        mamalon.setMusica("La trakalosa de Monterrey");
        mamalon.setTieneBluetooth(true); 
        
        bmw.setEquipoSonido(mamalon);
        
        // Invocamos al metodo contenido en la clase Carro
        double tiempo = bmw.calcularTiempo(distancia, velocidad);
        
        System.out.println("El tiempo que le tomará al carro " 
                + bmw.getMarca() 
                + " de color " + bmw.getColor() +
                " y cuyo modelo es " + bmw.getAnio()+ " que ademas cuenta con un estereo de la marca "
                + bmw.getEquipoSonido().getMarca() + " sera de " + tiempo +
                " y ahora su kilometraje es de " + bmw.getKilometraje()
                + " El propietariode de este carrito es " + bmw.getPropietario().getNombre()
                + " y esta escuchando " + bmw.getEquipoSonido().getMusica());
        
    }
}
