package IntroToStreamsLambda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        List<Employee> list=new ArrayList<>();
        Employee e1=new Employee(101,"Hari",100000);
        Employee e2=new Employee(102,"Krishna",80000);
        Employee e3=new Employee(103,"Ram",70000);
        Employee e4=new Employee(104,"Murali",25000);
        Employee e5=new Employee(105,"Biswa",30000);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        Stream<Employee> st=list.stream();
        
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        System.out.println(date+" "+time);

        Stream.of(e1,e2,e3,e4,e5).filter((ele)->ele.getSalary()>50000).forEach((ele)->System.out.println(ele.getEmpName()));
        Stream<Employee> s=list.stream();
       s.filter((emp)->{
            return emp.getSalary() < 50000;
        }).sorted((emp1,emp2)->{
            return (int)(emp1.getSalary()-emp2.getSalary());
        }).mapToInt((emp)->{
            return emp.getSalary()+emp.getSalary();
        }).forEach((ele)->System.out.print(ele));
        List<Integer> l=List.of(20,25,10,15,20,25,30);

        //Sorting in one line
        Stream<Integer> s3=l.stream();
        s3.sorted().forEach((ele)->System.out.print(ele+" "));
        System.out.println();

        //Predicate Joining
        Predicate<Integer> p1=i->i>10;
        Predicate<Integer> p2=i->i%2==0;
        print(p1,l);
        print(p2,l);
        print(p1.negate(),l); // condition get negeted
        print(p2.negate(),l);
        print(p1.or(p2),l); // two conditon get merged and formed like number sghould divisible by 2 or greater than 10
        print(p1.and(p2),l);
        //Same operation without predicate joining
        Stream<Integer> s1=l.stream();
        List<Integer> ans=s1.filter((ele)->{
            return ele>10 || ele%2==0;
        }).collect(Collectors.toList());
        ans.forEach((ele)-> System.out.print(ele+" "));
        System.out.println();
        //Removing duplicates from a stream
        //List<Integer> l=List.of(20,25,10,15,20,25,30);
        Stream<Integer> s5=l.stream();
        Set<Integer> set=new HashSet<>();
        s5.filter((ele)-> !set.add(ele)).forEach((ele)->System.out.print(ele+" "));
        //peek method
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
        //of method
        System.out.println("of method");
        Stream.of(12,25,13,18,20,30).limit(5).filter(e->e%2==0).sorted((num1,num2)->{
            return num2-num1;
                }).
                peek(e->System.out.println("filterd value "+ e))
                ;
        //Reduce method
        int x=Stream.of(23,24,25,52,63,78).reduce(Integer.MAX_VALUE,Integer::min);
        System.out.println(x);
//        if(x.isPresent()){
//            System.out.print(x.get());
//        }
        Optional<Integer> op=Stream.of(45,67,65,80,92).reduce(Integer::max);
        if(op.isPresent()) System.out.println(op.get()+" ");
        Integer op1=Stream.of(45,67,65,80,92).reduce(Integer::max).orElse(-1);
        System.out.println(op1+" ");
        Integer op2=Stream.of(45,67,65,80,92).reduce(Integer.MIN_VALUE,Integer::max);
        System.out.println(op2+" ");

        System.out.println("This is FlatMap");
        List<Integer> l1= Arrays.asList(2,3,4,5);
        List<Integer> l2=Arrays.asList(7,9,3,10);
        List<Integer> l3=Arrays.asList(9,5,6,12);
        List<List<Integer>> list34=Arrays.asList(l1,l2,l3);
        list34.stream().flatMap(abc->abc.stream()).filter(ele->ele%2==0).forEach(System.out::println);
    }
    public static void print(Predicate<Integer> p,List<Integer> l){
        for(Integer x:l) {
            if (p.test(x)) {
                System.out.print(x + " ");
            }
        }
    }
}
