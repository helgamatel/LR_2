package com.example.lr_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle arg = getIntent().getExtras();
        String V = arg.get("Q").toString();

        TextView textView = (TextView) findViewById(R.id.textView4);
        textView.setText(V);
    }
    public void Button_Click(View view)
    {
        EditText editText = (EditText)findViewById(R.id.editTextText2);
        String O  = new String();
        O = editText.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("A",O);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}