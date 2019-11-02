import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.map.WrappedMapper;

import java.io.IOException;


public class AirportMapper  extends Mapper<IntWritable, Text,AirportKey,Text> {
    protected void map(IntWritable key, Text value, Context context) throws IOException, InterruptedException{
        String[] words = value.toString().splt(",[\"]");
        String airportID = words[0].replace("\"","");
        String airportName = words[1].replace("\"","");
        context.write(new AirportKey(airportID,0), new  Text(airportName));

    }

}
