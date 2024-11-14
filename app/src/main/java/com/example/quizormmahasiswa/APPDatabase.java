package com.example.quizormmahasiswa;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Mahasiswa.class}, version = 1)
public abstract class APPDatabase extends RoomDatabase {
    private static APPDatabase instance;

    public abstract MahasiswaDAO mahasiswaDao();

    public static synchronized APPDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            APPDatabase.class, "mahasiswa_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
//    test
}