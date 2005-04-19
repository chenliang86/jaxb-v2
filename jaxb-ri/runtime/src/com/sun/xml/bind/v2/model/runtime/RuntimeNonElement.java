package com.sun.xml.bind.v2.model.runtime;

import java.lang.reflect.Type;

import com.sun.xml.bind.v2.model.core.NonElement;
import com.sun.xml.bind.v2.runtime.Transducer;

/**
 * @author Kohsuke Kawaguchi
 */
public interface RuntimeNonElement extends NonElement<Type,Class>, RuntimeTypeInfo {
    /**
     * This method doesn't take the reference properties defined on
     * {@link RuntimeNonElementRef} into account (such as ID-ness.)
     *
     * @see RuntimeNonElementRef#getTransducer()
     */
    Transducer getTransducer();
}
