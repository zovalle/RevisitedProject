package com.androidbasico.revisitedproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText mTextView;
    private String[] data = {"Micah", "Natalie", "Zobiesky", "Marilyn", "Mery", "Cajuil", "Mami", "Negrita"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (EditText) findViewById(R.id.editText);
        findViewById(R.id.showButton).setOnClickListener(this);

        AutoCompleteTextView autoCompleteText = (AutoCompleteTextView) findViewById(R.id.autoCompleteText);
        autoCompleteText.setAdapter(new ArrayAdapter<>(this, android.R.layout.select_dialog_item, data));
        // number of chars to trigger lookup
        autoCompleteText.setThreshold(1);
    }

    @Override
    public void onClick(View view) {
        Toast toast = Toast.makeText(this, mTextView.getText(), Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, Gravity.TOP, Gravity.BOTTOM);
        toast.show();
    }
}
