public class DogDriver
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);

        Dog dog2 = new Dog("Piper", 3, "Austrian Shepherd", 45);

        Dog dog3 = new Dog("doggy", 1, "cat", 25.12345);

        System.out.println(dog1.getName() + dog1.getAge());
        System.out.println(dog2.getWeight());
        System.out.println(dog3.getName() + ", " + dog3.getAge() + ", " + dog3.getBreed() + ", " + dog3.getWeight());
        System.out.println("Total Dogs:" + Dog.getDogCount());
        System.out.println();

        //5.3 output
        int compare = 0;
        compare = dog2.compareTo(dog1);
        if (compare < 0)
        {
            System.out.println(dog2.getName() + " is younger than " + dog1.getName());
        }
        if (compare > 0)
        {
            System.out.println(dog2.getName() + " is older than " + dog1.getName());
        }
        else if (compare == 0)
        {
            System.out.println(dog2.getName() + " and " + dog1.getName() + " have the same age.");
        }
        compare = dog1.compareTo(dog3);
        if (compare < 0)
        {
            System.out.println(dog1.getName() + " is younger than " + dog3.getName());
        }
        if (compare > 0)
        {
            System.out.println(dog1.getName() + " is older than " + dog3.getName());
        }
        else if (compare == 0)
        {
            System.out.println(dog1.getName() + " and " + dog3.getName() + " have the same age.");
        }
    }
}
