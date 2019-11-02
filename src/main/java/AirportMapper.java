import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.map.WrappedMapper;

import java.io.IOException;


public class AirportMapper  extends Mapper<IntWritable, Text,AirportKey,Text> {
    protected void map(IntWritable key, Text value, Context context) throws IOException, InterruptedException{
        String[] words = value.toString().split(",[\"]");
        String airportValue = words[0].replace("\"","");
        String a
        context.write(new AirportKey(words[0].replace("\"",""),0), new  Text(words[1].replace("\"","")));
    }

}
