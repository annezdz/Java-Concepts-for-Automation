package apacheLog4J;


import org.apache.log4j.Logger;

public class HelloLog4J {


    static Logger log = Logger.getLogger(HelloLog4J.class);
    /*
    *
    *Console
    * File .log
    * Mail
    **/


    public static void main(String[] args) {

            log.debug("This is a Debug Log");
            log.info("This is a Info Log");
            log.error("Error in a Project");
    }
}
