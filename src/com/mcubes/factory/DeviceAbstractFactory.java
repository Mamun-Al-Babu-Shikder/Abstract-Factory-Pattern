package com.mcubes.factory;

import com.mcubes.beans.Device;
import com.mcubes.type.Brand;

/**
 * Created by A.A.MAMUN on 7/13/2020.
 */

/**
 * Declares an interface for operations
 * that create abstract Device objects.
 */
public interface DeviceAbstractFactory {
    Device createDevice();
}
