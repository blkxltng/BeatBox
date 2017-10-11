package com.blkxltng.beatbox;

import android.databinding.BaseObservable;

/**
 * Created by firej on 10/11/2017.
 */

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }

    public String getTitle() {
        return mSound.getName();
    }
}
