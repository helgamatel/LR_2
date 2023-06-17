package com.example.lr_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void button_Click(View view)
    {
        EditText editText = (EditText)findViewById(R.id.editTextText);
        String V = new String();
        V = editText.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("Q",V);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE)
        {
            if (resultCode == RESULT_OK)
            {
                Bundle arg = data.getExtras();
                String O = arg.get("A").toString();
                TextView textView = (TextView)findViewById(R.id.textView3);
                textView.setText(O);
            }
        }
    }
}