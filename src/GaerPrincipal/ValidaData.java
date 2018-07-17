package GaerPrincipal;

import java.text.ParseException;
import java.text.SimpleDateFormat;



    class ValidaData {
        
        public boolean data(String data){
         try {
             
             SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             sdf.setLenient(false);
             sdf.parse(data);
             return true;
             
         } catch (ParseException ex) {
             return false;
                }
               
            }
       }
    
    
    
