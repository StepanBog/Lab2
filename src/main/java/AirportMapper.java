import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.map.WrappedMapper;


public class AirportMapper  extends Mapper<IntWritable, Text,AirportKey,Text> {
    protected void map(IntWritable key, Text value, Context context){

        
        context.write();
    }

}
