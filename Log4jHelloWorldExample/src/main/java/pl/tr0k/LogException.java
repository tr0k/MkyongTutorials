package pl.tr0k;

import org.apache.log4j.Logger;

import java.util.Random;

/**
 * Created by tr0k on 2014-07-10.
 */
public class LogException {

    final static Logger log = Logger.getLogger(LogException.class);

    public static void main(String[] args) {

        LogException logObj = new LogException();

        try {
            logObj.randomNum();
        } catch (Exception e) {
            log.error("Something wrong!", e);
        }
    }

    private static int randomNum() {

        Random rand = new Random();
        final int nextInt = rand.nextInt(101);
        //always throw exception
        int unused = 0 / 0;

        return nextInt;
    }
}