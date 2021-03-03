package com.target.learning;

public class Passenger implements Comparable{
        private int memberLevel;
        private int memberDays;
        public int compareTo(Object o) {
            Passenger p = (Passenger) o;
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
