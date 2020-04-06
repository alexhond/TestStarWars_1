package planet;

import java.util.Arrays;


public class Planet {
  private String name;
  private String diameter;
  private String rotation_period;
  private String orbital_period;
  private String gravity;
  private String population;
  private String climate;
  private String terrain;
  private String surface_water;
  private String[] residents;
  private String[] films;
  private String url;
  private String created;
  private String edited;

  public Planet(){
  }

  public Planet(String[] residents){
    this.residents = residents;

  }


  public Planet(String name, String diameter, String rotation_period, String orbital_period, String gravity, String population, String climate, String terrain, String surface_water, String[] residents, String[] films, String url, String created, String edited) {
    this.name = name;
    this.diameter = diameter;
    this.rotation_period = rotation_period;
    this.orbital_period = orbital_period;
    this.gravity = gravity;
    this.population = population;
    this.climate = climate;
    this.terrain = terrain;
    this.surface_water = surface_water;
    this.residents = residents;
    this.films = films;
    this.url = url;
    this.created = created;
    this.edited = edited;
  }

  @Override
  public String toString() {
    return "Planet{" +
            "name='" + name + '\'' +
            ", diameter='" + diameter + '\'' +
            ", rotation_period='" + rotation_period + '\'' +
            ", orbital_period='" + orbital_period + '\'' +
            ", gravity='" + gravity + '\'' +
            ", population='" + population + '\'' +
            ", climate='" + climate + '\'' +
            ", terrain='" + terrain + '\'' +
            ", surface_water='" + surface_water + '\'' +
            ", residents=" + Arrays.toString( residents ) +
            ", films=" + Arrays.toString( films ) +
            ", url='" + url + '\'' +
            ", created='" + created + '\'' +
            ", edited='" + edited + '\'' +
            '}';
  }

  public String getName() {
    return name;
  }

  public String getDiameter() {
    return diameter;
  }

  public String getRotation_period() {
    return rotation_period;
  }

  public String getOrbital_period() {
    return orbital_period;
  }

  public String getGravity() {
    return gravity;
  }

  public String getPopulation() {
    return population;
  }

  public String getClimate() {
    return climate;
  }

  public String getTerrain() {
    return terrain;
  }

  public String getSurface_water() {
    return surface_water;
  }

  public String[] getResidents() {
    return residents;
  }

  public String[] getFilms() {
    return films;
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

  public void setName(String name) {
    this.name = name;
  }

  public void setDiameter(String diameter) {
    this.diameter = diameter;
  }

  public void setRotation_period(String rotation_period) {
    this.rotation_period = rotation_period;
  }

  public void setOrbital_period(String orbital_period) {
    this.orbital_period = orbital_period;
  }

  public void setGravity(String gravity) {
    this.gravity = gravity;
  }

  public void setPopulation(String population) {
    this.population = population;
  }

  public void setClimate(String climate) {
    this.climate = climate;
  }

  public void setTerrain(String terrain) {
    this.terrain = terrain;
  }

  public void setSurface_water(String surface_water) {
    this.surface_water = surface_water;
  }

  public void setResidents(String[] residents) {
    this.residents = residents;
  }

  public void setFilms(String[] films) {
    this.films = films;
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
}
