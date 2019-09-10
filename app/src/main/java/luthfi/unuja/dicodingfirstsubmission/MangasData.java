package luthfi.unuja.dicodingfirstsubmission;

import java.util.ArrayList;

public class MangasData {
    public static String[][] dataManga = new String[][]{
            //judul,genre,pengarang,penerbit,terbit,volume,poster,profil
            {"One Piece", "Petualangan, fantasi", "Eiichiro Oda", "Shueisha", "22 Juli 1997", "91",
                    "https://upload.wikimedia.org/wikipedia/id/9/90/One_Piece%2C_Volume_61_Cover_%28Japanese%29.jpg",
                    "https://academy-of-fine-art.com/wp-content/uploads/2019/07/1-4.jpg",
                    "One Piece (bahasa Jepang: ワンピース Hepburn: Wan Pīsu) adalah sebuah seri manga Jepang yang ditulis dan diilustrasikan oleh Eiichiro Oda. Manga ini telah dimuat di majalah Weekly Shōnen Jump milik Shueisha sejak tanggal 22 Juli 1997, dan telah dibundel menjadi 91 volume tankōbon."},
            {"Naruto", "Aksi, Petualangan, Fantasi", "Masashi Kishimoto", "Shueisha", "21 September 1999", "72",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/9/94/NarutoCoverTankobon1.jpg/220px-NarutoCoverTankobon1.jpg",
                    "https://cdn.myanimelist.net/images/voiceactors/2/42365.jpg",
                    "Naruto (ナルト) adalah sebuah serial manga karya Masashi Kishimoto yang diadaptasi menjadi serial anime. Manga Naruto bercerita seputar kehidupan tokoh utamanya, Naruto Uzumaki, seorang ninja yang hiperaktif, periang, dan ambisius yang ingin mewujudkan keinginannya untuk mendapatkan gelar Hokage, pemimpin dan ninja terkuat di desanya."},
            {"Boruto: Naruto Next Generations", "Petualangan, fantasi", "Ukyō Kodachi", "Shueisha", "9 Mei 2016", "8",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/d/db/Boruto_manga_vol_1.jpg/220px-Boruto_manga_vol_1.jpg",
                    "https://vignette.wikia.nocookie.net/naruto/images/4/47/Uky%C5%8D_Kodachi.png/revision/latest?cb=20160809125305&path-prefix=pt-br",
                    "Boruto: Naruto Next Generations (bahasa Jepang: BORUTO-ボルト- -NARUTO NEXT GENERATIONS- Hepburn: Boruto: Naruto Nekusuto Jenerēshonzu), juga dikenal sebagai Boruto, adalah sebuah seri manga shōnen Jepang yang ditulis oleh Ukyō Kodachi dan diilustrasikan oleh Mikio Ikemoto. Manga ini dimuat dalam majalah manga Weekly Shōnen Jump terbitan Shueisha sebelum dipindahkan ke majalah lain milik Shueisha berjudul V Jump pada tahun 2019."},
            {"Astro Boy", "Aksi, Petualangan, Fiksi Ilmiah", "Osamu Tezuka", "Kobunsha / Kodansha", "April 1952", "23",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/5/54/AstroBoyVolume1.jpg/220px-AstroBoyVolume1.jpg",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/7/7c/Osamu_Tezuka.jpg/220px-Osamu_Tezuka.jpg",
                    "Astro Boy (鉄腕アトム Tetsuwan Atomu; juga dikenal dengan nama Atom Boy) adalah seri manga karya Ozamu Tezuka di Weekly Shonen Magazine pada tahun 1952 hingga 1968, sedangkan anime-nya diputar pada tahun 1963-1966. Di Indonesia, manga-nya pernah diterbitkan dengan judul Atom Boy."},
            {"Detektif Conan", "Misteri, cerita seru", "Gosho Aoyama", "Shogakukan", "19 Januari 1994", "96",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/3/36/Detective_Conan_Vol_1.jpg/220px-Detective_Conan_Vol_1.jpg",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Gosho_Aoyama.jpg/220px-Gosho_Aoyama.jpg",
                    "Meitantei Konan (bahasa Jepang: 名探偵コナン), yang juga dikenal sebagai Case Closed atau Detective Conan, dan telah diterbitkan di Indonesia dengan judul Detektif Conan, adalah sebuah seri manga shōnen Jepang bertema detektif yang ditulis dan diilustrasikan oleh Gosho Aoyama. Alur ceritanya mengisahkan tentang seorang detektif amatir yang tubuhnya menyusut menjadi kecil saat sedang menyelidiki sebuah organisasi misterius. Dia kemudian memecahkan banyak kasus sambil meniru ayah temannya dan karakter lainnya."},
            {"Inuyasha (犬夜叉)", "Petualangan, Fantasi, Romantis", "Rumiko Takahashi", "Shogakukan", "13 November 1996", "56",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/2/2a/InuYasha1.jpg/220px-InuYasha1.jpg",
                    "http://www.asahicom.jp/ajw/articles/images/AS20190125002965_comm.jpg",
                    "Inuyasha (犬夜叉), juga dikenal sebagai Inuyasha: A Feudal Fairy Tale Isekai (bahasa Jepang: 戦国御伽草子 犬夜叉 Hepburn: Sengoku Otogizōshi Inuyasha), adalah sebuah seri manga Jepang yang ditulis dan diilustrasikan oleh Rumiko Takahashi. Manga ini mulai dimuat dalam majalah Weekly Shōnen Sunday sejak tanggal 13 November 1996 dan berakhir pada tanggal 18 Juni 2008. Bab-bab tunggalnya telah dibundel menjadi 56 volume tankōbon oleh Shogakukan."},
            {"Samurai X", "Chanbara", "Nobuhiro Watsuki", "Shueisha", "2 September 1994", "28",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/0/04/Kenshin_samurai_x.jpg/220px-Kenshin_samurai_x.jpg",
                    "https://lh3.googleusercontent.com/89yeQoMTWgsXOCUJCwucVgob-Hque5mTfu0HyTvDXymQjb517olJZ0Dra__HthMq9fopSpURuI73ZeAVPpX75TYiDdqOEqPTgw=w1600-rj",
                    "Samurai X memiliki judul asli Rurouni Kenshin (るろうに剣心) adalah manga dan anime karya Nobuhiro Watsuki yang berlatar belakang awal dari era Meiji di Jepang. Manga ini terbit di majalah mingguan Shonen Jump dan telah dibukukan menjadi 28 seri buku. Di Indonesia manga ini diterbitkan oleh Elex Media Komputindo pada tahun 2002 dengan judul Samurai X."},
            {"Blade of the Immortal", "Petualangan, Fight", "Hiroaki Samura", "Kodansha", "25 Juni 1993", "30",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/d/dd/Blade_of_the_Immortal_01.jpg/220px-Blade_of_the_Immortal_01.jpg",
                    "https://cdn.myanimelist.net/images/voiceactors/1/38489.jpg",
                    "Blade of the Immortal (Bahasa Jepang : 無限 の 住 人Hepburn : Mugen no Jūnin , lit. \" The Inhabitant of Infinity \") adalah seri manga epangoleh Hiroaki Samura . Serial ini dibuat di Jepang selama periode Shogun Tokugawa pertengahan dan mengikuti samurai terkutuk Manji , yang harus membunuh 1000 orang jahat untuk mendapatkan kembali kefanaannya."},
            {"Yu-Gi-Oh!", "Petualangan, Fantasi, Fiksi Fantasi", "Kazuki Takahashi", "Shueisha", "30 September 1996", "38",
                    "https://upload.wikimedia.org/wikipedia/en/thumb/f/f9/Yu-Gi-Oh%21_vol_01.jpg/220px-Yu-Gi-Oh%21_vol_01.jpg",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Kazuki_takahashi.jpg/220px-Kazuki_takahashi.jpg",
                    "Yu-Gi-Oh! (遊☆戯☆王 Yū☆gi☆ō, Bahasa Indonesia: \"Raja Permainan\") adalah sebuah manga karya Kazuki Takahashi sejak tahun 1996, yang mengisahkan tentang petualangan seorang anak laki-laki yang jago dalam permainan video. Yugi Mutou, demikianlah nama anak laki-laki yang tak punya teman ini, pada suatu hari ia diberi hadiah oleh kakeknya sebuah kotak yang berisi kepingan-kepingan puzzle antik, konon disebut sebagai Millenium Puzzle. Setelah bertahun-tahun (versi manga: 8 tahun), kemudian Yugi berhasil menyusunnya dan roh yang berada di dalamnya berhasil keluar dan merasuki tubuh Yugi dan menjadi semacam kepribadian yang lain, yaitu: Yugi Kegelapan (Yami Yugi)."},
            {"One-Punch Man", "Aksi, Komedi, Superhero, Fiksi", "One", "Shueisha", "2009", "14",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/c/c3/OnePunchMan_manga_cover.png/220px-OnePunchMan_manga_cover.png",
                    "http://forum-animeindo.com/wp-content/uploads/2015/12/murata.png",
                    "One Punch Man ( ワンパンマン Wanpanman) adalah sebuah serial manga Jepang yang menceritakan seorang superhero yang bernama Saitama. One-Punch Man dibuat oleh seorang penulis yang asal jepang dengan nama samaran ONE yang mulai diterbitkan pada awal tahun 2009. Serial ini segera menjadi viral sehingga mampu melampaui 7,9 juta hits pada bulan Juni 2012. One-Punch Man merupakan kontraksi wanpanchi (\"One-Punch \") yang artinya satu pukulan."}
    };

    public static ArrayList<Manga> getListData() {
        ArrayList<Manga> list = new ArrayList<>();
        for (String[] mData : dataManga) {
            Manga manga = new Manga();
            manga.setJudul(mData[0]);
            manga.setGenre(mData[1]);
            manga.setPengarang(mData[2]);
            manga.setPenerbit(mData[3]);
            manga.setTglTerbit(mData[4]);
            manga.setVolume(mData[5]);
            manga.setPoster(mData[6]);
            manga.setProfil(mData[7]);
            manga.setDeskripsi(mData[8]);

            list.add(manga);
        }

        return list;
    }
}
