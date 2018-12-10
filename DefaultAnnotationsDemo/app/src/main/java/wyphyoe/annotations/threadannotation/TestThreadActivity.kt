package wyphyoe.annotations.threadannotation

import android.os.Bundle
import android.util.Log
import androidx.annotation.UiThread
import androidx.annotation.WorkerThread
import androidx.appcompat.app.AppCompatActivity
import wyphyoe.annotations.R


class TestThreadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_thread)

        onUiThread()
        runOnUiThread { onWorkerThread() }
    }

    @WorkerThread
    private fun onWorkerThread() {
        //Do something
        Thread(Runnable { Log.d("THREAD_@", "Run on worker thread." + Thread.currentThread()) }).run()
    }

    @UiThread
    private fun onUiThread() {
        //Do something
        Log.d("THREAD_@", "Run on ui thread." + Thread.currentThread())
    }
}
