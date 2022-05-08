package com.induk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void plusCallBack(View view) {
        EditText editOne = (EditText) findViewById(R.id.editOne);
        EditText editTwo = (EditText) findViewById(R.id.editTwo);

        int one = Integer.parseInt(editOne.getText().toString());
        int two = Integer.parseInt(editTwo.getText().toString());

        EditText editResult = (EditText) findViewById(R.id.editResult);
        String strResult = String.valueOf(one + two);
        editResult.setText(strResult);
    }

    public void minusCallBack(View view) {
        EditText editOne = (EditText) findViewById(R.id.editOne);
        EditText editTwo = (EditText) findViewById(R.id.editTwo);

        int one = Integer.parseInt(editOne.getText().toString());
        int two = Integer.parseInt(editTwo.getText().toString());

        EditText editResult = (EditText) findViewById(R.id.editResult);
        String strResult = String.valueOf(one - two);
        editResult.setText(strResult);
    }

    public void mulCallBack(View view) {
        EditText editOne = (EditText) findViewById(R.id.editOne);
        EditText editTwo = (EditText) findViewById(R.id.editTwo);

        int one = Integer.parseInt(editOne.getText().toString());
        int two = Integer.parseInt(editTwo.getText().toString());

        EditText editResult = (EditText) findViewById(R.id.editResult);
        String strResult = String.valueOf(one * two);
        editResult.setText(strResult);
    }

    public void DivideCallBack(View view) {
        EditText editOne = (EditText) findViewById(R.id.editOne);
        EditText editTwo = (EditText) findViewById(R.id.editTwo);

        int one = Integer.parseInt(editOne.getText().toString());
        int two = Integer.parseInt(editTwo.getText().toString());

        EditText editResult = (EditText) findViewById(R.id.editResult);
        String strResult = String.valueOf(one / two);
        editResult.setText(strResult);
    }
}