package com.mcubes.factory;

import com.mcubes.beans.Device;
import com.mcubes.beans.IPhone;
import com.mcubes.beans.Samsung;
import com.mcubes.type.Brand;

/**
 * Created by A.A.MAMUN on 7/13/2020.
 */
/**
 * Create concrete classes 'PhoneFactory'
 * implementing the 'DeviceAbstractFactory' interface.
 */
public class PhoneFactory implements DeviceAbstractFactory {

    private Brand brand;

    public PhoneFactory(Brand brand){
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
                device = new IPhone();
                break;
            case SAMSUNG:
                device = new Samsung();
                break;
        }
        return device;
    }
}
