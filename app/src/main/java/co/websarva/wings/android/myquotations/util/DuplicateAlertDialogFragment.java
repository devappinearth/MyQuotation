package co.websarva.wings.android.myquotations.util;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.appcompat.app.AlertDialog;

import co.websarva.wings.android.myquotations.QuotationCreateActivity;
import co.websarva.wings.android.myquotations.R;

public class DuplicateAlertDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setMessage(R.string.duplicate_title_alert);
            builder.setPositiveButton(R.string.alert_btn_ok, new DialogButtonClickListener());
            AlertDialog dialog = builder.create();
            return dialog;
        }

    private class DialogButtonClickListener implements DialogInterface.OnClickListener{
        @Override
        public void onClick(DialogInterface dialog, int which) {

            }
        }

}
