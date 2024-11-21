public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0]; 
        int minutesToAdd = Integer.parseInt(args[1]);
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int totalMin = ((hours * 60) + minutes + minutesToAdd );
        int totalHours = ( totalMin / 60 );
        int newHours = ( totalHours % 24 );
        int newMin = ( totalMin - (totalHours * 60 ) );
            if ( newHours < 10 && newMin < 10 )  {
                 System.out.println( "0" + newHours + ":" + "0" + newMin );
            } 
            else if ( newHours < 10 && newMin >= 10 )  {
                 System.out.println( "0" + newHours + ":" + newMin );
            }
            else if ( newHours >= 10 && newMin >= 10 )  {
                System.out.println( newHours + ":" + newMin );
            }        
            else 
                System.out.println( + newHours + ":" +  "0" + newMin );
    
    }
}
