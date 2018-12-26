package wyphyoe.annotations.androidx;

import android.app.AlertDialog;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

import java.util.Objects;

/**
 * Created by Wai Yan on 12/4/18.
 */
public class Resources {

    public static String getMessage(@StringRes int strResId,
                                    Context context) {

        return context.getResources().getString(strResId);
    }

    public static void showDialog(@DrawableRes int icon,
                                  @StringRes int message,
                                  @DimenRes int margin,
                                  @ColorRes int color,
                                  Context context) {

        final AlertDialog.Builder builder = new AlertDialog.Builder(context);

        FrameLayout container = new FrameLayout(context);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        params.leftMargin = margin;
        params.rightMargin = margin;

        builder.setIcon(icon);
        builder.setTitle("Hello");
        builder.setMessage(message);
        builder.setView(container);

        AlertDialog dialog = builder.create();
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(color);
        dialog.show();
    }
}
