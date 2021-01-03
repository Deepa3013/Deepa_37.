package mylogger;
import java.io.*;
import java.util.logging.*;
public class Mylogger
{
    public static void main(String[] args)
    {
        Logger l=Logger.getLogger(Mylogger.class.getName());
        try
        {
            FileHandler fh=new FileHandler();//("c:/mylogfile.log",true);
            l.addHandler(fh);
            l.setLevel(Level.ALL);
            SimpleFormatter sf=new SimpleFormatter();
            fh.setFormatter(sf);
            l.info("My first log");
        }
        catch(SecurityException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        l.info("Hi How r u?");
    }
}
