package com.example.uddd;

import androidx.appcompat.R;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.deitel.qlsv.ActivitySubject;

public class MainActivity extends AppCompatActivity {
    Button btnSubject,btnAuthor,btnExit,btnStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.);
        btnAuthor=findViewById(R.id.btnStudent);
        btnExit=findViewById(R.id.btnExit);
        btnSubject=findViewById(R.id.btnSubject);
        btnAuthor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogAuthor();
            }
        });

        btnSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivitySubject.class);
                startActivity(intent);
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogExit();
            }
        });
    }

    private void DialogExit() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialogexit);
//       Click ra ngoài là tắt dialog
        dialog.setCanceledOnTouchOutside(false);
        Button btnYes = dialog.findViewById(R.id.buttonYes);
        Button btnNo = dialog.findViewById(R.id.buttonNo);
        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
                Intent intent1= new Intent(Intent.ACTION_MAIN);
                intent1.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent1);
            }
        });
        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        dialog.show();
    }

    private void DialogAuthor(){
        Dialog dialog = new Dialog(this);

        dialog.setContentView(R.layout.dialoginformation);
        dialog.show();
    }
}