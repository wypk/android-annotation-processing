package wyphyoe.annotations.androidx.javaannotations;

/**
 * Created by Wai Yan on 1/5/19.
 */
//@SuppressWarnings("deprecation")
public class DeprecatedAndSuppress {

    public static void main(String[] args) {
        deprecatedMethod();
    }

    @Deprecated
    private static void deprecatedMethod(){
        //Do something
    }
}
