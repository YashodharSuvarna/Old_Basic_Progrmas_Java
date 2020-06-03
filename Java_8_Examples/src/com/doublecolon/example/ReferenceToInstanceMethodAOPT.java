package com.doublecolon.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ReferenceToInstanceMethodAOPT {
	 
    /**
     * @param args the command line arguments
     */
 
     private static class Person {
 
            private final String name;
            private final int age;
 
 
            public Person(String name, int age) {
                this.name = name;
                this.age = age;
 
            }
 
            public String getName() {
                return name;
            }
 
            public int getAge() {
                return age;
            }
 
 
        }
    public static void main(String[] args) {
        // TODO code application logic here
        List<Person> persons = new ArrayList<Person>();
            persons.add(new Person("Albert", 80));
            persons.add(new Person("Ben", 15));
            persons.add(new Person("Charlote", 20));
            persons.add(new Person("Dean", 6));
            persons.add(new Person("Elaine", 17));
            
          //.forEach(System.out(Persons)::printf(getAge));
            
            persons.forEach(s-> System.out.println(s.getAge()));
 
            List<Integer> allAges = ReferenceToInstanceMethodAOPT.listAllAges(persons, Person::getAge);
            System.out.println("Printing out all ages \n"+allAges);
    }
 
 
    private static List<Integer> listAllAges(List<Person> person, Function<Person, Integer> f){
        List<Integer> result = new ArrayList<Integer>();
        person.forEach(x -> result.add(f.apply((Person)x)));
        return result;
    }
}

/*Lambda Form	List allAges = ReferenceToInstanceMethodAOPT.listAllAges(persons, x -> x.getAge());
Method Reference	List allAges = ReferenceToInstanceMethodAOPT.listAllAges(persons, Person::getAge);*/