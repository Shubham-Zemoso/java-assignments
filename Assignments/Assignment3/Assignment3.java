package JavaAssignments.Assignment3;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Command {
    static void commands(ArrayList<String> commandList)
            throws Exception
    {
        ProcessBuilder build = new ProcessBuilder(commandList);
        Process process = build.start();

        // to read the output
        BufferedReader input = new BufferedReader(new InputStreamReader
                (process.getInputStream()));
        BufferedReader Error = new BufferedReader(new InputStreamReader
                (process.getErrorStream()));
        String s = null;
        List<Double> timeList = new ArrayList<>();
        while((s = input.readLine()) != null)
        {
            double time;
            int index=s.indexOf("time=");

            if(index!=-1) {
                time=Double.parseDouble(s.substring(index + 5,s.length() - 10));
                System.out.println(time + "ms");
                timeList.add(time);
            }

        }
        System.out.println("error (if any): ");
        while((s = Error.readLine()) != null)
        {
            System.out.println(s);
        }

        Median.getMedian(timeList);
    }
}

class Median {
    static void getMedian(List<Double> timeList) {
        double median;

        Collections.sort(timeList);
        int n = timeList.size();
        if(n%2==0)
        {
            median = (timeList.get(n/2) + timeList.get((n/2)-1))/2.0;
        }
        else
        {
            median = timeList.get(n/2);
        }

        System.out.println("Median is " + median + "ms");
    }
}


public class Assignment3
{
    public static void main(String args[]) throws Exception
    {
        // creating list for commands
        ArrayList<String> commandList = new ArrayList<String>();

        commandList.add("ping");
        // can be replaced by IP
        commandList.add("www.google.com");

        Command.commands(commandList);
    }
}

