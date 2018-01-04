package design_patterns.behavioral.observer.weather_example;

import com.sun.org.apache.regexp.internal.RE;

public class WeatherReportImplementation {

    public static void main(String[] args) {
        Weather weather=new Weather();

        Report report_tv=new Report(weather);
        report_tv.setType("TV");

        Report report_newspaper=new Report(weather);
        report_newspaper.setType("NEWS PAPER");

        weather.measurementChange(11,88,33);

        weather.measurementChange(22,99,22);



    }

}
