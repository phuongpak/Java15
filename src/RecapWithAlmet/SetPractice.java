package RecapWithAlmet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1- How can you make the element unique with collection (American style)

    1- What is set ? what is the purpose of using it ? (Indian style)

    --> in my project, I was using set to make elements "UNIQUE" to prevent duplication which cause some technical and business issue.
    --> or : it is a way to store  unique elements only (shortcut answer)


    2- Can you tell me the types of collections?

    As much as I know since it has been a long time, I did not use on of them:
        ->we have List                                  **>Set
            ArrayList and LinkedList                    ->HashSet : a way to store the elements (UNIQUE) randomly
                                                         ->LinkedHashSet: Insertion order (unique)
                                                          ->TreeSet : Ascending order
                                        // **QUEUE: ANOTHER TYPE OF COLLECTION: NEVER USE//
    3-Can you explain the difference between Set and List ?

    ->SET                                                     ->LIST
        *-Only unique elements (no duplication))                     -it can store Duplicate elements
        -It has different sub-types(HashSet, LinkedSet, TreeSet)    -ArrayList, LinkedList
       **->THere is no indexing in SET************                  -It works mostly indexing


     */
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        Set<Integer> numbers2 = new LinkedHashSet<>();
        Set<Integer> numbers3 = new TreeSet<>();

        numbers.add(1);
        numbers.add(5);
        numbers.add(5);
        numbers.add(3);

        System.out.println(numbers);// no duplicate HashSet  it go "randomly" not go in order  [1, 3, 5]


        numbers2.add(1);
        numbers2.add(5);
        numbers2.add(5);
        numbers2.add(3);

        System.out.println(numbers2);//no duplicate LinkedHashSet : insertion [1, 5, 3] : mean the way how we put , it will show that way


        numbers3.add(1);
        numbers3.add(4);
        numbers3.add(3);
        numbers3.add(4);
        numbers3.add(5);
        numbers3.add(2);
        System.out.println(numbers3);// no duplicate TreeSet: ascending [1, 2, 3, 4, 5] : from small to bigger number






    }
}
