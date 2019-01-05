package wyphyoe.annotations.androidx

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*
import wyphyoe.annotations.R
import wyphyoe.annotations.androidx.callsuper.Cat
import wyphyoe.annotations.androidx.javaannotations.override.ChildClass


class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "Annotation"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {

            //this.testOverride()

            //this.testNullness()

            //this.testResource()

            //this.testThread()

            //this.testValueConstraint()

            //this.testReturnValue()

            //this.testCallSuper()

            //this.testTypedef()

            //this.testCombiningFlags()

            //this.testPermissionAnnotation()

            //this.testKeep()
        }
    }

    private fun testOverride() {
        val childClass = ChildClass()
        childClass.doSomething()
    }

    private fun testNullness() {

        val nameOne = Nullness.getName(null, "")
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

    private fun testCombiningFlags() {
        CombiningFlags.setIntDefFlag(CombiningFlags.DISPLAY_OP_1 or CombiningFlags.DISPLAY_OP_2)
        CombiningFlags.setIntDefFlag(CombiningFlags.DISPLAY_OP_2 and CombiningFlags.DISPLAY_OP_3)
    }

    private fun testPermissionAnnotation() {
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            PermissionAnnotations.callPhone(this, "09428155046")
        } else {
            ActivityCompat.requestPermissions(
                this
                , arrayOf(Manifest.permission.CALL_PHONE), 1
            )
        }
    }

    private fun testKeep() {
        Keep.doSomething()
    }
}
