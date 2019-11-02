import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AirportComparator extends WritableComparator {
    public int compare(WritableComparable a,WritableComparable b){
        AirportKey A = (AirportKey) a;
        AirportKey B = (AirportKey) b;
        return A.getAirportValue().compareTo(B.getAirportValue());

    }
}
