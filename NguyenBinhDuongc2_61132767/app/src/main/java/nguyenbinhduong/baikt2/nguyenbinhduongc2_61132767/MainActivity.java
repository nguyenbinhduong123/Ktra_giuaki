package nguyenbinhduong.baikt2.nguyenbinhduongc2_61132767;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> listPoem =  new ArrayList<String>();
        listPoem.add("ga_con_di_hoc");
        listPoem.add("truyen_kieu");
        listPoem.add("bac_toi_choi_nha");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listPoem);
        ListView lv= (ListView)findViewById(R.id.listView_Cac_bai_tho);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String tenBaiTho = listPoem.get(i);
                Intent intentBT = new Intent(MainActivity.this, ShowLyricActivity.class);
                intentBT.putExtra("tenBT",tenBaiTho);
                startActivity(intentBT);
            }
        });

    }
}