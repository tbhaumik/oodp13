package lombokdemo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private double score;
}

//    @Override
//    public String toString(){
//        return "Id = " + getId() + " Name: " + getName() + " Score: " + getScore();
//    }
//
//    @Override
//    public boolean equals(Object o){
//        if (o != null){
//            if (o instanceof Student)
//                return this.getId() == ((Student) o).getId();
//        }
//        return false;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getScore() {
//        return score;
//    }
//
//    public void setScore(double score) {
//        this.score = score;
//    }
