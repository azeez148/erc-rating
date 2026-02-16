package com.nest.erc.yaml.formatter.snakeyaml.introspector;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;

import com.nest.erc.yaml.formatter.snakeyaml.error.YAMLException;
import com.nest.erc.yaml.formatter.snakeyaml.util.ArrayUtils;

/**
 * <p>
 * A <code>FieldProperty</code> is a <code>Property</code> which is accessed as
 * a field, without going through accessor methods (setX, getX). The field may
 * have any scope (public, package, protected, private).
 * </p>
 */
public class FieldProperty extends GenericProperty {

    private final Field field;

    public FieldProperty(Field field) {
        super(field.getName(), field.getType(), field.getGenericType());
        this.field = field;
        field.setAccessible(true);
    }

    @Override
    public void set(Object object, Object value) throws Exception {
        field.set(object, value);
    }

    @Override
    public Object get(Object object) {
        try {
            return field.get(object);
        } catch (Exception e) {
            throw new YAMLException("Unable to access field " + field.getName() + " on object "
                    + object + " : " + e);
        }
    }

    @Override
    public List<Annotation> getAnnotations() {
        return ArrayUtils.toUnmodifiableList(field.getAnnotations());
    }

    @Override
    public <A extends Annotation> A getAnnotation(Class<A> annotationType) {
        return field.getAnnotation(annotationType);
    }

}
