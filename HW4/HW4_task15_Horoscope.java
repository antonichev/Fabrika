package ua.od.fabrika.antonichev.HW4;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Пользователь указывает дату своего рождения (число и месяц).
 * Программа определяет знак зодиака пользователя и составляет
 * для него гороскоп на ближайшую неделю.
 */
public class HW4_task15_Horoscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter month of your birthday:");
        int month = input.nextInt();

        System.out.println("Enter day of your birthday:");
        int day = input.nextInt();

        if (month <= 0 || month > 12 || day <=0 || day > 31){
            System.out.println("Error! Wrong data");
        }
        else {
            if (day > daysInMonth(month)){
                System.out.println("Error! Wrong day");
            }
            else {
                String sDate = month + "." + (day < 10 ? "0" + day : day);

                System.out.println("Your sign is " + sign(Double.parseDouble(sDate)));
                System.out.println("Horoscope:\n" + horoscope(sign(Double.parseDouble(sDate))));
            }
        }
    }

    public static int daysInMonth(int month){
        int maxDays = 0;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            maxDays = 31;
        }
        else {
            if (month == 4 || month == 6 || month == 9 || month == 11){
                maxDays = 30;
            }
            else {
                maxDays = 29;
            }
        }
        return maxDays;
    }

    public static String sign(double date){
        String s = "";

        if (date >= 12.22 || date <= 1.19) s = "Capricorn";
        if (date >= 1.20 && date <= 2.18) s = "Aquarius";
        if (date >= 2.19 && date <= 3.20) s = "Pisces";
        if (date >= 3.21 && date <= 4.19) s = "Aries";
        if (date >= 4.20 && date <= 5.20) s = "Taurus";
        if (date >= 5.21 && date <= 6.21) s = "Gemini";
        if (date >= 6.22 && date <= 7.22) s = "Cancer";
        if (date >= 7.23 && date <= 8.22) s = "Leo";
        if (date >= 8.23 && date <= 9.22) s = "Virgo";
        if (date >= 9.23 && date <= 10.23) s = "Libra";
        if (date >= 10.24 && date <= 11.21) s = "Scorpio";
        if (date >= 11.22 && date <= 12.21) s = "Sagittarius";

        return s;
    }

    public static String horoscope(String sign){
        HashMap<String, String> horoscope = new HashMap<>(12);

        //Birth date: 21 March - 19 April
        horoscope.put("Aries", "The darkness you experience when you close your eyes might be \n" +
                "accompanied by a low demonic growl today. Most of your ideas will turn out to be \n" +
                "excellent ones today. Avoid having too many ideas, otherwise you may fall from your station.\n" +
                "Half of what you think you're good at is actually a complete fluke. \n" +
                "This week may see the end of your futile efforts to get good at something.\n" +
                "Pants, socks, t-shirts, sweaters. These are all parts of your wardrobe. Remember this.");

        //Birth date: 20 April - 20 May
        horoscope.put("Taurus", "Your prejudices may lead you astray today and leave you requiring four or five \n" +
                "stitches. Your bed is made, lie in it. Fall asleep for a while. Spoon the pillows. Yes, that's it. Relax.\n" +
                "Although you may try to pass yourself off as a second level wizard, your skills are so feeble I \n" +
                "doubt you could open a book by only using your tongue.");

        //Birth date: 21 May - 21 June
        horoscope.put("Gemini", "Show a loved one you care. Many of the people around you will turn out to be lying \n" +
                "scheming bastards, this week. Purple clouds are not usual, nor is red rain. You really must stop \n" +
                "pretending that the pictures your niece draws are real.\n" +
                "You like to think that you're finally gettings your financial affairs into good order. May the tax be with you.");

        //Birth date: 22 June - 22 July
        horoscope.put("Cancer", "There's no harm in taking the day off. The SQL Database you are trying to access is \n" +
                "flummoxed. Are you sure you want to know your future? Duty calls, and your duty is to make people \n" +
                "aware that you are not who they think you are. Nor are they who they think they themselves are.\n" +
                "Opening up to a close friend will probably be the worst thing you could do, in your situation.");

        //Birth date: 23 July - 22 August
        horoscope.put("Leo", "You yearn to be a farmer just so that you can be out standing in your field. \n" +
                "Scroll further down any web pages you access today, just in case there are hidden clauses \n" +
                "you aren't aware of.\n" +
                "Prognostication is not a good word when you are guessing the colour of a lady's real hair colour.\n" +
                "Express yourself in a non-flamboyant and unexciting way. Buy a nice brooch.");

        //Birth date: 23 August - 22 September
        horoscope.put("Virgo", "You think \"pink\", but you buy \"blue\". This is why you're confused a lot of the time. \n" +
                "If you never liked sprouts before, try them again. Your tastes may have changed.\n" +
                "The way you dance around the office may cause some to question certain parts of your personal life.\n" +
                "Time is on your side, feel free to mix-it-up a little.");

        //Birth date: 23 September - 23 October
        horoscope.put("Libra", "You're as transparent as a blast of canned air - try to be more complex by wearing \n" +
                "hats that are clearly too small for your head. Fire is your symbol for today.\n" +
                "In time you will come to realise the futility of trying to scratch your name in your refrigerator \n" +
                "using a rubber band.");

        //Birth date: 24 October - 21 November
        horoscope.put("Scorpio", "To avoid embarrassment, please avoid wearing underwear on incorrect areas of the body. \n" +
                "Time and time again you are asked to wait outside the room whilst the \"adults\" discuss your situation. \n" +
                "This week, make sure you are one of the \"adults\".\n" +
                "Take your time over getting where you're going today. You're only going to have shitty things happen when you get there.\n" +
                "Your future may be tainted by a mistake in your past. Now is the time for a new resolution.");

        //Birth date: 22 November - 21 December
        horoscope.put("Sagittarius", "Beware of people offering free screensavers. There might not be a tomorrow, \n" +
                "but all indications point to yes All your better ideas have already been stolen and used in the past. \n" +
                "Which perhaps suggests you should prefix \"crackpot\" to the unofficial title you give yourself.\n" +
                "Old wives tales aren't smutty recollections of sexual conquests.");

        //Birth date: 22 December - 19 January
        horoscope.put("Capricorn", "The word \"Wobble\" might mean something to you today that it simply hasn't \n" +
                "meant before. You have many more years ahead of you. Do what you feel is right in your heart.\n" +
                "Heavy drinking can lead to a certain number of social problems.");

        //Birth date: 20 January - 18 February
        horoscope.put("Aquarius", "Tantric is not a cuss-word you want to use around the office. \n" +
                "It's not even a cuss-word. It is, however, said to be very exhausting. You are a \n" +
                "complete fraud - the sooner you accept it, the better.\n" +
                "When gazing upon the face of a loved one, close your mouth and stop babbling on about how much you \n" +
                "wish that restraining order had been quashed.\n" +
                "Don't try to tell people how to live their lives! Your life is your own, and you should feel \n" +
                "perfectly free to bugger it up royally.");

        //Birth date: 19 February - 20 March
        horoscope.put("Pisces", "See how clever you can be today by attempting to count your lose change inside your \n" +
                "pocket WITHOUT taking your hand or the money out. Jumping up and down is great fun and encouraging \n" +
                "others to do so is a fine way to make friends and see wobbling breasts.\n" +
                "This week will see \"a new hope\" arrive in the form of a whiny sand-farmer boy.\n");

        return horoscope.get(sign);
    }
}
