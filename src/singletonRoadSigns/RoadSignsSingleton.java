package singletonRoadSigns;

public class RoadSignsSingleton {

    // Static member holds only one instance of the
    private static RoadSignsSingleton singletonInstance;
    // Singleton prevents any other class from instantiating
    private RoadSignsSingleton() {
    }
    // Providing Global point of access
    public static RoadSignsSingleton getSingletonInstance() {
        if (null == singletonInstance) {
            singletonInstance = new RoadSignsSingleton();
        }
        return singletonInstance;
    }
    public boolean checkRoadSigns(String location){
        System.out.println("Road signs checking ...");
        return true;
    }
}
