package wyphyoe.annotations.callsuper;

import android.util.Log;
import androidx.annotation.CallSuper;

/**
 * Created by Wai Yan on 12/10/18.
 */
public class Animal {

    @CallSuper
    protected void run() {
        Log.d("CALL-SUPER", "Animal run");
    }
}
