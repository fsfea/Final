package Draz.afinal;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class Add_Message_Activity extends AppCompatActivity {
    private Button btnSave;
    private Button BTNCancel;
    private SeekBar skbrImportance;
    private TextInputEditText etTitle;
    private TextInputEditText etShortTitle;
    private TextInputEditText etText;
    private TextInputEditText etContact_name ;
    private TextInputEditText et_Contactphone ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_message);
        btnSave = findViewById(R.id.btnSave);
        BTNCancel = findViewById(R.id.BTNCancel);
        skbrImportance = findViewById(R.id.skbrImportance);
        etTitle = findViewById(R.id.etTitle);
        etContact_name = findViewById(R.id.etContact_name);
        etText = findViewById(R.id.etText);
        et_Contactphone= findViewById(R.id.et_Contactphone);

        //initAutoEtSubjects();
    }

    /**
     *
     */
//   private void initAutoEtSubjects()
//{
//
//      AppDatabase db =AppDatabase.getDB(getApplicationContext());
//      MySubjectQuery subjectQuery=db.getMySubjectQuery();
//    List<MySubject>allSubjects=subjectQuery.getAllSubjects();
//    ArrayAdapter<MySubject> adapter=new ArrayAdapter<MySubject>(this, android.R.layout.simple_dropdown_item_1line);
//    adapter.addAll(allSubjects);
//    autoEtSubj.setAdapter(adapter);
//
//    autoEtSubj.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            autoEtSubj.showDropDown();
//        }
//    });
//
//}





//    private void checkEmailPassw() {
//        boolean isAllOK = true;
//        String short_title = etShortTitle.getText().toString();
//        String Text = etText.getText().toString();
//        String importance = tvImpoertance.getText().toString();
//        if (short_title.length() < 3 || short_title.contains(" ") == true) {
//
//            isAllOK = false;
//            etShortTitle.setError("Wrong short_title");
//        }
//        if (Text.length() < 3 || Text.contains(" ") == true) {
//
//            isAllOK = false;
//            etText.setError("Wrong text");
//        }
//
//        if (importance.length() < 8 || importance.contains(" ") == true) {
//
//            isAllOK = false;
//            tvImpoertance.setError("Wrong importance");
//        }
//
//
//        if (isAllOK) {
//            Toast.makeText(this, "All OK", Toast.LENGTH_SHORT).show();
//        }
//
//
//    }

    public void onClickSave(View v) {
       /// checkEmailPassw();
        checkShortTitleAndText();

    }
    private void checkShortTitleAndText()
    {

        boolean isAllOk=true; // يحوي نتيجة فحص الحقول ان كانت سليمة

        String shortTitle=etShortTitle.getText().toString();
        String text=etText.getText().toString();
      //  String whichsubj= autoEtSubj.getText().toString();


        int importancee=skbrImportance.getProgress();


        if (shortTitle.length()<1)
        {
            isAllOk=false;
            etShortTitle.setError("short title is empty");
        }

        if (text.length()<1)
        {
            isAllOk=false;
            etText.setError("text is empty");
        }
       // if (whichsubj.length()<1)
        {
            isAllOk=false;
           // autoEtSubj.setError("you didn't chose the subject");

        }

//        if (isAllOk)
//        {
//            Toast.makeText(this,"All ok",Toast.LENGTH_SHORT).show();
//            AppDatabase db=AppDatabase.getDB(getApplicationContext());
//            MySubjectQuery subjectQuery=db.getMySubjectQuery();
//
//
//            if (subjectQuery.checkSubject(whichsubj)==null) // فحص هل الموضوع من قبل بالجدول
//            {
//                //بناء موضوع جديد واضافته
//                MySubject subject=new MySubject();
//                subject.title=whichsubj;
//                subjectQuery.insertAll(subject);
//            }
//            //استخراج id الموضوع لأننا بحاجة لرقمه التسلسلي
//
//            MySubject subject= subjectQuery.checkSubject(whichsubj);
//
//
//            MyTasks task=new MyTasks();
//            task.importance=importancee;
//            task.Text=text;
//            task.shortTitle=shortTitle;
//            task.subjId=subject.getKeyid();//تحديد رقم الموضوع للمهة
//            db.getMyTaskQuery().insertTask(task);//اضافة المهمة للجدول
//            finish();
//
//        }


    }
    public void onClickCancel2(View v) {

        finish();
    }

}

