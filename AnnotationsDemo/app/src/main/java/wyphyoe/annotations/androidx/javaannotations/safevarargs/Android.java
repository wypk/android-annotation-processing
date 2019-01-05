package wyphyoe.annotations.androidx.javaannotations.safevarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Wai Yan on 1/5/19.
 */
public class Android<T> {

    private List<T> versions = new ArrayList<>();

    //@SafeVarargs
    private final void safe(T... toAdd) {
        this.versions.addAll(Arrays.asList(toAdd));
        System.out.println(versions);
    }

    public static void main(String... args) {
        Android<String> androidVersion = new Android<>();
        androidVersion.safe("Lollipop","Oreo","Pie");
    }
}
