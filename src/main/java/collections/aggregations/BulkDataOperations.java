package collections.aggregations;

import model.Person;
import model.Transaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class BulkDataOperations {

        public static void main(String... args) {

            // Create sample data

            List<Person> persons = Person.createList();

            // 1. Print names of members, for-each loop

            System.out.println("Members of the collection (for-each loop):");
            for (Person p : persons) {
                System.out.println(p.getName());
            }

            // 2. Print names of members, forEach operation

            System.out.println("Members of the collection (bulk data operations):");
            persons
                    .stream()
                    .forEach(e -> System.out.println(e.getName()));

            // 3. Print names of male members, forEach operation

            System.out.println(
                    "Male members of the collection (bulk data operations):");
            persons
                    .stream()
                    .filter(e -> e.getGender() == Person.Sex.MALE)
                    .forEach(e -> System.out.println(e.getName()));

            // 4. Print names of male members, for-each loop

            System.out.println("Male members of the collection (for-each loop):");
            for (Person p : persons) {
                if (p.getGender() == Person.Sex.MALE) {
                    System.out.println(p.getName());
                }
            }

            // 5. Get average age of male members of the collection:

            double average = persons
                    .stream()
                    .filter(p -> p.getGender() == Person.Sex.MALE)
                    .mapToInt(Person::getAge)
                    .average()
                    .getAsDouble();

            System.out.println(
                    "Average age of male members (bulk data operations): " +
                            average);


            List<Transaction> transactions = new ArrayList<>();

            List<Transaction> groceryTransactions = new ArrayList<>();
            for(Transaction t: transactions){
                if(t.getTransactionType() == Transaction.TransactionType.GROCERY){
                    groceryTransactions.add(t);
                }
            }
            Collections.sort(groceryTransactions, new Comparator<Transaction>(){
                public int compare(Transaction t1, Transaction t2){
                    return t2.getValue().compareTo(t1.getValue());
                }
            });
            List<Integer> transactionIds = new ArrayList<>();
            for(Transaction t: groceryTransactions){
                transactionIds.add(t.getId());
            }

            List<Integer> transactionsIds =
                    transactions.stream()
                            .filter(t -> t.getTransactionType() == Transaction.TransactionType.GROCERY)
                            .sorted(comparing(Transaction::getValue).reversed())
                            .map(Transaction::getId)
                            .collect(toList());
        }
    }