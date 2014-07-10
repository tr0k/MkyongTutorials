package pl.tr0k;

import org.apache.log4j.Logger;

/**
 * Created by tr0k on 2014-07-10.
 */
public class HelloExample{

    final static Logger logger = Logger.getLogger(HelloExample.class);

    public static void main(String[] args) {

        HelloExample obj = new HelloExample();
        obj.runLogger("test param");

    }

    private void runLogger(String parameter){

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

    }

}
