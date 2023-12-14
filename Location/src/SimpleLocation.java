
public class SimpleLocation {
	public double latitude;
	 public double longitude;
	 public String unit;
	

	 public SimpleLocation(double lat, double lon,String unit)
	 {
	 this.unit=unit;
	 this.latitude = lat;
	 this.longitude = lon;
	 }
	 
	 public double distance(SimpleLocation other) {
		 return getDist(this.latitude, this.longitude,
				 other.latitude, other.longitude,unit);
				}

	private double getDist(double latitude2, double longitude2, double latitude3, double longitude3,String unit) {
		// TODO Auto-generated method stub
		double distance =0;
		if ((latitude2 == latitude3) && (longitude2 == longitude3)) {
			return 0;
		}
		else {
			double theta = longitude2 - longitude3;
			double dist = Math.sin(Math.toRadians(latitude2)) * Math.sin(Math.toRadians(latitude3)) + Math.cos(Math.toRadians(latitude3)) * Math.cos(Math.toRadians(latitude2)) * Math.cos(Math.toRadians(theta));
			dist = Math.acos(dist);
			dist = Math.toDegrees(dist);
			dist = dist * 60 * 1.1515;
			if (unit.equals("K")) {
				dist = dist * 1.609344;
			} else if (unit.equals("N")) {
				dist = dist * 0.8684;
			}
			return (dist);
		}
	}
}
