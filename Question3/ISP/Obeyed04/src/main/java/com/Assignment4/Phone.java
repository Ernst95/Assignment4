package com.Assignment4;

/**
 * Created by Ernst on 2017/03/30.
 */
public class Phone implements CallInterface, PhotoInterface, MusicInterface, TextInterface{

    private CallInterface call;
    private PhotoInterface photo;
    private MusicInterface music;
    private TextInterface text;

    public Phone(CallInterface call, PhotoInterface photo, MusicInterface music, TextInterface text)
    {
        this.call = call;
        this.photo = photo;
        this.music = music;
        this.text = text;
    }
    public String call() {
        return call.call();
    }

    public String takePhoto() {
        return photo.takePhoto();
    }

    public String play() {
        return music.play();
    }

    public String textMessage() {
        return text.textMessage();
    }
}
