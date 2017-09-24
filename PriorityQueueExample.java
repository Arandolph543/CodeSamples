public class PriorityQueueExample
{
    public static void main(String[] args)
    {
        //Creating a PriorityQueue with default Comparator.
 
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
 
        //Inserting elements into pQueue.
 
        pQueue.offer(21);
 
        pQueue.offer(17);
 
        pQueue.offer(37);
 
        pQueue.offer(41);
 
        pQueue.offer(9);
 
        pQueue.offer(67);
 
        pQueue.offer(31);
 
        //Removing the head elements
 
        System.out.println(pQueue.poll());     //Output : 9
 
        System.out.println(pQueue.poll());     //Output : 17
 
        System.out.println(pQueue.poll());     //Output : 21
 
        System.out.println(pQueue.poll());     //Output : 31
 
        System.out.println(pQueue.poll());     //Output : 37
 
        System.out.println(pQueue.poll());     //Output : 41
 
        System.out.println(pQueue.poll());     //Output : 67
    }
}
//Employee Class
 
class Employee
{
    String name;
 
    int salary;
 
    //Constructor Of Employee
 
    public Employee(String name, int salary)
    {
        this.name = name;
 
        this.salary = salary;
    }
 
    @Override
    public String toString()
    {
        return name+" : "+salary;
    }
}
 
//MyComparator Class
 
class MyComparator implements Comparator<Employee>
{
    @Override
    public int compare(Employee e1, Employee e2)
    {
        return e1.salary - e2.salary;
    }
}
