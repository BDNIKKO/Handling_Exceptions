package org.example;

public interface Sensor {
    boolean isOn();
    void setOn();
    void setOff();
    int read();

}
