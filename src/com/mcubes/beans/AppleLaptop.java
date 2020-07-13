package com.mcubes.beans;

/**
 * Created by A.A.MAMUN on 7/13/2020.
 */

/**
 * Create concrete classes 'AppleLaptop'
 * implementing the 'Device' interface.
 */
public class AppleLaptop implements Device {

    /**
     * Override the methods of
     * 'Device' interface
     */
    @Override
    public void configuration() {
        System.out.println("MAC Book :");
        System.out.println("RAM : 4GP, HDD : 500GB, CPU : 3.5GHz, Display : 15inch\n");
    }
}
