package com.Assignment4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CallInterface call = new Call();
        PhotoInterface photo = new Photo();
        MusicInterface music = new Music();
        TextInterface text = new Text();

        System.out.println(call.call());
        System.out.println( photo.takePhoto());
        System.out.println(music.play());
        System.out.println(text.textMessage());

    }
}
