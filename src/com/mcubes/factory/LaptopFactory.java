package com.mcubes.factory;

import com.mcubes.beans.AppleLaptop;
import com.mcubes.beans.Device;
import com.mcubes.beans.SamsungLaptop;
import com.mcubes.type.Brand;

/**
 * Created by A.A.MAMUN on 7/13/2020.
 */
/**
 * Create concrete classes 'LaptopFactory'
 * implementing the 'DeviceAbstractFactory' interface.
 */
public class LaptopFactory implements DeviceAbstractFactory {

    private Brand brand;

    public LaptopFactory(Brand brand){
        this.brand = brand;
    }

    /**
     * Return object by Brand
     */
    @Override
    public Device createDevice() {

        Device device = null;
        switch (brand){
            case APPLE:
                device = new AppleLaptop();
                break;
            case SAMSUNG:
                device = new SamsungLaptop();
                break;
        }
        return device;
    }
}
