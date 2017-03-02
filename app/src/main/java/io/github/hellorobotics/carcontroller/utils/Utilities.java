/*
 *  Copyright 2017 HelloRobotics.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *     either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package io.github.hellorobotics.carcontroller.utils;

/**
 * Author: towdium
 * Date:   24/02/17.
 */

public class Utilities {
    public static String arrayToString(byte[] data) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Data: ");
        for (byte b : data) {
            stringBuilder.append(String.format("0x%02x ", b));
        }
        return stringBuilder.toString();
    }

    public static int toUnsigned(byte b) {
        if ((int) b < 0) {
            return (int) b + 256;
        } else {
            return (int) b;
        }
    }
}
