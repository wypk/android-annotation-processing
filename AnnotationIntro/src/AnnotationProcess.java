import java.lang.reflect.Field;

public class AnnotationProcess {

    public static User nullWithBlank(User data) throws IllegalAccessException {

        for (Field field : data.getClass().getDeclaredFields()) {
            NullWithBlank annotation = field.getDeclaredAnnotation(NullWithBlank.class);
            if (null != annotation) {
                field.setAccessible(true);
                field.set(data, "-");
            }
        }
        return data;
    }

    public static User nullWithDefault(User data) throws IllegalAccessException {

        for (Field field : data.getClass().getDeclaredFields()) {
            NullWithDefault annotation = field.getDeclaredAnnotation(NullWithDefault.class);
            if (null != annotation) {
                field.setAccessible(true);
                field.set(data, annotation.value());
            }
        }
        return data;
    }
}
