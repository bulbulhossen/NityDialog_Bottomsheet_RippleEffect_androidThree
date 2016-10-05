package com.example.bulbulhossen.rippleeffect_android;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cocosw.bottomsheet.BottomSheet;
import com.gitonway.lee.niftymodaldialogeffects.lib.Effectstype;
import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;

public class MainActivity extends AppCompatActivity {

    NiftyDialogBuilder materialDesignAnimatedDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        materialDesignAnimatedDialog = NiftyDialogBuilder.getInstance(this);
    }

    public void openAndroidBottomMenu(View view) {

        new BottomSheet.Builder(this).title("Bottom Menu Title").sheet(R.menu.menu).listener(new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case R.id.menu_help:
                        // TODO when help menu/button is clicked
                        materialDesignAnimatedDialog
                                .withTitle("Animated Slide Top Dialog Title")
                                .withMessage("Add your dialog message here. Animated dialog description place.")
                                .withDialogColor("#1c90ec")
                                .withButton1Text("OK")
                                .withButton2Text("Cancel")
                                .withDuration(700)
                                .withEffect(Effectstype.Slidetop)
                                .show();
                        break;
                    case R.id.menu_call:
                        // TODO when call menu/button is clicked

                        materialDesignAnimatedDialog
                                .withTitle("Animated Fall Dialog Title")
                                .withMessage("Add your dialog message here. Animated dialog description place.")
                                .withDialogColor("#1c90ec")
                                .withButton1Text("OK")
                                .withButton2Text("Cancel")
                                .withDuration(700)
                                .withEffect(Effectstype.Fall)
                                .show();
                        break;
                    case R.id.menu_upload:
                        // TODO when upload menu/button is clicked
                        materialDesignAnimatedDialog
                                .withTitle("Animated Flip Dialog Title")
                                .withMessage("Add your dialog message here. Animated dialog description place.")
                                .withDialogColor("#1c90ec")
                                .withButton1Text("OK")
                                .withButton2Text("Cancel")
                                .withDuration(700)
                                .withEffect(Effectstype.Fliph)
                                .show();
                        break;
                    case R.id.menu_share:
                        // TODO when share menu/button is clicked
                        materialDesignAnimatedDialog
                                .withTitle("Animated Shake Dialog Title")
                                .withMessage("Add your dialog message here. Animated dialog description place.")
                                .withDialogColor("#1c90ec")
                                .withButton1Text("OK")
                                .withButton2Text("Cancel")
                                .withDuration(700)
                                .withEffect(Effectstype.Shake)
                                .show();
                        break;
                }
            }
        }).show();
    }
}
