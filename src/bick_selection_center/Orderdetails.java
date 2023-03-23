
package bick_selection_center;

public class Orderdetails {
    private String name;
    private String color;
    private float cost;
    
    private String feature1;
    private String feature2;
    private String feature3;
    
    private int fea_cost;
    
    
    public void Display(){
        System.out.println("---------Order Details---------");
        System.out.println("Bick name              Color          cost");
        System.out.println(name + "        " + color + "           " + cost + " Lakh");
        System.out.println("Additional Features :");
        System.out.println("Breaking Features :");
        System.out.println(feature1 +"                            " + fea_cost +  "Thousand");
        System.out.println("Engine Features :");
        System.out.println(feature2 +"                            " + fea_cost +  "Thousand");
        System.out.println("Bike Categories :");
        System.out.println(feature3 +"                            " + fea_cost +  "Thousand");
        System.out.println("Total Cost :                      " +(int) cost+fea_cost + " Taka Only");
        System.out.println("");
        System.out.println("****Thank you For Visit us****");
    }
    
    public int getfea_cost()
    {
        return fea_cost;
    }
    public void setfea_cost(int fea_cost)
    {
        this.fea_cost = fea_cost;
    }
    
    public String getfeature1()
    {
        return feature1;
    }
    public void setfeature1(String feature1)
    {
        this.feature1 = feature1;
    }
    
    public String getfeature2()
    {
        return feature2;
    }
    public void setfeature2(String feature2)
    {
        this.feature2 = feature2;
    }
    
    public String getfeature3()
    {
        return feature3;
    }
    public void setfeature3(String feature3)
    {
        this.feature3 = feature3;
    }
    
    public float getcost()
    {
        return cost;
    }
    
    public void setcost(float cost)
    {
        this.cost = cost;
    }
    
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    
    public String getcolor()
    {
        return color;
    }
    
    public void setcolor(String color)
    {
        this.color = color;
    }

}
