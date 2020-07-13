package com.mcubes.beans;

/**
 * Created by A.A.MAMUN on 7/12/2020.
 */

/**
 * Create concrete classes 'IPhone'
 * implementing the 'Device' interface.
 */
public class IPhone implements Device {

    /**
     * Override the methods of
     * 'Device' interface
     */
    @Override
    public void configuration() {
        System.out.println("iPhone X :");
        System.out.println("OS : iOS 11.1.1, upgradable to iOS 13.5\n" +
                "CPU : Hexa-core 2.39 GHz (2x Monsoon + 4x Mistral)\n" +
                "CAMERA : Dual 12 MP, f/1.8, 28mm (wide)\n" +
                "SELFIE CAMERA : 7 MP, f/2.2, 32mm (standard)\n");
    }
}
