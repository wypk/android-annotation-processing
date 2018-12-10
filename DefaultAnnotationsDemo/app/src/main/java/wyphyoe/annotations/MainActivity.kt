package wyphyoe.annotations

import android.os.Bundle
import android.util.Log
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import wyphyoe.annotations.callsuper.Cat

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "Annotation"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {

            //this.testNullness()

            //this.testResource()

            //this.testThread()

            //this.testValueConstraint()

            //this.testReturnValue()

            //this.testCallSuper()

            this.testTypedef()
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

        val messageOne = Resources.getMessage(R.string.app_name, this)
        d(TAG, "Message -> $messageOne")

        //val messageTwo = Resources.getMessage(1, this)

        Resources.showDialog(
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

    private fun testValueConstraint() {

        ValueConstraint.testIntRange(255)
        ValueConstraint.testFloatRange(9F)
        ValueConstraint.testSizeCollection(arrayOf("a", "b", "c"))
        ValueConstraint.testSizeMinMaxCollection(mutableListOf(1, 2, 3, 4, 5))
        ValueConstraint.testSizeString("Password")
        ValueConstraint.testSizeMultiple("123123")
    }

    private fun testReturnValue() {

        //  ReturnValue.testReturnValue("Wai ", "Yan")
        Log.d("RETURN-VALUE", "Return value " + ReturnValue.testReturnValue("Wai ", "Yan"))
    }

    private fun testCallSuper() {
        Cat.test()
    }

    private fun testTypedef() {
        Typedef.setStatus(Typedef.ON)
        Typedef.setStatus(Typedef.OFF)
    }
}
