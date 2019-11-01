import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportKey  implements WritableComparable<AirportKey> {
    private IntWritable number;
    private Text airportValue;

    public AirportKey(String value, int number){
        airportValue = new Text(value);
        this.number = new IntWritable(number);
    }

    public int compareTo(AirportKey airportKey) {
        if (airportKey.airportValue.compareTo(this.airportValue) == 0)
            return airportKey.number.compareTo(this.number);
        else
            return airportKey.airportValue.compareTo(this.airportValue);
    }

    public void write(DataOutput dataOutput) throws IOException {
        airportValue.write(dataOutput);
        number.write(dataOutput);
    }

    public void readFields(DataInput dataInput) throws IOException {
        airportValue.readFields(dataInput);
        number.readFields(dataInput);
    }
    public Text getAirportValue(){
        return airportValue;
    }

}
