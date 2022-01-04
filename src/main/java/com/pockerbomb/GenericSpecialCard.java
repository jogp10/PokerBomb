package com.pockerbomb;

public interface GenericSpecialCard {

    void removeSpecialAttribute();
    void removeSpecialAttribute(int i);

    int getSpecialAttribute();

    boolean isActive();

    void draw();
}
