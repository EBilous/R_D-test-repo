package src.home_work.LEC28.reflection;

import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class CyrillicValidator {
    public static void validate(Object object) throws IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(CyrillicValidation.class)) {
                field.setAccessible(true);
                Object value = field.get(object);

                if (value != null && !isValidCyrillic(value.toString())) {
                    throw new IllegalArgumentException("Validation failed for field: " + field.getName());
                }
            }
        }
    }

    private static boolean isValidCyrillic(String input) {
        String cyrillicPattern = "^\\p{IsCyrillic}+$";
        return Pattern.matches(cyrillicPattern, input);
    }
}
