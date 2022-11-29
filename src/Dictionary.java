import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Dictionary{

    static Scanner input = new Scanner(System.in);
    static Map<String, String> dictionary = new HashMap<>();


    public static void main(String[] args) {
        System.out.println("Программа начинается:");
        setting();

        for (Map.Entry<String, String> element: dictionary.entrySet()) {

            System.out.print(">>> ");
            System.out.println(element.getKey());
            System.out.print(">>> ");
            String inputWord = input.next();

            if (inputWord.equals(element.getValue())) System.out.println("Правильно");
            else System.out.println("Не правильно - " + element.getValue());
        }

        System.out.println("Программа завершена");
    }

    private static void setting() {
        dictionary.put("размещение", "accommodation");
        dictionary.put("адекватный", "adequate");
        dictionary.put("атмосфера", "ambience");
        dictionary.put("квартира,_апартаменты", "apartment");
        dictionary.put("доступный,_имеющийся_в_наличии", "available");
        dictionary.put("отмеченный_наградами_ресторан", "award-winning_restaurant");
        dictionary.put("быть_спроектированным_/_созданным_для", "be_designed_for");
        dictionary.put("быть_в_хорошей_форму", "be_in_a_good_shape");
        dictionary.put("про_похожесть_характеров", "be_like");
        dictionary.put("быть_похожим_как_две_капли_воды", "be_like_two_peas_in_a_pod");
        dictionary.put("находиться,_быть_расположенным", "be_located");
        dictionary.put("забронировать_комнату_заранее", "book_a_room_in_advance");
        dictionary.put("система_бронирования", "booking_system");
        dictionary.put("шведский_стол", "buffet");
        dictionary.put("двуяросная_кровать", "bunk_beds");
        dictionary.put("командировка", "business_trip");
        dictionary.put("звоните_заранее", "call_ahead");
        dictionary.put("политика_отмены_бронирования", "cancellation_policy");
        dictionary.put("отель_капсула", "capsule_hotel");
        dictionary.put("ковёр", "carpet");
        dictionary.put("заселяться_в_отель_(регистрироваться_при_заселении)", "check_in");
        dictionary.put("выселяться_из_отеля_(регистрироваться?_При_выезде)", "check_out");
        dictionary.put("out_-усиление_слова_проверять,_типо_проверьте!", "check_out");
        dictionary.put("шикарный", "chic");
        dictionary.put("детская_игровая_зона", "children's_play_area");
        dictionary.put("проблемы,_опасения", "concerns");
        dictionary.put("конференц-залы", "conference_rooms");
        dictionary.put("подтверждать_резервацию_/_бронирование", "confirm_the_reservation_/_booking");
        dictionary.put("потреблять", "consume");
        dictionary.put("потребитель", "consumer");
        dictionary.put("конвертировать,_изменять,_трансформировать,_преобразовывать", "convert");
        dictionary.put("шторы,_занавески", "curtains");
        dictionary.put("покупатель,_клиент", "customer");
        dictionary.put("развивать,_улучшать", "develop");
        dictionary.put("общежитие", "dormitory");
        dictionary.put("двуместный_номер_с_1_кроватью", "double_room");
        dictionary.put("экологически_дружественный", "eco-friendly");
        dictionary.put("усилия", "efforts");
        dictionary.put("окружение_(может_о_природе_или_о_людях", "environment");
        dictionary.put("etcetero_(лат)", "etc");
        dictionary.put("условия,_возможности,_услуги,_оборудования…", "facilities");
        dictionary.put("напротив", "facing");
        dictionary.put("семейна_комната", "family_room");
        dictionary.put("заполнить_форму", "fill_in_a_form");
        dictionary.put("бывший,_предыдущий,_прошлый", "former");
        dictionary.put("бывший_маяк", "former_lighthouse");
        dictionary.put("бывшие_постояльцы", "former_patrons");
        dictionary.put("мошенничество", "fraud");
        dictionary.put("мошенник", "Fraudster");
        dictionary.put("меблеровка,_мебель,_обстановка_мебели", "furnishing");
        dictionary.put("собрать", "gather");
        dictionary.put("гарантированно", "guaranted");
        dictionary.put("спортзал", "Gym");
        dictionary.put("фен", "hairdryer");
        dictionary.put("он_собирает_отзывы", "he_aggregates_reviews");
        dictionary.put("шоссе,_автомагистраль", "highway");
        dictionary.put("cheap_hotel", "hostel");
        dictionary.put("навязывание", "imposing");
        dictionary.put("заранее", "in_advance");
        dictionary.put("в_случае_мошенничества", "in_the_event_of_fraud");
        dictionary.put("бар_в_помещении", "indoor_bar");
        dictionary.put("гладить", "iron");
        dictionary.put("маршрут", "itinerary");
        dictionary.put("стирка", "Laundry");
        dictionary.put("прачечная", "laundry_service");
        dictionary.put("охрана", "lifeguard");
        dictionary.put("дежурный_спасатель", "lifeguard_on_duty");
        dictionary.put("жить_(live_глагол)", "live");
        dictionary.put("живая_музыка_(live_прил)", "live_music");
        dictionary.put("про_похожесть_внешности", "look_like");
        dictionary.put("посмотреть_справочную_информацию", "look_up");
        dictionary.put("лобби,_холл_внизу_у_отеля", "lounge");
        dictionary.put("недорогое_размещение", "low-price_accommodation");
        dictionary.put("роскошный", "luxurious");
        dictionary.put("делать_резервайию_=_делать_бронирование", "make_a_reservation_=_make_a_booking");
        dictionary.put("столичный_отель", "metropolian_hotel");
        dictionary.put("смешанное_что-то_(туалет,_ванная,_комната_и_тп)", "mixed_smth");
        dictionary.put("автотранспортные_средства", "motor_vehicles");
        dictionary.put("природное_окружение", "natural_environment");
        dictionary.put("guest,_visitor,_residents", "occupant");
        dictionary.put("проживающий_в_отеле", "occupant");
        dictionary.put("в/по/на_предложению", "on_offer");
        dictionary.put("бар_не_в_помещении", "outdoor_bar");
        dictionary.put("парк_имени_NAME", "park_named_after_NAME");
        dictionary.put("парковка", "parking_area_/_space");
        dictionary.put("постоянно,_пермаментно", "permanently");
        dictionary.put("стручок_от_бобовых", "pod");
        dictionary.put("капсульный_отель", "pod_hotel");
        dictionary.put("популярный_стиль", "popular_style");
        dictionary.put("частный", "private");
        dictionary.put("частная_ванная", "private_bathroom");
        dictionary.put("предоставлять,_обеспечивать", "provide");
        dictionary.put("предоставить", "Provide");
        dictionary.put("обеспечивать_кого-то_чем-то", "provide_smb_with_smth");
        dictionary.put("вбивать", "punch_in");
        dictionary.put("вписывать_куда-то", "punch_in_=_type_in");
        dictionary.put("покупать", "purchase");
        dictionary.put("покупать_через_сайты", "purchase_through_websites");
        dictionary.put("качественное_размещение", "quality_accommodation");
        dictionary.put("варьироваться_от_,,,_до", "range_from_,,,_to_,,,");
        dictionary.put("ресепшн,_приёмная", "reception");
        dictionary.put("сокращать", "reduce");
        dictionary.put("сократи_свой_углеродный_след", "reduce_your_carbon_footprint");
        dictionary.put("независимо_от_размещения", "regardless_of_the_placement");
        dictionary.put("удалённые_места", "remote_destinations");
        dictionary.put("удалённое_образование_=_дистанционное_образование", "remote_education_=_distant_education");
        dictionary.put("удалённо", "remotely");
        dictionary.put("снимать_/_арендовать_квартиру", "rent_an_apartment");
        dictionary.put("резервирование", "reservation");
        dictionary.put("терраса_на_крыше", "rooftop_terrace");
        dictionary.put("обслуживание_номеров", "room_service");
        dictionary.put("удовлетворяй_свои_желания", "satisfy_your_needs");
        dictionary.put("удовлетворяй_свой_кошелёк", "satisfy_your_wallet");
        dictionary.put("искать_правильное_место", "search_for_the_right_place");
        dictionary.put("самообслуживающий", "self-catering");
        dictionary.put("подавать_завтрак", "serve_a_breakfast");
        dictionary.put("делить_ванную,_пользоваться_вместе_с", "share_a_bathroom");
        dictionary.put("знак", "sign");
        dictionary.put("комната_для_одного", "single_room");
        dictionary.put("однополое,_для_одного_пола_что-то_(ванная,_туалет)", "single-sex_smth");
        dictionary.put("размещение_подходящее_под_общение", "sociable_accommodation");
        dictionary.put("сортировать", "sort_out");
        dictionary.put("просторное_жильё", "spacious_accommodation");
        dictionary.put("номер_люкс", "suite");
        dictionary.put("окружение", "surroundings");
        dictionary.put("бассейн", "swimming_pool");
        dictionary.put("иметь_в_качестве_целевой_аудитории", "target");
        dictionary.put("целевая_область", "target_area");
        dictionary.put("инвалиды,_дотеры,_люди_с_ОВЗ", "the_disabled");
        dictionary.put("быть_нацеленым_на_что-либо", "to_be_aim_to_something");
        dictionary.put("быть_получен", "to_be_obtained");
        dictionary.put("читать_отзывы", "to_read_reviews");
        dictionary.put("запрашивать", "to_request");
        dictionary.put("писать_отзывы", "to_write_reviews");
        dictionary.put("двуместный_номер_с_2_кроватями", "twin_room");
        dictionary.put("уникальные_места", "unique_places");
        dictionary.put("уникальное_торговое_предложение", "unique_selling_point");
        dictionary.put("непревзойдённый", "unrivalled");
        dictionary.put("высококлассное_размещение", "upscale_accommodation");
        dictionary.put("что_угодно", "whatever");
        dictionary.put("в_шаговой_достопнусти_от", "within_walking_distance_of_the");
        dictionary.put("листки_для_заметок", "writing_paper");

    }
}