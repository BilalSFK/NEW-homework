package Q3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
    public class hmwrk {
        public static void main(String[] args) {
            String date= LocalDate.parse("2014-05-04").
                    format(DateTimeFormatter.ISO_DATE);
            System.out.println(date);
        }
    }

