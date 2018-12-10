package wyphyoe.annotations;

import android.util.Log;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Size;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Wai Yan on 12/5/18.
 */
public class ValueConstraint {

    public static void testIntRange(@IntRange(from = 0, to = 255) int foo) {
        Log.d("VALUE-CONSTRAINT-@", "Foo (Int range) " + foo);
    }

    public static void testFloatRange(@FloatRange(from = 8.0, to = 10.0) float foo) {
        Log.d("VALUE-CONSTRAINT-@", "Foo (Float range) " + foo);
    }

    //Checks the size of a collection or array
    public static void testSizeCollection(@Size(3) String[] strArray) {
        Log.d("VALUE-CONSTRAINT-@", "Str array " + Arrays.toString(strArray));
    }

    public static void testSizeMinMaxCollection(@Size(min = 3, max = 5) List<Integer> integerList) {
        Log.d("VALUE-CONSTRAINT-@", "Integer List " + integerList);
    }

    //Checks the length of a string
    public static void testSizeString(@Size(min = 8, max = 255) String password) {
        Log.d("VALUE-CONSTRAINT-@", "Password " + password);
    }

    public static void testSizeMultiple(@Size(multiple = 3) String bar) {
        Log.d("VALUE-CONSTRAINT-@", "Bar " + bar);
    }
}
