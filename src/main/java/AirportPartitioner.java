import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportPartitioner extends Partitioner<AirportKey, Text> {
    public int getPartition(AirportKey key, Text value, int numReduceTask ){
        return (key.getAirportValue().hashCode() & Integer.MAX_VALUE) % numReduceTask;
    }

}
