package wyphyoe.annotations.androidx;

import android.util.Log;
import androidx.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Wai Yan on 12/11/18.
 */
public class Typedef {

    public static final String ON = "On";
    public static final String OFF = "Off";

    @StringDef({ON, OFF})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
    }

    public static void setStatus(@Status String status) {
        Log.d("TYPE-DEF", status);
    }
}
