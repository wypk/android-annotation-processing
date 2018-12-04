package wyphyoe.annotations

import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = "Annotation"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {

            //this.testNullness()

            this.testResource()

            this.testThread()
        }
    }

    private fun testNullness() {

        val nameOne = Nullness.getName(null, "John")
        d(TAG, "Name one -> $nameOne")

        val nameTwo = Nullness.getName("Wai", "Yan")
        d(TAG, "Name one -> $nameTwo")

        //val nameThree = Nullness.getName("Wai", null) //Last name must not null
    }

    private fun testResource() {

        val messageOne = Resource.getMessage(R.string.app_name, this)
        d(TAG, "Message -> $messageOne")

        //val messageTwo = Resource.getMessage(1, this)

        Resource.showDialog(
            R.drawable.ic_announcement,
            R.string.resource_annotation_message,
            R.dimen.dialog_padding,
            R.color.colorPrimary,
            this
        )
    }

    private fun testThread() {

        ThreadAnnotation.downLoadImageDummy("https://........")
    }
}
