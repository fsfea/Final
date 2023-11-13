package Draz.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Sign_IN extends AppCompatActivity
{
    private TextInputEditText etE_mail;
    private TextInputEditText etPassword;
    private Button btnsignin ;
    private Button btnSignUP ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        etE_mail = findViewById(R.id.etE_mail) ;
        etPassword = findViewById(R.id.etPassword) ;
        btnsignin = findViewById(R.id.btnsignin) ;
        btnSignUP=findViewById(R.id.btnSignUP);



    }
    public void onClickSignUp (View v)
    {
        Intent i = new Intent( Sign_IN.this,Sign_Up.class );
        startActivity(i);
    }
}