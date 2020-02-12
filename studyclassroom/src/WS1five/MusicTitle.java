package WS1five;

/**
 * @author zyn
 * @description The class implements WS1five.MusicTitleInterface and is used to represent music titles in form of a title, an
 *              artist, and a price, of types String, String, and int.
 * @date 2019-11-17
 */
public class MusicTitle implements MusicTitleInterface {
    //title of music
    private String title;
    //artist of music
    private String artist;
    //price of music
    private int price;

    /*
     * @param String title
     * @param String artist
   	 * @param int price
     * @description: constructor for WS1five.MusicTitle
     */
    public MusicTitle(String title, String artist, int price) {
        this.title = title;
        this.artist = artist;
        this.price = price;

    }

    /**
     *  getter for the title
     *  @return The title of the music title.
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     *  getter for the artist
     *  @return The artist of the music title.
     */
    @Override
    public String getArtist() {
        return artist;
    }

    /**
     *  getter for the price
     *  @return The price of the music title.
     */
    @Override
    public int getPrice() {
        return price;
    }
}
