package Stones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StoneSet {
    List<Stone> list = new ArrayList<>();
    LinkedElement head;
    LinkedElement tail;


    class LinkedElement{
        LinkedElement next;
        LinkedElement prev;
        Stone stone;

        public LinkedElement(Stone stone){
            this.stone = stone;
        }
    }

    public void addStone (Stone stone) {
        LinkedElement newStone = new LinkedElement(stone);

        if (head == null) {
            head = tail = newStone;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newStone;
            newStone.prev = tail;
            tail = newStone;
            tail.next = null;
        }
    }
}
