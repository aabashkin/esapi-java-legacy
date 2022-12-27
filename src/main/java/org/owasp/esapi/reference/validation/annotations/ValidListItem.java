package org.owasp.esapi.reference.validation.annotations;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
 
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
 
import javax.validation.Constraint;
import javax.validation.Payload;
 

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidListItemValidator.class)
@Documented
public @interface ValidListItem {
 
    String message() default "";
 
    Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default {};

    String context();

    // Invalid type List<String> for the annotation attribute ValidListItem.list; 
    // only primitive type, String, Class, annotation, enumeration are permitted or 1-dimensional arrays thereof
    //List<String> list();

    String[] list();

    boolean allowNull();

}
