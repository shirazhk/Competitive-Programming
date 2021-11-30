import java.util.*;
public class firstCharacterThatOccursTwice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = s.next();
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                Integer val = map.get(str.charAt(i));
                map.put(str.charAt(i),val+1);
            }
            else
            {
                map.putIfAbsent(str.charAt(i), 1);
            }
        }//elements put into map with frequency values
        boolean charOccursTwice = false;
        for(Map.Entry<Character, Integer> e:map.entrySet())
        {
            if(e.getValue()==2 && e.getKey()!=str.charAt(str.length()-1))
            {
                System.out.println("First character to occur twice: "+e.getKey());
                charOccursTwice = true;
                break;
            }
        }
        if(charOccursTwice==false)
        {
            System.out.println("No element occurs twice.");
        }//printing message if no character occurs twice
    }
}
