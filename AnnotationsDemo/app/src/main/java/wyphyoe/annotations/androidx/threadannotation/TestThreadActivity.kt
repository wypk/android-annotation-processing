package wyphyoe.annotations.androidx.threadannotation

import android.os.Bundle
import android.util.Log
import androidx.annotation.BinderThread
import androidx.annotation.UiThread
import androidx.annotation.WorkerThread
import androidx.appcompat.app.AppCompatActivity
import wyphyoe.annotations.R


class TestThreadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_thread)

        this.onUiThread()
        runOnUiThread { onWorkerThread() }
    }

    @WorkerThread
    private fun onWorkerThread() {

        // tvDummy.text = "Dummy"
        // this.onUiThread()
        // this.unannotatedCallsUiThread()

        Thread(Runnable { Log.d("THREAD_@", "Run on worker thread." + Thread.currentThread()) }).run()
    }

    @UiThread
    private fun onUiThread() {

        // tvDummy.text = "Dummy"
        // this.onWorkerThread()

        Log.d("THREAD_@", "Run on ui thread." + Thread.currentThread())
    }

    private fun unannotatedCallsUiThread() {

        this.onUiThread()
    }

    @BinderThread
    private fun binderThread() {
        // Do like ContentProvider, Hardware process
    }
}
