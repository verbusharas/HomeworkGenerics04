package lt.verbus;

public class Main {

    public static void main(String[] args) {
       //BTW NESUPRATAU, KODĖL ŠITA UŽDUOTIS GENERICS TEMOJE???
        ListOfNumbers list1 = new ListOfNumbers();
        list1.addNumber(1.5);
        list1.addNumber(10.0);
        list1.addNumber(2.5);

        ListOfNumbers list2 = new ListOfNumbers();
        list2.addNumber(0.0);
        list2.addNumber(1.0);

        ListOfNumbers list3 = new ListOfNumbers();
        list3.addNumber(100d);

        ListOfNumbers result1 = findWithMaxAverage(list1, list2, list3);
        ListOfNumbers result2 = findWithMaxAverage(list1, list2);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static ListOfNumbers findWithMaxAverage(ListOfNumbers... listOfLists) {
        int indexOfBiggest = 0;
        Double maxAverage = listOfLists[indexOfBiggest].getAverage();

        for (int i = 0; i < listOfLists.length; i++) {
            Double currentAverage = listOfLists[i].getAverage();
            if (currentAverage > maxAverage) {
                indexOfBiggest = i;
                maxAverage = currentAverage;
            }
        }
        return listOfLists[indexOfBiggest];
    }
}

