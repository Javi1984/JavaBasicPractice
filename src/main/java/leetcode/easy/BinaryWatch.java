package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {

    public List<String> readBinaryWatch(int turnedOn){
        List<java.lang.String> times = new ArrayList<>();

        for(int h =0; h<12; h++){
            for(int m=0; m<60; m++){
                if(Integer.bitCount(h) + Integer.bitCount(m) == turnedOn){
                    if(m<10){
                        times.add(String.format("%d:0%d", h, m));
                    }else{
                        times.add(String.format("%d:%d", h, m));
                    }
                }

            }
        }
        return times;
    }
}
