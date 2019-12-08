package StringParsing;

import java.util.HashMap;

public class Try {
    public static void main(String[] args) {
        String s = "ef][][4#$%^&*()(*&^%$%^&^%$evfsndfklvnskdnfv7yt82 3qji']p[-076273 92-=fv";
        HashMap<String, Integer> map = new HashMap<>();
        char[] myArray = new char[s.length()];
        int z = 0;
        int a = 1;
        while (a <= s.length()) {
            myArray[z] = s.charAt(s.length() - a);
            z++;
            a++;
        }
        for (int i = 0; i < myArray.length; i++) {
            if (!map.containsKey(Character.toString(myArray[i]))) {
               map.put(Character.toString(myArray[i]), 1);
            } else {
                map.replace(Character.toString(myArray[i]), map.get(Character.toString(myArray[i])) + 1);
            }
        }
        map.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        }
    }

