package nguyenbinhduong.baikt2.nguyenbinhduongc1_61132767;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editSoA, editSoB, editSoH;
    TextView textViewKetQua;
    Button nutChuvi, nutDientich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();
    }

    void TimWidget() {
        editSoA= (EditText)findViewById(R.id.edSoA);
        editSoB= (EditText)findViewById(R.id.edSoB);
        editSoB= (EditText)findViewById(R.id.edSoB);
        textViewKetQua= (TextView)findViewById(R.id.tvKetQua);
        nutChuvi= (Button) findViewById(R.id.btnChuvi);
        nutDientich= (Button) findViewById(R.id.btnDientich);
    }

    public void XulyChuvi(View v) {
        String sA= editSoA.getText().toString();
        String sB= editSoB.getText().toString();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int chuvi = (a+b)*2;
        String chuoiChuvi = String.valueOf(chuvi);
        textViewKetQua.setText("Chu vi là:"+  chuoiChuvi);
    }

    public void XulyDientich(View v) {
        String sA= editSoA.getText().toString();
        String sH= editSoH.getText().toString();
        int a = Integer.parseInt(sA);
        int h = Integer.parseInt(sH);
        int dientich = a*h;
        String chuoiDientich = String.valueOf(dientich);
        textViewKetQua.setText("Diện tích là:"+  chuoiDientich);
    }
}