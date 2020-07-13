package com.mcubes.beans;

/**
 * Created by A.A.MAMUN on 7/13/2020.
 */

/**
 * Create concrete classes 'SamsungLaptop'
 * implementing the 'Device' interface.
 */
public class SamsungLaptop implements Device {

    /**
     * Override the methods of
     * 'Device' interface
     */
    @Override
    public void configuration() {
        System.out.println("Samsung Laptop :");
        System.out.println("RAM : 8GP, HDD : 1TB, CPU : 2.5GHz, Display : 13.5inch\n");
    }
}
