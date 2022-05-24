package nguyenbinhduong.baikt2.nguyenbinhduongc2_61132767;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ShowLyricActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_lyric);

        Intent BT = getIntent();
        String tenBaiTho = BT.getStringExtra("tenBT");



    }
}
