package oracle.jdbc.driver;

public class DMSFactory {
    private static final String _Copyright_2004_Oracle_All_Rights_Reserved_ = null;

    public static boolean TRACE = false;
    public static final boolean PRIVATE_TRACE = false;
    public static final String BUILD_DATE = "Wed_Jun_22_11:30:50_PDT_2005";

    static {
        try {
            TRACE = OracleLog.registerClassNameAndGetCurrentTraceSetting(Class
                    .forName("oracle.jdbc.driver.DMSFactory"));
        } catch (Exception e) {
        }
    }
}

/*
 * Location: D:\oracle\product\10.2.0\client_1\jdbc\lib\ojdbc14_g.jar Qualified Name:
 * oracle.jdbc.driver.DMSFactory JD-Core Version: 0.6.0
 */