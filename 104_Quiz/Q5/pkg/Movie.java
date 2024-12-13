package pkg;

public class Movie{

String name;
double rating;
int numrating;
int revenue;

 public Movie(){
     name = "Avengers";
     rating = 8.0;
     numrating = 33;
     revenue = 623357910;
}


public Movie(String name, double rating, int numerating, int revenue){
   this.name = name;
   this.rating = rating;
   this.numrating = numrating;
   this.revenue = revenue;
    
}

public void movieToString(){
    System.out.println("Movie:" + name);
    System.out.println("Rating:" + rating);
    System.out.println("Number of ratings:" + numrating);
    System.out.println("Revenue:" + revenue);
    System.out.println("");
}

public String getMovieName(){
    return name;
}

public int getRevenue(){
    return revenue;
    
}

public void  addRating(double num){
    double rating1 = rating * numrating;
    double rating2 = rating1 + num;
    double rating3 = rating2 / (numrating + 1);
    rating = rating3;
    numrating = numrating + 1;
    
}

public boolean compareRatings(Movie a){
    if(this.rating > rating){
        return true;
    }
    
    else{
        return false;
    }
   
    
    
}



}
