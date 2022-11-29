import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Dictionary{

    static Scanner input = new Scanner(System.in);
    static Map<String, String> dictionary = new HashMap<>();


    public static void main(String[] args) {
        System.out.println("��������� ����������:");
        setting();

        for (Map.Entry<String, String> element: dictionary.entrySet()) {

            System.out.print(">>> ");
            System.out.println(element.getKey());
            System.out.print(">>> ");
            String inputWord = input.next();

            if (inputWord.equals(element.getValue())) System.out.println("���������");
            else System.out.println("�� ��������� - " + element.getValue());
        }

        System.out.println("��������� ���������");
    }

    private static void setting() {
        dictionary.put("����������", "accommodation");
        dictionary.put("����������", "adequate");
        dictionary.put("���������", "ambience");
        dictionary.put("��������,_�����������", "apartment");
        dictionary.put("���������,_���������_�_�������", "available");
        dictionary.put("����������_���������_��������", "award-winning_restaurant");
        dictionary.put("����_����������������_/_���������_���", "be_designed_for");
        dictionary.put("����_�_�������_�����", "be_in_a_good_shape");
        dictionary.put("���_���������_����������", "be_like");
        dictionary.put("����_�������_���_���_�����_����", "be_like_two_peas_in_a_pod");
        dictionary.put("����������,_����_�������������", "be_located");
        dictionary.put("�������������_�������_�������", "book_a_room_in_advance");
        dictionary.put("�������_������������", "booking_system");
        dictionary.put("��������_����", "buffet");
        dictionary.put("����������_�������", "bunk_beds");
        dictionary.put("������������", "business_trip");
        dictionary.put("�������_�������", "call_ahead");
        dictionary.put("��������_������_������������", "cancellation_policy");
        dictionary.put("�����_�������", "capsule_hotel");
        dictionary.put("����", "carpet");
        dictionary.put("����������_�_�����_(����������������_���_���������)", "check_in");
        dictionary.put("����������_��_�����_(����������������?_���_������)", "check_out");
        dictionary.put("out_-��������_�����_���������,_����_���������!", "check_out");
        dictionary.put("��������", "chic");
        dictionary.put("�������_�������_����", "children's_play_area");
        dictionary.put("��������,_��������", "concerns");
        dictionary.put("���������-����", "conference_rooms");
        dictionary.put("������������_����������_/_������������", "confirm_the_reservation_/_booking");
        dictionary.put("����������", "consume");
        dictionary.put("�����������", "consumer");
        dictionary.put("��������������,_��������,_����������������,_���������������", "convert");
        dictionary.put("�����,_���������", "curtains");
        dictionary.put("����������,_������", "customer");
        dictionary.put("���������,_��������", "develop");
        dictionary.put("���������", "dormitory");
        dictionary.put("����������_�����_�_1_��������", "double_room");
        dictionary.put("������������_�������������", "eco-friendly");
        dictionary.put("������", "efforts");
        dictionary.put("���������_(�����_�_�������_���_�_�����", "environment");
        dictionary.put("etcetero_(���)", "etc");
        dictionary.put("�������,_�����������,_������,_�������������", "facilities");
        dictionary.put("��������", "facing");
        dictionary.put("�������_�������", "family_room");
        dictionary.put("���������_�����", "fill_in_a_form");
        dictionary.put("������,_����������,_�������", "former");
        dictionary.put("������_����", "former_lighthouse");
        dictionary.put("������_����������", "former_patrons");
        dictionary.put("�������������", "fraud");
        dictionary.put("��������", "Fraudster");
        dictionary.put("����������,_������,_����������_������", "furnishing");
        dictionary.put("�������", "gather");
        dictionary.put("��������������", "guaranted");
        dictionary.put("��������", "Gym");
        dictionary.put("���", "hairdryer");
        dictionary.put("��_��������_������", "he_aggregates_reviews");
        dictionary.put("�����,_��������������", "highway");
        dictionary.put("cheap_hotel", "hostel");
        dictionary.put("�����������", "imposing");
        dictionary.put("�������", "in_advance");
        dictionary.put("�_������_�������������", "in_the_event_of_fraud");
        dictionary.put("���_�_���������", "indoor_bar");
        dictionary.put("�������", "iron");
        dictionary.put("�������", "itinerary");
        dictionary.put("������", "Laundry");
        dictionary.put("���������", "laundry_service");
        dictionary.put("������", "lifeguard");
        dictionary.put("��������_���������", "lifeguard_on_duty");
        dictionary.put("����_(live_������)", "live");
        dictionary.put("�����_������_(live_����)", "live_music");
        dictionary.put("���_���������_���������", "look_like");
        dictionary.put("����������_����������_����������", "look_up");
        dictionary.put("�����,_����_�����_�_�����", "lounge");
        dictionary.put("���������_����������", "low-price_accommodation");
        dictionary.put("���������", "luxurious");
        dictionary.put("������_����������_=_������_������������", "make_a_reservation_=_make_a_booking");
        dictionary.put("���������_�����", "metropolian_hotel");
        dictionary.put("���������_���-��_(������,_������,_�������_�_��)", "mixed_smth");
        dictionary.put("����������������_��������", "motor_vehicles");
        dictionary.put("���������_���������", "natural_environment");
        dictionary.put("guest,_visitor,_residents", "occupant");
        dictionary.put("�����������_�_�����", "occupant");
        dictionary.put("�/��/��_�����������", "on_offer");
        dictionary.put("���_��_�_���������", "outdoor_bar");
        dictionary.put("����_�����_NAME", "park_named_after_NAME");
        dictionary.put("��������", "parking_area_/_space");
        dictionary.put("���������,_�����������", "permanently");
        dictionary.put("�������_��_�������", "pod");
        dictionary.put("����������_�����", "pod_hotel");
        dictionary.put("����������_�����", "popular_style");
        dictionary.put("�������", "private");
        dictionary.put("�������_������", "private_bathroom");
        dictionary.put("�������������,_������������", "provide");
        dictionary.put("������������", "Provide");
        dictionary.put("������������_����-��_���-��", "provide_smb_with_smth");
        dictionary.put("�������", "punch_in");
        dictionary.put("���������_����-��", "punch_in_=_type_in");
        dictionary.put("��������", "purchase");
        dictionary.put("��������_�����_�����", "purchase_through_websites");
        dictionary.put("������������_����������", "quality_accommodation");
        dictionary.put("�������������_��_,,,_��", "range_from_,,,_to_,,,");
        dictionary.put("�������,_�������", "reception");
        dictionary.put("���������", "reduce");
        dictionary.put("�������_����_����������_����", "reduce_your_carbon_footprint");
        dictionary.put("����������_��_����������", "regardless_of_the_placement");
        dictionary.put("��������_�����", "remote_destinations");
        dictionary.put("��������_�����������_=_�������������_�����������", "remote_education_=_distant_education");
        dictionary.put("�������", "remotely");
        dictionary.put("�������_/_����������_��������", "rent_an_apartment");
        dictionary.put("��������������", "reservation");
        dictionary.put("�������_��_�����", "rooftop_terrace");
        dictionary.put("������������_�������", "room_service");
        dictionary.put("������������_����_�������", "satisfy_your_needs");
        dictionary.put("������������_����_������", "satisfy_your_wallet");
        dictionary.put("������_����������_�����", "search_for_the_right_place");
        dictionary.put("�����������������", "self-catering");
        dictionary.put("��������_�������", "serve_a_breakfast");
        dictionary.put("������_������,_������������_������_�", "share_a_bathroom");
        dictionary.put("����", "sign");
        dictionary.put("�������_���_������", "single_room");
        dictionary.put("���������,_���_������_����_���-��_(������,_������)", "single-sex_smth");
        dictionary.put("����������_����������_���_�������", "sociable_accommodation");
        dictionary.put("�����������", "sort_out");
        dictionary.put("����������_�����", "spacious_accommodation");
        dictionary.put("�����_����", "suite");
        dictionary.put("���������", "surroundings");
        dictionary.put("�������", "swimming_pool");
        dictionary.put("�����_�_��������_�������_���������", "target");
        dictionary.put("�������_�������", "target_area");
        dictionary.put("��������,_������,_����_�_���", "the_disabled");
        dictionary.put("����_���������_��_���-����", "to_be_aim_to_something");
        dictionary.put("����_�������", "to_be_obtained");
        dictionary.put("������_������", "to_read_reviews");
        dictionary.put("�����������", "to_request");
        dictionary.put("������_������", "to_write_reviews");
        dictionary.put("����������_�����_�_2_���������", "twin_room");
        dictionary.put("����������_�����", "unique_places");
        dictionary.put("����������_��������_�����������", "unique_selling_point");
        dictionary.put("��������������", "unrivalled");
        dictionary.put("��������������_����������", "upscale_accommodation");
        dictionary.put("���_������", "whatever");
        dictionary.put("�_�������_�����������_��", "within_walking_distance_of_the");
        dictionary.put("������_���_�������", "writing_paper");

    }
}