package ua.od.fabrika.antonichev.HW4;

import java.util.Random;
import java.util.Scanner;

/**
 * Написать игру "О, счастливчик!". На экране по очереди появляются вопросы,
 * и варианты ответов. Неправильный выбор - игра окончена.
 * Правильный ответ – переходим к следующему вопросу. Если все ответы правильные –
 * в конце выводится сообщение о победе. По желанию можно реализовать несгораемые суммы,
 * подсказки, работу с файлами, звуковые эффекты и тд.
 */
public class HW4_task11_OhLucky {
    static String USER_NAME;

    static boolean HELP = true;
    static boolean FIFTY_FIFTY = true;
    static int MAX_GAMES = 9;

    static Random random = new Random();

    static Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args){
        boolean exit = false;

        System.out.println("Добро пожаловать в игру \"О, Счастливчик\"!");

        System.out.println("Пожалуйста представтесь:");
        USER_NAME = INPUT.next();

        System.out.println("Приятно познакомиться, " + USER_NAME);
        System.out.println();

        while (!exit) {
            System.out.println("1. Играть, 2. Правила игры, 0. Выход");
            int choice = INPUT.nextInt();

            switch (choice) {
                case 1:
                    start();
                    exit = true;
                    break;
                case 2:
                    gameRules();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Неправильный выбор!");
                    break;
            }
        }
    }

    public static void gameRules(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-Првила игры:-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" +
                "Компьютер задает вопрос и даёт 4 варианта ответа на него.\n" +
                "Для того, чтобы заработать 28.500 гривен, участнику необходимо\n" +
                "ответить на 9 вопросов разной стоимости и разного уровня сложности.\n" +
                "(в случае, если игрок ввдет вариант, не указанный в допустимых, налагается штраф 500 грн)\n" +
                "Игрок имеет право до того момента, как дал окончательный ответ на вопрос,\n" +
                "прекратить игру и забрать заработанные к этому моменту деньги.\n" +
                "Подсказки:\n" +
                "'50 на 50'    — компьютер убирает два заведомо неверных варианта ответа\n" +
                "'Помощь зала' — каждый из гостей в студии выбирает вариант ответа, который\n" +
                "                 считает верным, после чего игроку предоставляются результаты\n\n");
    }

    public static void start(){
        boolean mistake = false;

        int questNum = 1;
        int amount = 0;
        int questCost = 0;

        String hint;

        String[] quest = {};

        while (!mistake && questNum <= MAX_GAMES){
            if (amount < 0){
                mistake = true;
                System.out.println("К сожалению, Вы ушли в минус. Игра окончена.");
                continue;
            }

            hint = "";

            if (HELP) hint += "9 - помощь зала";
            if (FIFTY_FIFTY) hint += " 0 - помощь зала";
            if (!HELP && !FIFTY_FIFTY) hint += "нет подсказок";

            System.out.println();

            int curRandom = random.nextInt(10);

            Questions questions = new Questions();
            if (questNum <= 3) {
                quest = questions.easy("easy" + curRandom);
                questCost += 500;
            }

            if (questNum > 3 && questNum <= 6) {
                quest = questions.medium("med" + curRandom);
                questCost += 1000;
            }

            if (questNum > 6 && questNum <= 9) {
                quest = questions.hard("hard" + curRandom);
                questCost += 2000;
            }

            for (int i = 0; i < 5; i++) {
                System.out.println(quest[i]);
            }

            System.out.println("\nСтоимость вопроса: " + questCost + ", накоплено: " + amount);
            System.out.println("\nВаш вариант (" + hint + "):");

            int answ = INPUT.nextInt();

            if (answ == 0){
                if (FIFTY_FIFTY){
                    System.out.println(quest[0]);
                    System.out.println(quest[Integer.parseInt(quest[5])]);
                    if (Integer.parseInt(quest[5]) > 2)
                        System.out.println(quest[Integer.parseInt(quest[5]) - 1]);
                    else {
                        System.out.println(quest[Integer.parseInt(quest[5]) + 1]);
                    }
                    System.out.println("\nВаш вариант:");
                    answ = INPUT.nextInt();
                    FIFTY_FIFTY = false;
                }
                else {
                    System.out.println("Вы ужеиспользовали посказку '50/50'");
                    System.out.println("\nВаш вариант:");
                    answ = INPUT.nextInt();
                }
            }

            if (answ == 9){
                if (HELP){
                    System.out.println(quest[0]);
                    if (Integer.parseInt(quest[5]) > 2)
                        System.out.println("Зал считает, что это " + quest[Integer.parseInt(quest[5])]);
                    else {
                        System.out.println("Зал считает, что это " + quest[Integer.parseInt(quest[5]) + 1]);
                    }
                    System.out.println("\nВаш вариант:");
                    answ = INPUT.nextInt();
                    HELP = false;
                }
                else {
                    System.out.println("Вы ужеиспользовали посказку 'помощь зала'");
                    System.out.println("\nВаш вариант:");
                    answ = INPUT.nextInt();
                }
            }

            if (answ != 1 && answ != 2 && answ != 3 && answ != 4 && answ != 9 && answ != 0){
                System.out.println("Ошибка! Неверный выбор! Штраф 500 грн.");
                amount -= 500;
                if (questNum <= 3) questCost -= 500;
                if (questNum > 3 && questNum <= 6) questCost -= 1000;
                if (questNum > 6 && questNum <= 9) questCost -= 2000;
                continue;
            }

            if (answ == Integer.parseInt(quest[5])){
                System.out.println("Верно!");
                amount += questCost;
                questNum++;
                if (questNum == 9) System.out.println(USER_NAME + ", поздравляем! Вы выиграли " + amount + " грн.!");
            }
            else {
                mistake = true;
                System.out.println("Вы проиграли! Вы заработали " + amount);
            }
        }
    }
}

class Questions {
    public String[] easy(String s) {
        String[] easy0 = {"Кем явлется Крош из \"Смешариков\"?", "1. Кроликом", "2. Ежиком", "3. Кроликом", "4. Вороном", "1"};
        String[] easy1 = {"Где пируют погибшие в бою викинги?", "1. В Раю", "2. На горе Олимп", "3. В Вальхалле", "4. В царстве Морфея", "3"};
        String[] easy2 = {"По призывам Минздрава, человек должен мыть фрукты и руки. Когда?", "1. До еды", "2. После еды", "3. Вместо еды", "4. Перед сном", "1"};
        String[] easy3 = {"Кто использует термин \"чёрная дыра\"?", "1. Философы", "2. Астрономы", "3. Фантасты", "4. Депутаты", "2"};
        String[] easy4 = {"Что такое пармезан?", "1. Итальянский соус", "2. Котлета на пару", "3. Колбаса", "4. Сыр", "4"};
        String[] easy5 = {"Какая ворона получилась у режиссера Александра Татарского?", "1. Пластилиновая", "2. Стальная", "3. Медная", "4. Пластиковая", "1"};
        String[] easy6 = {"Каким научным методом пользовался Шерлок Холмс?", "1. Экстрасенсорным", "2. Аналитическим", "3. Дедуктивным", "4. Наугад", "3"};
        String[] easy7 = {"Кого подковал Левша?", "1. Лошадь", "2. Слона", "3. Блоху", "4. Вошь", "3"};
        String[] easy8 = {"Как называли кабаре-дуэт Саши и Лолиты?", "1. Академия", "2. Школа", "3. Блеск", "4. Колледж", "1"};
        String[] easy9 = {"Какое прозвище носит Киев?", "1. Мать городов русских", "2. Отец городов русских", "3. Сын городов русских", "4. Внук городов русских", "1"};
        String[] easy10 = {"Яблочный \"конкурент\" коньяка.", "1. Абсент", "2. Текила", "3. Ром", "4. Кальвадос", "4"};

        String[] empty = {};

        if (s.equals("easy0")) return easy0;
        if (s.equals("easy1")) return easy1;
        if (s.equals("easy2")) return easy2;
        if (s.equals("easy3")) return easy3;
        if (s.equals("easy4")) return easy4;
        if (s.equals("easy5")) return easy5;
        if (s.equals("easy6")) return easy6;
        if (s.equals("easy7")) return easy7;
        if (s.equals("easy8")) return easy8;
        if (s.equals("easy9")) return easy9;
        if (s.equals("easy10")) return easy10;

        return empty;
    }

    public String[] medium(String s) {
        String[] med0 = {"От какого сладкого лакомства заболел старик Хоттабыч?", "1. Лимонад", "2. Мороженое", "3. Орехи", "4. Шоколад", "2"};
        String[] med1 = {"Какое дерево характерно для саванн Африки?", "1. Эвкалипт", "2. Баобаб", "3. Лиственница", "4. Береза", "2"};
        String[] med2 = {"Как называется в геометрии линия, делящая угол пополам?", "1. Секущая", "2. Гипотенуза", "3. Биссектриса", "4. Синусоида", "3"};
        String[] med3 = {"Какой пигмент окрашивает листья в зеленый цвет?", "1. Каротин", "2. Антоциан", "3. Танин", "4. Хлорофилл", "4"};
        String[] med4 = {"Назовите столицу Суринама.", "1. Парамарибо", "2. Мадрас", "3. Ханой", "4. Улан-Батор", "1"};
        String[] med5 = {"Что проводит боксёр, наносящий противнику удар снизу?", "1. Хук", "2. Апперкот", "3. Джут", "4. Свинг", "2"};
        String[] med6 = {"Какая карточная игра не довела до добра Германа из Пиковой дамы?", "1. Винт", "2. Фараон", "3. Баккара", "4. Очко", "2"};
        String[] med7 = {"Как называется самый большой город Китая?", "1. Ухань", "2. Пекин", "3. Нанкин", "4. Шанхай", "4"};
        String[] med8 = {"Как звали сказочного фламандского короля - изобретателя пива?", "1. Гамбринус", "2. Пилзнер", "3. Праздрой", "4. Хольстен", "1"};
        String[] med9 = {"Для какого континента кролики стали стихийным бедствием?", "1. Азия", "2. Австралия", "3. Америка", "4. Африка", "2"};
        String[] med10 = {"Из какой зерновой культуры делают перловую крупу?", "1. Рис", "2. Овес", "3. Ячмень", "4. Рожь", "1"};

        String[] empty = {};

        if (s.equals("med0")) return med0;
        if (s.equals("med1")) return med1;
        if (s.equals("med2")) return med2;
        if (s.equals("med3")) return med3;
        if (s.equals("med4")) return med4;
        if (s.equals("med5")) return med5;
        if (s.equals("med6")) return med6;
        if (s.equals("med7")) return med7;
        if (s.equals("med8")) return med8;
        if (s.equals("med9")) return med9;
        if (s.equals("med10")) return med10;

        return empty;
    }

    public String[] hard(String s) {
        String[] hard0 = {"Кто по профессии братья Жемчужниковы?", "1. Актеры", "2. Певцы", "3. Писатели", "4. Политики", "3"};
        String[] hard1 = {"Какую кличку носил герой Миронова из кинофильма Бриллиантовая рука?", "1. Граф", "2. Барон", "3. Князь", "4. Купец", "1"};
        String[] hard2 = {"В каком журнале состоялась первая отечественная публикация Архипелага Гулаг?", "1. Москва", "2. Октябрь", "3. Современник", "4. Новый мир", "4"};
        String[] hard3 = {"Какой из этих соборов превосходит по высоте пирамиду Хеопса?", "1. Софийский", "2. Кельнский", "3. Петропавловский", "4. Успенский", "2"};
        String[] hard4 = {"Актёром какого московского театра был Владимир Высоцкий?", "1. им. Вахтангова", "2. им. Маяковского", "3. Таганка", "4. им. Ермоловой", "3"};
        String[] hard5 = {"Как называется музыкальный знак, обозначающий громкую игру?", "1. Форте", "2. Пиано", "3. Легато", "4. Анданте", "1"};
        String[] hard6 = {"Как называется самец медоносной пчелы?", "1. Овод", "2. Слепень", "3. Шершень", "4. Трутень", "4"};
        String[] hard7 = {"Какой стихотворный размер используется в русской частушке?", "1. Ямб", "2. Раешник", "3. Хорей", "4. Верлибр", "2"};
        String[] hard8 = {"На территории какой современной страны находится Карфаген?", "1. Египет", "2. Судан", "3. Тунис", "4. Израиль", "3"};
        String[] hard9 = {"Какую из этих опер написал Моцарт?", "1. Свадьба Фигаро", "2. Севильский цирюльник", "3. Сицилийская вечерня", "4. Сельская честь", "1"};
        String[] hard10 = {"Чей осёл помер от голода, не сумев выбрать между двумя одинаковыми связками сена?", "1. Ходжи Насреддина", "2. Жана Буридана", "3. Санчо Пансы", "4. Валаама", "2"};

        String[] empty = {};

        if (s.equals("hard0")) return hard0;
        if (s.equals("hard1")) return hard1;
        if (s.equals("hard2")) return hard2;
        if (s.equals("hard3")) return hard3;
        if (s.equals("hard4")) return hard4;
        if (s.equals("hard5")) return hard5;
        if (s.equals("hard6")) return hard6;
        if (s.equals("hard7")) return hard7;
        if (s.equals("hard8")) return hard8;
        if (s.equals("hard9")) return hard9;
        if (s.equals("hard10")) return hard10;

        return empty;
    }
}
