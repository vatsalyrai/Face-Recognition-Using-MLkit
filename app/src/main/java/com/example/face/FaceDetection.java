package com.example.face;
import android.app.Application;

import com.google.firebase.FirebaseApp;

public class FaceDetection extends Application {
    public static final String RESULT = "Result_Text";
    public static final String RESULTDIALOG = "Result_dialog";

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
