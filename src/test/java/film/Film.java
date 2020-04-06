package film;

import planet.Planet;

import java.util.Arrays;
import java.util.Date;


public class Film extends Planet {
  private String title;
  private Integer episode_id;
  private String opening_crawl;
  private String director;
  private String producer;
  private Date date;
  private String[] species;
  private String[] starships;
  private String[] vehicles;
  private String[] characters;
  private String[] planets;
  private String url;
  private String created;
  private String edited;

  public Film(){}

  public Film(String[] planets){
    this.planets = planets;

  }

  public Film(String title, Integer episode_id, String opening_crawl, String director, String producer, Date date, String[] species, String[] starships, String[] vehicles, String[] characters, String[] planets, String url, String created, String edited) {
    this.title = title;
    this.episode_id = episode_id;
    this.opening_crawl = opening_crawl;
    this.director = director;
    this.producer = producer;
    this.date = date;
    this.species = species;
    this.starships = starships;
    this.vehicles = vehicles;
    this.characters = characters;
    this.planets = planets;
    this.url = url;
    this.created = created;
    this.edited = edited;
  }

  public String getTitle() {
    return title;
  }

  public Integer getEpisode_id() {
    return episode_id;
  }

  public String getOpening_crawl() {
    return opening_crawl;
  }

  public String getDirector() {
    return director;
  }

  public String getProducer() {
    return producer;
  }

  public Date getDate() {
    return date;
  }

  public String[] getSpecies() {
    return species;
  }

  public String[] getStarships() {
    return starships;
  }

  public String[] getVehicles() {
    return vehicles;
  }

  public String[] getCharacters() {
    return characters;
  }

  public String[] getPlanets() {
    return planets;
  }

  public String getUrl() {
    return url;
  }

  public String getCreated() {
    return created;
  }

  public String getEdited() {
    return edited;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setEpisode_id(Integer episode_id) {
    this.episode_id = episode_id;
  }

  public void setOpening_crawl(String opening_crawl) {
    this.opening_crawl = opening_crawl;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setSpecies(String[] species) {
    this.species = species;
  }

  public void setStarships(String[] starships) {
    this.starships = starships;
  }

  public void setVehicles(String[] vehicles) {
    this.vehicles = vehicles;
  }

  public void setCharacters(String[] characters) {
    this.characters = characters;
  }

  public void setPlanets(String[] planets) {
    this.planets = planets;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public void setEdited(String edited) {
    this.edited = edited;
  }

  @Override
  public String toString() {
    return "Film{" +
            "title='" + title + '\'' +
            ", episode_id=" + episode_id +
            ", opening_crawl='" + opening_crawl + '\'' +
            ", director='" + director + '\'' +
            ", producer='" + producer + '\'' +
            ", date=" + date +
            ", species=" + Arrays.toString( species ) +
            ", starships=" + Arrays.toString( starships ) +
            ", vehicles=" + Arrays.toString( vehicles ) +
            ", characters=" + Arrays.toString( characters ) +
            ", planets=" + Arrays.toString( planets ) +
            ", url='" + url + '\'' +
            ", created='" + created + '\'' +
            ", edited='" + edited + '\'' +
            '}';
  }
}
