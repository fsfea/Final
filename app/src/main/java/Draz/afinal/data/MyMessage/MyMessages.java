package Draz.afinal.data.MyMessage;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class MyMessages {
    @PrimaryKey(autoGenerate = true)
    public long keyid;// رقم المهمة
    public String title;//عنوان الرسالة
    public String Text;//نص الرسالة
    public String contact_name;// اسماء جهات الاتصال
    public int contact_phone;//رقم الهاتف
    public int y;//السنة
    public int month;//الشهر
    public int d;//اليوم
    public double h;//الساعات
    public double m;//الدقائق
    public boolean isCompleted;//هل تمت المهمة

    @Override
    public String toString() {
        return "MyMessages{" +
                "keyid=" + keyid +
                ", title='" + title + '\'' +
                ", Text='" + Text + '\'' +
                ", contact_name='" + contact_name + '\'' +
                ", contact_phone=" + contact_phone +
                ", y=" + y +
                ", month=" + month +
                ", d=" + d +
                ", h=" + h +
                ", m=" + m +
                ", isCompleted=" + isCompleted +
                '}';
    }
}
