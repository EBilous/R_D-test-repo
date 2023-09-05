package src.home_work.LEC28.reflection;

// Написати свою анотацію для валідації і імплементатор


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface CyrillicValidation {
    String message() default "Input must contain only Cyrillic letters";
}
