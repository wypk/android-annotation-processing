package wyphyoe.annotations.androidx;

import androidx.annotation.CheckResult;

/**
 * Created by Wai Yan on 12/6/18.
 */
public class ReturnValue {

    @CheckResult(suggest = "#Name")
    public static String testReturnValue(String firstName, String lastName) {
        return firstName + lastName;
    }
}
