public class Jets {
    public String jetType;
    public String jetName;
    public int seatEconomy;
    public int seatFirstclass;
    
    public static void printAirplaneInfo(String jetType, String jetName){
        System.out.println("Aircraft type:" + jetType + ", "+"model:" + jetName + ".");
    }

    public static void printAirplaneInfo(String jetType, String jetName, int seatEconomy ){
        System.out.println("Aircraft type:" + jetType + ", "+"model: " + jetName + ", " +"number of economy class passengers: " + seatEconomy);
    }

    public static void printAirplaneInfo(String jetType, String jetName, int seatEconomy, int seatFirstclass ){
        System.out.println("Aircraft type:" + jetType + ", "+"model: " + jetName + ", " +"number of economy class passengers: " + seatEconomy + "," + "number of first class passengers: " + seatFirstclass);
    }
}