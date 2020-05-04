package lab2;
public class Cd extends MediaItem 
{
    String Director;
    String artist;
    String genre;
    int yearOfRelease;
    public Cd(){}
	public Cd(String director, String artist, String genre, int yearOfRelease) {
		super();
		Director = director;
		this.artist = artist;
		this.genre = genre;
		this.yearOfRelease = yearOfRelease;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
    
}
