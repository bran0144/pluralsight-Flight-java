package com.target.learning;

public class Passenger extends Person implements Comparable<Passenger> {

        private int memberLevel;
        private int memberDays;

        public int compareTo(Passenger p) {
            if(memberLevel > p.memberLevel)
                return -1;
            else if(memberLevel < p.memberLevel)
                return 1;
            else {
                if(memberDays > p.memberDays)
                    return -1;
                else if(memberDays < p.memberDays)
                    return 1;
                else return 0;
            }
    }
}
