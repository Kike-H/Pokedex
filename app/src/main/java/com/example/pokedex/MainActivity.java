package com.example.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    MediaPlayer media_player;
    int pokemon = 0;
    int evolution = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.img);

        media_player = MediaPlayer.create(this, R.raw.defalut);

    }

    @Override
    protected void onPause() {
        super.onPause();
        if(media_player.isPlaying()) {
            media_player.pause();
        }
    }


    public void makeSound(View view) {
        if (media_player.isPlaying()) {
            media_player.stop();
        }
        media_player.start();
    }

    public void stopSound(View view) {
        if (media_player.isPlaying()) {
            media_player.pause();
        }
    }

    public void plusPokemon(View view) {
        evolution = 0;
        if(pokemon == 3) {
            pokemon = 0;
        }
        else {
            pokemon++;
        }
        changePokemon();
    }

    public void minusPokemon(View view) {
        evolution = 0;
        if(pokemon == 0) {
            pokemon = 3;
        }
        else {
            pokemon--;
        }
        changePokemon();
    }

    public void plusEvolution(View view) {
        if(evolution == 3) {
            evolution = 0;
        }
        else {
            evolution++;
        }
        changePokemon();
    }

    public void minusEvolution(View view) {
        if(evolution == 0) {
            evolution = 3;
        }
        else {
            evolution--;
        }
        changePokemon();
    }

    public void changePokemon() {

        if(media_player.isPlaying()) {
            media_player.stop();
        }

        if(pokemon == 0) {
            if(evolution == 0) {
                image.setImageResource(R.drawable.charmander);
                media_player = MediaPlayer.create(this, R.raw.charmander);
            }
            else if(evolution == 1) {
                image.setImageResource(R.drawable.charmeleon);
                media_player = MediaPlayer.create(this, R.raw.charmeleon);
            }
            else if(evolution == 2) {
                image.setImageResource(R.drawable.charizard);
                media_player = MediaPlayer.create(this, R.raw.charizard);
            }
        }
        else if(pokemon == 1) {
            if(evolution == 0) {
                image.setImageResource(R.drawable.squirtle);
                media_player = MediaPlayer.create(this, R.raw.squirtle);
            }
            else if(evolution == 1) {
                image.setImageResource(R.drawable.wartortle);
                media_player = MediaPlayer.create(this, R.raw.wartortle);
            }
            else if(evolution == 2) {
                image.setImageResource(R.drawable.blastoise);
                media_player = MediaPlayer.create(this, R.raw.blastoise);
            }
        }
        else if(pokemon == 2) {
            if(evolution == 0) {
                image.setImageResource(R.drawable.bulbasaur);
                media_player = MediaPlayer.create(this, R.raw.bulbasaur);
            }
            else if(evolution == 1) {
                image.setImageResource(R.drawable.ivysaur);
                media_player = MediaPlayer.create(this, R.raw.ivysaur);
            }
            else if(evolution == 2) {
                image.setImageResource(R.drawable.venusaur);
                media_player = MediaPlayer.create(this, R.raw.venusaur);
            }
        }
        else if(pokemon == 3) {
            if(evolution == 0) {
                image.setImageResource(R.drawable.pichu);
                media_player = MediaPlayer.create(this, R.raw.pichu);
            }
            else if(evolution == 1) {
                image.setImageResource(R.drawable.pikachu);
                media_player = MediaPlayer.create(this, R.raw.pikachu);
            }
            else if(evolution == 2) {
                image.setImageResource(R.drawable.raichu);
                media_player = MediaPlayer.create(this, R.raw.raichu);
            }
        }
    }
}