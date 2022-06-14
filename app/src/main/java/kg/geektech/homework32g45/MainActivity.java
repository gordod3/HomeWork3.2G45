package kg.geektech.homework32g45;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.activity_main_recyclerView);
        names = new ArrayList<>();
        String Aleksey = "Aleksey";
        for (int j = 0; j < 30; j++) {
            Aleksey+='y';
            names.add(Aleksey);
        }
        recyclerView.setAdapter(new NameAdapter(names));
    }

}