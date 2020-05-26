
package indiomasistema;


import java.util.Locale;

public class IndiomaSistema {
    public static void main(String[] args){
    Locale loc = Locale.getDefault();
    
    System.out.println(loc.getDisplayLanguage());
    
    System.out.println(loc.getLanguage());   
}
}
