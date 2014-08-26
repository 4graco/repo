package com.topcoder.round603;

import java.util.ArrayList;
import java.util.List;

public class MiddleCode {

    public String encode(String s) {
        char[] a = s.toCharArray();
        List<Character> l = new ArrayList<>();
        for (char c : a) {
            l.add(c);
        }
        List<Character> t = new ArrayList<>();
        while (!l.isEmpty()) {
            if (l.size() % 2 == 0) {
                int idx = l.size() / 2 - 1;
                char c = l.get(idx).charValue();
                char cc = l.get(idx + 1).charValue();
                if (c <= cc) {
                    t.add(c);
                    l.remove(idx);
                } else {
                    t.add(cc);
                    l.remove(idx + 1);
                }
            } else {
                int idx = l.size() / 2;
                char c = l.get(idx).charValue();
                t.add(c);
                l.remove(idx);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : t) {
            sb.append(c);
        }
        return sb.toString();
    }
}
