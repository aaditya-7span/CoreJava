package java8.date_and_time;

import java.time.*;

public class Demo {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        int dd= localDate.getDayOfMonth();
        int yy= localDate.getYear();
        int mm= localDate.getMonthValue();

        System.out.println(dd+" "+mm+" "+yy);

        int hr=localTime.getHour();
        int min=localTime.getMinute();
        int sec=localTime.getSecond();
        int ns=localTime.getNano();

        System.out.println(hr+" "+min+" "+sec+" "+ns);

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println( localDateTime.getDayOfMonth());


        LocalDateTime localDateTime1=LocalDateTime.of(2004,1,30,12,40);
        LocalDateTime  localDateTime2=  localDateTime1.plusDays(100);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);


        LocalDate localDate1=LocalDate.of(2004,10,30);
        Period period=Period.between(localDate1,localDate);
        System.out.println(period);

        Year y=Year.of(2020);
        System.out.println(y.isLeap());

        ZoneId zoneId=ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId zoneId1=ZoneId.of("America/Los_Angeles");
        System.out.println(zoneId1.getRules());

        ZonedDateTime zonedDateTime=ZonedDateTime.now(zoneId1);
        System.out.println(zonedDateTime);
    }

}
