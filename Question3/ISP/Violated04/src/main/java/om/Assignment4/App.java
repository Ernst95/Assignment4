package om.Assignment4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Phone phone = new Phone();

        System.out.println( phone.call() );
        System.out.println( phone.textMessage() );
        System.out.println( phone.playMusic() );
        System.out.println( phone.takePhoto());
    }
}
