package luthfi.unuja.dicodingfirstsubmission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvManga;
    private ArrayList<Manga> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvManga = findViewById(R.id.rv_manga);
        rvManga.setHasFixedSize(true);

        list.addAll(MangasData.getListData());

        showMangaList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        clickedMenu(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void clickedMenu(int itemId) {
        switch (itemId) {
            case R.id.menu_profile:
                Intent intentProfile = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(intentProfile);
                break;
        }
    }

    private void showMangaList() {
        rvManga.setLayoutManager(new LinearLayoutManager(this));
        MangaAdapter mangaViewAdapter = new MangaAdapter(list);
        rvManga.setAdapter(mangaViewAdapter);
    }
}
