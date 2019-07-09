package by.anelkin.model;

import lombok.Data;
import lombok.NonNull;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Random;

@Data
@XmlRootElement(name = "weather")
public class WeatherInfo {
    @NonNull
    private String cityName;

    private double currTemp;
    private double windSpeed;

    public WeatherInfo() {
    }

    public WeatherInfo(@NonNull String cityName) {
        this.cityName = cityName;
        init();
    }

    private void init() {
        Random random = new Random();
        this.currTemp = random.nextInt(40) - 20;
        this.windSpeed = random.nextInt(40) - 20;
    }
}
