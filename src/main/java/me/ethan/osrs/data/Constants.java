package me.ethan.osrs.data;

import me.ethan.osrs.utils.Random;

public class Constants {

    public static String CREATE_LINK = "https://secure.runescape.com/m=account-creation/g=oldscape/create_account?trialactive=true";
    public static String GOOGLE_KEY = "6Lcsv3oUAAAAAGFhlKrkRb029OHio098bbeyi_Hv";
    public static String CAPTCHA_KEY = "";
    public static String BOT_PASSWORD = Random.getRandomName(Random.nextInt(5,20)) + Random.nextInt(0,9999);
    public static int THREAD_AMOUNT = 5;
    public static String PROXY_API = "http://api.proxychecker.co/";
    public static boolean USE_PROXIES = true;
}
