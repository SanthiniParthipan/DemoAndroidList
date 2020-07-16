package sg.edu.rp.c346.id19028654.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersion;
   // ArrayAdapter<AndroidVersion> aaAndroidVersion;
    ArrayList<AndroidVersion> alAndroidVersion;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersion=findViewById(R.id.listViewAndroidVersion);
        alAndroidVersion=new ArrayList<>();
        //AndroidVersion av1=new AndroidVersion("pie",""9.0);
        //alAndroidVersion.add(av1);
        alAndroidVersion.add(new AndroidVersion("pie","9.0"));
        alAndroidVersion.add(new AndroidVersion("oreo ", "8.0- 8.1"));
        alAndroidVersion.add(new AndroidVersion("nougat ", "7.0-7.1.2"));
        alAndroidVersion.add(new AndroidVersion("marshmallow ","6.6"));

        //aaAndroidVersion=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,alAndroidVersion);

        adapter=new CustomAdapter(this,R.layout.row,alAndroidVersion);
        lvAndroidVersion.setAdapter(adapter);

    }
}
