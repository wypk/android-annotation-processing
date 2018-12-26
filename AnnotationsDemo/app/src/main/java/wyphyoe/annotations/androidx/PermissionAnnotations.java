package wyphyoe.annotations.androidx;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RequiresPermission;

/**
 * Created by Wai Yan on 12/23/18.
 */
public class PermissionAnnotations {

    @RequiresPermission(Manifest.permission.CALL_PHONE)
    public static void callPhone(Context context, String phoneNumber) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        context.startActivity(intent);
    }

    @RequiresPermission(allOf = {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE})
    public static void pickPhoto(Context context) {
        //Do pick photo from gallery
    }
}
