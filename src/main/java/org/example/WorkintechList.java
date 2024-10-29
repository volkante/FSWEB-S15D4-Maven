package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList {


    public WorkintechList() {
    }

    public boolean add(Object obj){
        if(this.contains(obj)){
            System.out.println("obj already exists");
            return false;
        } else {
            this.add(this.size(), obj);
            System.out.println("element added");
            return true;
        }
    }

    public void sort(){
        Collections.sort(this);
    }

    public boolean remove(Object obj){
        //if(obj instanceof Integer){
        //   Integer obj = obj;
        //}
        if(this.contains(obj)){
            System.out.println("true");
            int indexOfObj = indexOf(obj);
            System.out.println(indexOfObj);
            this.remove(indexOfObj);
            sort();
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }



    @Override
    public String toString() {
        return super.toString();
    }


}
