package com.example.stikom_01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SELECT `id`, `user_id`, `nama`, `jenis_kelamin`,
        `tanggal_lahir`, `gambar`, `jabatan`, `created_at`
        FROM `pegawai`;
    }
}