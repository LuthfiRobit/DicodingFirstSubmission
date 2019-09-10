package luthfi.unuja.dicodingfirstsubmission;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MangaAdapter extends RecyclerView.Adapter<MangaAdapter.MangaViewHolder> {
    private ArrayList<Manga> listManga;

    public MangaAdapter(ArrayList<Manga> listManga) {
        this.listManga = listManga;
    }

    @NonNull
    @Override
    public MangaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_manga, viewGroup, false);
        return new MangaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MangaViewHolder mangaViewHolder, int position) {
        final Manga manga = listManga.get(position);

        Glide.with(mangaViewHolder.itemView.getContext())
                .load(manga.getPoster())
                .apply(new RequestOptions().override(300, 500))
                .into(mangaViewHolder.ivPoster);

        mangaViewHolder.tvJudul.setText(manga.getJudul());
        mangaViewHolder.tvGenre.setText(manga.getGenre());
        mangaViewHolder.tvVol.setText(manga.getVolume());

        mangaViewHolder.crdManga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenDetail = new Intent(mangaViewHolder.itemView.getContext(), MangaDetailActivity.class);
                intenDetail.putExtra("judul", manga.getJudul());
                intenDetail.putExtra("genre", manga.getGenre());
                intenDetail.putExtra("pengarang", manga.getPengarang());
                intenDetail.putExtra("penerbit", manga.getPenerbit());
                intenDetail.putExtra("terbit", manga.getTglTerbit());
                intenDetail.putExtra("volume", manga.getVolume());
                intenDetail.putExtra("poster", manga.getPoster());
                intenDetail.putExtra("profil", manga.getProfil());
                intenDetail.putExtra("deskripsi", manga.getDeskripsi());
                mangaViewHolder.itemView.getContext().startActivity(intenDetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listManga.size();
    }

    public class MangaViewHolder extends RecyclerView.ViewHolder {
        CardView crdManga;
        ImageView ivPoster;
        TextView tvJudul, tvGenre, tvVol;

        public MangaViewHolder(@NonNull View itemView) {
            super(itemView);
            crdManga = itemView.findViewById(R.id.crd_manga);
            ivPoster = itemView.findViewById(R.id.iv_poster);
            tvJudul = itemView.findViewById(R.id.tv_judul);
            tvGenre = itemView.findViewById(R.id.tv_genre);
            tvVol = itemView.findViewById(R.id.tv_vol);
        }
    }
}
