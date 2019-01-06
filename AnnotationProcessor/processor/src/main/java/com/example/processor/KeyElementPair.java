package com.example.processor;

import javax.lang.model.element.Element;

/**
 * Created by Wai Yan on 1/5/19.
 */
public class KeyElementPair {

    final String key;
    final Element element;

    KeyElementPair(String key, Element element) {
        this.key = key;
        this.element = element;
    }
}
