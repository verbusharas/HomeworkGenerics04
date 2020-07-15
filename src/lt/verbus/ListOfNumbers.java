package lt.verbus;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    private List<Double> list;

    public ListOfNumbers() {
        this.list = new ArrayList<>();
    }

    public void addNumber(Double number) {
        list.add(number);
    }

    public Double getAverage(){
        if (list.size()>0) {
            if (list.size()==1) {
                return list.get(0);
            } else {
                Double sum = 0.0;
                for (Double number: list) {
                    sum += number;
                }
                return sum/list.size();
            }
        } else return null;
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "list=" + list +
                '}';
    }
}
