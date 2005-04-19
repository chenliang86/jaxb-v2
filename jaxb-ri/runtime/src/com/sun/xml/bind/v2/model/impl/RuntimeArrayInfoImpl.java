package com.sun.xml.bind.v2.model.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import com.sun.xml.bind.v2.model.annotation.Locatable;
import com.sun.xml.bind.v2.model.runtime.RuntimeArrayInfo;
import com.sun.xml.bind.v2.model.runtime.RuntimeNonElement;
import com.sun.xml.bind.v2.runtime.Transducer;

/**
 * @author Kohsuke Kawaguchi
 */
final class RuntimeArrayInfoImpl extends ArrayInfoImpl<Type,Class,Field,Method> implements RuntimeArrayInfo {
    RuntimeArrayInfoImpl(RuntimeModelBuilder builder, Locatable upstream, Class arrayType) {
        super(builder, upstream, arrayType);
    }

    public Class getType() {
        return (Class)super.getType();
    }

    public RuntimeNonElement getItemType() {
        return (RuntimeNonElement)super.getItemType();
    }

    public Transducer getTransducer() {
        return null;
    }
}
