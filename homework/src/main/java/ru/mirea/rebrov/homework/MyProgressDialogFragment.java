package ru.mirea.rebrov.homework;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;

public class MyProgressDialogFragment {
    public MyProgressDialogFragment(Context context) {
        ProgressDialog pd = new ProgressDialog(context);
        pd.setTitle("Title");
        pd.setMessage("Message");
        pd.setButton(Dialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        pd.show();
    }
}
