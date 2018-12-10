package wyphyoe.annotations;

import androidx.annotation.WorkerThread;

/**
 * Created by Wai Yan on 12/4/18.
 */
public class ThreadAnnotation {

    @WorkerThread
    public static void downLoadImageDummy(String url) {
        //Do Downloading
    }

}
