import film.Film;
import io.qameta.allure.Feature;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import planet.Planet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppTest {
  @Test
  @Feature("Select the planet Tatooine, a method that describes the planet https://swapi.co/api/planets/1/")
  public void test1() {
    CloseableHttpClient httpClient = HttpClients.custom()
            .setSSLHostnameVerifier( new NoopHostnameVerifier() )
            .build();
    HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
    requestFactory.setHttpClient( httpClient );
    RestTemplate restTemplate = new RestTemplate( requestFactory );
    Planet planet;
    planet = restTemplate.getForObject( "https://swapi.co/api/planets/1/", Planet.class );

    assert planet != null;
    List<String> a = Arrays.asList( planet.getFilms() );
    assertTrue( a.contains( "https://swapi.co/api/films/4/" ) );
  }

  @Test
  @Feature("Check if there are any actions on the planet Tatooine in the 4 episode of the film")
  public void test2() {
    CloseableHttpClient httpClient = HttpClients.custom()
            .setSSLHostnameVerifier( new NoopHostnameVerifier() )
            .build();
    HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
    requestFactory.setHttpClient( httpClient );
    RestTemplate restTemplate = new RestTemplate( requestFactory );
    Film film = restTemplate.getForObject( "https://swapi.co/api/films/4/", Film.class );
    assert film != null;
    assertTrue( film.getOpening_crawl().contains( "Tatooine" ) );
  }

  @Test
  @Feature("From the 4 series, select all the planets where the action takes place in the film and compare with the array Planets{ Naboo, Coruscant, Tatooine, Endor}")
  public void test3() {
    CloseableHttpClient httpClient = HttpClients.custom()
            .setSSLHostnameVerifier( new NoopHostnameVerifier() )
            .build();
    HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
    requestFactory.setHttpClient( httpClient );
    RestTemplate restTemplate = new RestTemplate( requestFactory );
    Film film = restTemplate.getForObject( "https://swapi.co/api/films/4", Film.class );
    assert film != null;
    List<String> a = Arrays.asList( film.getPlanets() );
    List<String> b = new ArrayList<String>();
    b.addAll( a );
    List<String> mass = new ArrayList<String>();
    for (int i = 0; i < b.size(); i++) {
      Planet film1 = restTemplate.getForObject( b.get( i ), Film.class );
      assert film1 != null;
      mass.add( film1.getName() );
    }
    List<String> outMass = Arrays.asList( "Naboo", "Coruscant", "Tatooine", "Endor" );
    Collections.sort( mass );
    Collections.sort( outMass );

    assertEquals( mass, outMass );
  }

  @Test
  @Feature("Check residents on the planet Naboo, 11 residents reference")
  public void test4() {
    CloseableHttpClient httpClient = HttpClients.custom()
            .setSSLHostnameVerifier( new NoopHostnameVerifier() )
            .build();
    HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
    requestFactory.setHttpClient( httpClient );
    RestTemplate restTemplate = new RestTemplate( requestFactory );
    Planet planet = restTemplate.getForObject( "https://swapi.co/api/planets/8/", Planet.class );
    assert planet != null;
    List<String> res = Arrays.asList( planet.getResidents() );
    int count = res.size();
    Assert.assertEquals( count, 11 );
  }
}