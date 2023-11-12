package Draz.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
private FloatingActionButton fabAdd ;
private SearchView srchV ;
private Spinner spnrSubject;
private ListView lstvTasks ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fabAdd =findViewById(R.id.fabAdd);
        srchV = findViewById(R.id.srchV);
        spnrSubject = findViewById(R.id.spnrSubject);
        lstvTasks =findViewById(R.id.lstvTasks);

        Log.d("draz","onCreate");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }
    public void onKlickGo (View v)
    {




    }
}