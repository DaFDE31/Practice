package problems;
import org.junit.Assert;
import org.junit.Test;

public class ArrayListTest {
    ArrayList<Integer> intList = new ArrayList<>();
    ArrayList<String> strList = new ArrayList<>();

    @Test
    public void initTest(){
        Assert.assertEquals("[]", intList.toString());

        strList = new ArrayList<>(new String[]{"He", "Plop"});
        Assert.assertEquals("[He, Plop]", strList.toString());
    }

    @Test
    public void addTest(){
        intList.add(5);
        Assert.assertEquals("[5]", intList.toString());

        strList.add("Dog");
        Assert.assertEquals("[Dog]", strList.toString());
    }
}
