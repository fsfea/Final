package Draz.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class Sign_Up extends AppCompatActivity
{
    private TextInputLayout etname;
    private TextInputLayout etE_mail ;
    private TextInputLayout etpassword ;
    private TextInputLayout et_repassword;
    private TextInputLayout etphone;
    private Button btnSave ;
    private Button BTNCancel ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etname = findViewById(R.id.etname) ;
        etE_mail = findViewById(R.id.etE_mail) ;
        etpassword = findViewById(R.id.etpassword) ;
        et_repassword=findViewById(R.id.et_repassword);
        etphone = findViewById(R.id. etphone) ;
        btnSave= findViewById(R.id.btnSave) ;
        BTNCancel= findViewById(R.id.BTNCancel) ;
    }
}