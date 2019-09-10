package luthfi.unuja.dicodingfirstsubmission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class MangaDetailActivity extends AppCompatActivity {

    private ImageView ivPoster;
    private CircleImageView ivProfil;
    private TextView tvJudul, tvGenre, tvDeskripsi, tvPengarang, tvPenerbit, tvTerbit, tvVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manga_detail);

        ivPoster = findViewById(R.id.iv_poster);
        ivProfil = findViewById(R.id.iv_profil);

        tvJudul = findViewById(R.id.tv_judul);
        tvGenre = findViewById(R.id.tv_genre);
        tvDeskripsi = findViewById(R.id.tv_deskripsi);
        tvPengarang = findViewById(R.id.tv_pengarang);
        tvPenerbit = findViewById(R.id.tv_penerbit);
        tvTerbit = findViewById(R.id.tv_terbit);
        tvVolume = findViewById(R.id.tv_volume);

        String judul = getIntent().getStringExtra("judul");
        String genre = getIntent().getStringExtra("genre");
        String pengarang = getIntent().getStringExtra("pengarang");
        String penerbit = getIntent().getStringExtra("penerbit");
        String terbit = getIntent().getStringExtra("terbit");
        String volume = getIntent().getStringExtra("volume");
        String poster = getIntent().getStringExtra("poster");
        String profil = getIntent().getStringExtra("profil");
        String deskripsi = getIntent().getStringExtra("deskripsi");

        tvJudul.setText(judul);
        tvGenre.setText(genre);
        tvPenerbit.setText(penerbit);
        tvPengarang.setText(pengarang);
        tvTerbit.setText(terbit);
        tvVolume.setText(volume);
        tvDeskripsi.setText(deskripsi);

        Glide.with(MangaDetailActivity.this)
                .load(poster)
                .into(ivPoster);

        Glide.with(MangaDetailActivity.this)
                .load(profil)
                .into(ivProfil);

        getSupportActionBar().setTitle(judul);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
