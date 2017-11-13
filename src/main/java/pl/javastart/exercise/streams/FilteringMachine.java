package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i=0; i<numberList.size();i++){
            if (numberList.get(i) % 2 == 0){
                evenNumbers.add(numberList.get(i));
            }
        }
        return evenNumbers;
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        List<Integer> outLowerThan20 = new ArrayList<>();
        for (int i=0; i<numberList.size();i++){
            if (numberList.get(i)>20){
                outLowerThan20.add(numberList.get(i));
            }
        }
        return outLowerThan20;
    }

    public List<Book> convertToBooks(List<String> titles)  {
        List<Book> convertToBooks = new ArrayList<>();
        for (String title : titles) {
         convertToBooks.add(new Book(title));
        }

        return convertToBooks;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        List<Book> convertAndReturn = new ArrayList<>();
        for (String title : titles) {
            if (title.substring(0,3).equals("Gra"))
            convertAndReturn.add(new Book(title));
        }
        return convertAndReturn;
    }
}
