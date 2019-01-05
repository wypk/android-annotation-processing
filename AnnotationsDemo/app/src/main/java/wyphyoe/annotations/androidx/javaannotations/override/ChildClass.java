package wyphyoe.annotations.androidx.javaannotations.override;

import android.util.Log;

/**
 * Created by Wai Yan on 1/3/19.
 */
public class ChildClass extends ParentClass{

    @Override
    public void doSomething() {
        //super.doSomething();
        Log.d("OVERRIDE","do something in child.");
    }
}
