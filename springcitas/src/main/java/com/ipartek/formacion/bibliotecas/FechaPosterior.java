package com.ipartek.formacion.bibliotecas;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = FechaPosteriorValidator.class)
@Target({ ElementType.TYPE }) // Se aplica a nivel de clase
@Retention(RetentionPolicy.RUNTIME)
public @interface FechaPosterior {
    String message() default "La fecha final debe ser posterior a la fecha inicial";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String fechaInicio();
    String fechaFin();
}