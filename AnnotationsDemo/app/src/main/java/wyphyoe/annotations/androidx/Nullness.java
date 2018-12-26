package wyphyoe.annotations.androidx;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by Wai Yan on 12/4/18.
 */
public class Nullness {

    public static String getName(@Nullable String firstName,
                                 @NonNull String lastName) {

        return firstName == null ? lastName : firstName + " " + lastName;
    }
}
