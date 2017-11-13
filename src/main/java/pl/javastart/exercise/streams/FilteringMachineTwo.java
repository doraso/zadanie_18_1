package pl.javastart.exercise.streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        List<String> kidNames = new ArrayList<>();
        for (int i = 0; i < ppl.size(); i++) {
            if (ppl.get(i).getAge() < 18) {
                kidNames.add(ppl.get(i).getName());
            }
        }
            return kidNames;
        }


    public List<User> convertPeopleToUsers(List<Person> people) {
        List<User> users = new ArrayList<>();
        List<String> nicknames = new ArrayList<>(Arrays.asList("Tomek_2", "Ania_18","Konrad_44", "Janusz_52", "Sebastian_16"));

        for (int i = 0; i < people.size() ; i++) {
            users.add(new User(people.get(i).getName(), people.get(i).getAge(),nicknames.get(i)));
        }
        return users;
    }
    }

