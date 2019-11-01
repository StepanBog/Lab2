import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.map.WrappedMapper;

import java.io.IOException;


public class FlightMapper  extends Mapper<IntWritable, Text,AirportKey,Text> {
    protected void map(IntWritable key, Text value, Context context) throws IOException, InterruptedException{
        String[] words = value.toString().split(",");
        context.write(new AirportKey(words[14].replace("\"",""),1), new  Text(words[18]).);
    }

}
