import java.util.*;

public class PairRandomizer {

    private List<String> randomizedList;


    public PairRandomizer() {
        randomizedList = new LinkedList<>();
    }


    public String assignPairs(List<String> firstList, List<String> secondList, boolean randOrder){

        System.out.println("First List:");
        firstList.forEach(System.out::println);
        System.out.println("Second List:");
        secondList.forEach(System.out::println);

        randomizedList.clear();

        LinkedList<String> internalFirstList = new LinkedList<>(firstList);
        LinkedList<String> internalSecondList = new LinkedList<>(secondList);

        Random r = new Random();

        int secondIndex;
        int firstIndex;


        for (int i = 0; i < firstList.size(); i++) {

            if (internalSecondList.size() == 0){
                randomizedList.add("WARNING\n" +
                        "Less items in second array than in first, assigning unique items is not possible. Class randomization is reset." +
                        "\n\n");
                internalSecondList = new LinkedList<>(secondList);
            }

                firstIndex = randOrder? r.nextInt(internalFirstList.size()) : 0;
//                firstIndex = r.nextInt(internalFirstList.size());
                secondIndex = r.nextInt(internalSecondList.size());


                randomizedList.add(String.format("%s @ %s\n", internalFirstList.get(firstIndex), internalSecondList.get(secondIndex)));
                internalSecondList.remove(secondIndex);
                internalFirstList.remove(firstIndex);

        }

        StringBuilder sb = new StringBuilder();
        for (String pair : randomizedList){
            sb.append(pair);
        }

        return sb.toString();

    }


}
