package GaerPrincipal;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

    class ValidaData {
       
public static boolean dataValida(String strDate) {
    String dateFormat = "dd/MM/uuuu";

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter
    .ofPattern(dateFormat)
    .withResolverStyle(ResolverStyle.STRICT);
    try {
        LocalDate date = LocalDate.parse(strDate, dateTimeFormatter);
        return true;
    } catch (DateTimeParseException e) {
       return false;
            } 
        }
}
