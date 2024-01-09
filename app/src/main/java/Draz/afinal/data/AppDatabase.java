package Draz.afinal.data;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import Draz.afinal.data.MyMessage.MyMessages;
import Draz.afinal.data.usersTable.MyUser;
import Draz.afinal.data.usersTable.MyuserQuery;
import drz.example.draz27.data.SubjectTable.MySubject;
import drz.example.draz27.data.SubjectTable.MySubjectQuery;
import drz.example.draz27.data.mytasksTable.MyTasks;
import drz.example.draz27.data.mytasksTable.MyTasksQuery;
import drz.example.draz27.data.usersTable.MyUser;
import drz.example.draz27.data.usersTable.MyuserQuery;
/*
تعريف الجداول ورقم الاصدار
version
عند تغيير اي شيء يخص الجداول او دوال علينا تغيير رقم الاصدار
ليتم بناء قاعدة البيانات من جديد
 */



        @Database(entities = {MyUser.class,  MyMessages.class},version = 6)
        /**
         * الفئة المسؤولة عن بناء قاعدة البيانات بكل جداولها
         * وتوفر لنا كائن للتعمل مع قاعدة البيانات
         */



public abstract class AppDatabase extends RoomDatabase
        {
                /**
                 * كائن للتعامل مع قاعدة البيانات
                 */
                private static AppDatabase db;

                /**
                 * يعيد كائن لعمليات جدول المستعملين
                 * @return
                 */

                public abstract MyuserQuery getMyUserQuery();

                /**
                 *  يعيد كائن لعمليات جدول الموضيع
                 * @return
                 */


                public abstract MySubjectQuery getMySubjectQuery();

                /**
                 *  يعيد كائن لعمليات جدول المهمات
                 * @return
                 */

                public abstract MyTasksQuery getMyTaskQuery();

                /**
                 * بناء قاعدة البيانات واعادة كائن يؤشر عليها
                 * @param context
                 * @return
                 */

                public static AppDatabase getDB(Context context) {
                        if (db == null) {
                                db = Room.databaseBuilder(context,
                                                AppDatabase.class, "database-name")
                                        .fallbackToDestructiveMigration()
                                        .allowMainThreadQueries()
                                        .build();
                        }
                        return db;


                }
        }
