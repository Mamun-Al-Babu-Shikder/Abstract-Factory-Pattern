package com.mcubes.test;

import com.mcubes.beans.Device;
import com.mcubes.factory.DeviceAbstractFactory;
import com.mcubes.factory.DeviceFactory;
import com.mcubes.factory.LaptopFactory;
import com.mcubes.factory.PhoneFactory;
import com.mcubes.type.Brand;


/**
 * Created by A.A.MAMUN on 7/12/2020.
 */

/**
 * Abstract Factory design pattern is one of the Creational pattern.
 * Abstract Factory pattern is almost similar to Factory Pattern is
 * considered as another layer of abstraction over factory pattern.
 * Abstract Factory patterns work around a super-factory which creates other factories.
 * This factory is also called as factory of factories.
 */
public class TestAbstractFactoryPattern {

    public static void main(String[] args) {

        Device phone1 = DeviceFactory.getDevice(new PhoneFactory(Brand.APPLE));
        phone1.configuration();

        Device phone2 = DeviceFactory.getDevice(new PhoneFactory(Brand.SAMSUNG));
        phone2.configuration();

        Device laptop1 = DeviceFactory.getDevice(new LaptopFactory(Brand.APPLE));
        laptop1.configuration();

        Device laptop2 = DeviceFactory.getDevice(new LaptopFactory(Brand.SAMSUNG));
        laptop2.configuration();

    }

}
