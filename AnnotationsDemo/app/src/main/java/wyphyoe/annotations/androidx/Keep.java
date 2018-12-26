package wyphyoe.annotations.androidx;

import android.util.Log;

/**
 * Created by Wai Yan on 12/25/18.
 */
@androidx.annotation.Keep
public class Keep {

    @androidx.annotation.Keep
    public static void doSomething(){
        Log.d("@Keep","Do something");
    }
}
