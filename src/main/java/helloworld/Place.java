package helloworld;
import java.net.URL;
public class Place {
    String name = null;
    double distance;
    String address = null;
    URL icon = null;
    double lat;
    double lng;
    String placeId = null;
    public Place() {
    }
    public Place(String name,double distance, String address, URL icon, double lat, double lng, String placeId) {
        this.name = name;
        this.distance = distance;
        this.address = address;
        this.icon = icon;
        this.lat = lat;
        this.lng = lng;
        this.placeId = placeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public URL getIcon() {
        return icon;
    }
    public void setIcon(URL icon) {
        this.icon = icon;
    }
    public double getLat() {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }
    public double getLng() {
        return lng;
    }
    public void setLng(double lng) {
        this.lng = lng;
    }
    public String getPlaceId() {
        return placeId;
    }
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }
    @Override
    public String toString() {
        return "Place [name="+name+", distance="+distance+", address="+address+", icon="+icon+", latitude="+lat+
                ", longitude"+lng+", placeID"+placeId+"]";
    }
}