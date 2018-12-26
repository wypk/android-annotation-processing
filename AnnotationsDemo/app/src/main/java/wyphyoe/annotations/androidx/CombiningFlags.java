package wyphyoe.annotations.androidx;

import android.util.Log;
import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Wai Yan on 12/20/18.
 */
public class CombiningFlags {

    public static final int DISPLAY_OP_1 = 1;
    public static final int DISPLAY_OP_2 = 1 << 1;
    public static final int DISPLAY_OP_3 = 1 << 2;

    @IntDef(flag = true,
            value = {
                    DISPLAY_OP_1,
                    DISPLAY_OP_2,
                    DISPLAY_OP_3})
    @Retention(RetentionPolicy.SOURCE)
    @interface DisplayOptions {
    }

    public static void setIntDefFlag(@DisplayOptions int ops) {
        Log.d("ENABLE-COMBINING", "" + ops);
    }
}
