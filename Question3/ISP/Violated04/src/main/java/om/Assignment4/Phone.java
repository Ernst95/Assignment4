package om.Assignment4;

/**
 * Created by Ernst on 2017/03/30.
 */
public class Phone implements PhoneServices {

    public String call() {
        return "calling...";
    }

    public String takePhoto() {
        return "taking photo...";
    }

    public String playMusic() {
        return "playing music...";
    }

    public String textMessage() {
        return "texting message...";
    }

}
