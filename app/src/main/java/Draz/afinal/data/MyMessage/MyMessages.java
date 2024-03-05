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

    public long getKeyid() {
        return keyid;
    }

    public void setKeyid(long keyid) {
        this.keyid = keyid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public int getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(int contact_phone) {
        this.contact_phone = contact_phone;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

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
