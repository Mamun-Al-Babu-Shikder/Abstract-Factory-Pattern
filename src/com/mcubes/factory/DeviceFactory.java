package com.mcubes.factory;

import com.mcubes.beans.Device;
import com.mcubes.type.Brand;

/**
 * Created by A.A.MAMUN on 7/13/2020.
 */
public class DeviceFactory {

    /**
     * The parameter of getDevice() method is 'DeviceAbstractFactory'.
     * The child of DeviceAbstractFactory are PhoneFactory and LaptopFactory,
     * hence it doesn't know which runtime object will arise there.
     * It just create device according to runtime object.
     */
    public static Device getDevice(DeviceAbstractFactory deviceAbstractFactory){
        return deviceAbstractFactory.createDevice();
    }
}
