package com.web.mindfulmedic;

import org.tensorflow.lite.support.model.Model;
import org.tensorflow.lite.gpu.CompatibilityList;
import org.tensorflow.lite.gpu.GpuDelegate;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class activity_symptoms {

    static {
        System.loadLibrary("tensorflow_inference");
    }

    static {
        System.loadLibrary("tensorflow_inference");
    }

    private static final String MODEL_NAME = "file:///android_asset/model.h5";
    private static final String INPUT_NODE = "input_features";
    private static final String OUTPUT_NODE = "y_out";
    private static final int[] INPUT_SHAPE = {1, 1};
    private static final String label = "file:///android_asset/label.txt";
    private static final String model = "file:///android_asset/model/tflite";
    private static final String tensor = "file:///android_asset/model_opt.tflite";


    EditText editText;
    TextView textView;


    public void pressButton(View view) {
        float input = Float.parseFloat(editText.getText().toString());
        Log.d("activity_disease", String.valueOf(input));
        String results = performInference(input);
        textView.setText(results);

    }

    private String performInference(float input) {
        float inputt = Float.parseFloat(editText.getText().toString());
        Log.d("activity_symptoms", String.valueOf(input));
        String results = performInference(input);
        textView.setText(results);

      return "";
    }
}
