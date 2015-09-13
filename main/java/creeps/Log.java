package creeps;

import net.minecraftforge.fml.common.FMLLog;

public class Log {

    public static final String CHANNEL = Reference.MOD_CHANNEL;

    public static void warn(String msg) {
	FMLLog.log(CHANNEL, org.apache.logging.log4j.Level.WARN, msg,
		(Object[]) null);
    }

    public static void error(String msg) {
	FMLLog.log(CHANNEL, org.apache.logging.log4j.Level.ERROR, msg);
    }

    public static void info(String msg) {
	FMLLog.log(CHANNEL, org.apache.logging.log4j.Level.INFO, msg);
    }

    public static void debug(String msg) {
	FMLLog.log(CHANNEL, org.apache.logging.log4j.Level.DEBUG, msg);
    }

    private Log() {
    }

}