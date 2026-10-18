package com.example.batteriaelettronica;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private final int NR_OF_SIMULTANEOUS_SOUNDS = 12;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private SoundPool mSoundPool;

    private int mKickSoundId;
    private int mSnareSoundId;
    private int mChhSoundId;
    private int mOhhSoundId;
    private int mCrashSoundId;
    private int mRideSoundId;
    private int mTomHSoundId;
    private int mTomMSoundId;
    private int mTomLSoundId;
    private int mRimSoundId;
    private int mClapSoundId;
    private int mCowSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                        .setUsage(AudioAttributes.USAGE_GAME)
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .build();

        mSoundPool = new SoundPool.Builder()
                .setMaxStreams(NR_OF_SIMULTANEOUS_SOUNDS)
                .setAudioAttributes(audioAttributes)
                .build();

        mKickSoundId = mSoundPool.load(getApplicationContext(), R.raw.kick, 1);
        mSnareSoundId = mSoundPool.load(getApplicationContext(), R.raw.snare, 1);
        mChhSoundId = mSoundPool.load(getApplicationContext(), R.raw.chh, 1);
        mOhhSoundId = mSoundPool.load(getApplicationContext(), R.raw.ohh, 1);
        mCrashSoundId = mSoundPool.load(getApplicationContext(), R.raw.crash, 1);
        mRideSoundId = mSoundPool.load(getApplicationContext(), R.raw.ride, 1);
        mTomHSoundId = mSoundPool.load(getApplicationContext(), R.raw.tomh, 1);
        mTomMSoundId = mSoundPool.load(getApplicationContext(), R.raw.tomm, 1);
        mTomLSoundId = mSoundPool.load(getApplicationContext(), R.raw.toml, 1);
        mRimSoundId = mSoundPool.load(getApplicationContext(), R.raw.rim, 1);
        mClapSoundId = mSoundPool.load(getApplicationContext(), R.raw.clap, 1);
        mCowSoundId = mSoundPool.load(getApplicationContext(), R.raw.cow, 1);
    }


    public void PlayKick(View view) {
        mSoundPool.play(mKickSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlaySnare(View view) {
        mSoundPool.play(mSnareSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayChh(View view) {
        mSoundPool.play(mChhSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayOhh(View view) {
        mSoundPool.play(mOhhSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayCrash(View view) {
        mSoundPool.play(mCrashSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayRide(View view) {
        mSoundPool.play(mRideSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayTomH(View view) {
        mSoundPool.play(mTomHSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayTomM(View view) {
        mSoundPool.play(mTomMSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayTomL(View view) {
        mSoundPool.play(mTomLSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayRim(View view) {
        mSoundPool.play(mRimSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayClap(View view) {
        mSoundPool.play(mClapSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayCow(View view) {
        mSoundPool.play(mCowSoundId, LEFT_VOLUME, RIGHT_VOLUME,
                PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mSoundPool != null) {
            mSoundPool.release();
            mSoundPool = null;
        }
    }
}