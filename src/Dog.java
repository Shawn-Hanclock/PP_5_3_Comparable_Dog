public class Dog implements Comparable
{
    private String name;
    private int age;
    private String breed;
    private double weight;
    private static int dogCount;

    public Dog(String name, int age, String breed, double weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        dogCount++;
    }
    public Dog()
    {
        this.name = "";
        this.age = 0;
        this.breed = "";
        this.weight = 0;
        dogCount++;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getBreed()
    {
        return breed;
    }
    public double getWeight()
    {
        return weight;
    }
    public static int getDogCount()
    {
        return dogCount;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String toString()
    {
        return "name: " + name + " age: " + age + " breed: " + breed + "weight in pounds: " + weight;
    }

    public double kiloWeight()
    {
        return weight * 0.454;
    }

    @Override
    public int compareTo(Object dog) {
        int output = 0;
        if(this.age < ((Dog)dog).getAge())
        {
            output = -1;
        }
        else if(this.age > ((Dog)dog).getAge())
        {
            output = 1;
        }
        return output;
    }
}
