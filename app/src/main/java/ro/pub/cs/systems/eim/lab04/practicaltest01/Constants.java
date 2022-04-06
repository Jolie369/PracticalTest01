package ro.pub.cs.systems.eim.lab04.practicaltest01;

public interface Constants {

    final public static String LEFT_COUNT = "";
    final public static String RIGHT_COUNT = "";
    final public static String NUMBER_OF_CLICKS = "";

    String TAG = "practicaltest";;
    int SECONDARY_ACTIVITY_REQUEST_CODE = 1;
    final public static String FIRST_NUMBER = "firstNumber";
    final public static String SECOND_NUMBER = "secondNumber";
    final public static String PROCESSING_THREAD_TAG = "[Processing Thread]";

    final public static String BROADCAST_RECEIVER_EXTRA = "message";
    final public static String BROADCAST_RECEIVER_TAG = "[Message]";

    final public static String[] actionTypes = {
            "ro.pub.cs.systems.eim.practicaltest01.arithmeticmean",
            "ro.pub.cs.systems.eim.practicaltest01.geometricmean"
    };
    int NUMBER_OF_CLICKS_THRESHOLD = 5;
    final public static int SERVICE_STOPPED = 0;
    final public static int SERVICE_STARTED = 1;
}
