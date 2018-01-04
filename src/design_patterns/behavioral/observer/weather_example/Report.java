package design_patterns.behavioral.observer.weather_example;

public class Report implements Observer{

    Subject subject;
    String type;

    public Report(Subject weather) {
        this.subject = weather;
        subject.registerObserver(this);
    }

    @Override
    public void update() {
           display(subject);
    }

    public void display(Subject subject){


        System.out.println("today Report of-->"+getType()+"\n" +
                "\ttemperature\t:\t "+((Weather) subject).getTemperature()+"F\n" +
                "\thumidity\t:\t "+((Weather) subject).getHumidity()+"%\n" +
                "\ttemperature\t:\t "+((Weather) subject).getRainfall()+" Mm\n"  );
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
