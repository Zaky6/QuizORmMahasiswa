package com.example.quizormmahasiswa;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
//test
@Dao
public interface MahasiswaDAO {
    @Insert
    void insert(Mahasiswa Mahasiswa);

    @Update
    void update(Mahasiswa Mahasiswa);

    @Delete
    void delete(Mahasiswa Mahasiswa);

    @Query("SELECT * FROM Mahasiswa")
    List<Mahasiswa> getAllMahasiswa();

}
