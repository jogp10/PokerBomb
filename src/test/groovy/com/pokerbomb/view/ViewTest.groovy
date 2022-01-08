package com.pokerbomb.view

import com.googlecode.lanterna.graphics.TextGraphics
import com.pokerbomb.model.Model
import spock.lang.Specification

public abstract class ViewTest<T extends Model> extends Specification {
    protected TextGraphics graphics;
    protected T model;
    protected View<T> view;
}
