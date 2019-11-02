import org.apache.hadoop.mapreduce.Reducer;
import org.w3c.dom.Text;

import java.util.Iterator;

public class AirportReducer extends Reducer{
    public void reduce(AirportKey key, Iterable<Text> text, Context context){
        Iterator<Text> it = text.iterator();
        String airportName = it.next().toString();
        int minTime = Integer.MAX_VALUE;
        int maxTime = Integer.MIN_VALUE;
        int count = 0;
        while (it.hasNext()) {
            String Time = it.next().toString();
            int time = Integer.parseInt(Time);
            maxTime = Math.max(time,maxTime);
            minTime = Math.min(time,minTime);
            count++;
            
        }
    }
}
