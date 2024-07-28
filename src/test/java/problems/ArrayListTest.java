package problems;
import org.junit.Assert;
import org.junit.Test;

public class ArrayListTest {
    ArrayList<Integer> intList;
    ArrayList<String> strList;

    @Test
    public void initTest(){
        intList = new ArrayList<>();
        Assert.assertEquals("[]", intList.toString());

        strList = new ArrayList<>(new String[]{"He", "Plop"});
        Assert.assertEquals("[He, Plop]", strList.toString());
    }

    @Test
    public void addTest(){
        intList = new ArrayList<>(new Integer[]{0,1,2,3,4});
        intList.add(5);
        Assert.assertEquals("[0, 1, 2, 3, 4, 5]", intList.toString());

        strList.add("Dog");
        Assert.assertEquals("[Dog]", strList.toString());
    }

    @Test
    public void insertTest(){
        intList = new ArrayList<>(new Integer[]{0,1,2,3,4});
        intList.insert(3, 2);
        Assert.assertEquals("[0, 1, 3, 2, 3, 4]", intList.toString());
    }

    @Test
    public void replaceTest(){
        intList = new ArrayList<>(new Integer[]{0,1,2,3,4});
        intList.replace(2,3);
        Assert.assertEquals("[0, 1, 2, 2, 4]", intList.toString());

        intList.replace(1,0);
        Assert.assertEquals("[1, 1, 2, 2, 4]", intList.toString());
    }

    @Test
    public void sizeTest(){
        intList = new ArrayList<>(new Integer[]{0,1,2,3,4,5});
        Assert.assertEquals(6, intList.size());
    }

    @Test
    public void containsTest(){
        intList = new ArrayList<>(new Integer[]{0,1,2,3,4,5});
        Assert.assertTrue(intList.contains(3));
        Assert.assertFalse(intList.contains(9));
    }

    @Test
    public void getTest(){
        strList = new ArrayList<>(new String[]{"I", "Am", "Great"});
        Assert.assertEquals("Great", strList.get(2));
    }

    @Test
    public void indexTest(){
        strList = new ArrayList<>(new String[]{"I", "Am", "Great"});
        Assert.assertEquals(2, strList.index("Great"));
    }

    @Test
    public void removeIndexTest(){
        strList = new ArrayList<>(new String[]{"I", "Am", "Great"});
        strList.removeAtindex(1);
        Assert.assertEquals("[I, Great]", strList.toString());
    }

    @Test
    public void removeTest(){
        strList = new ArrayList<>(new String[]{"I", "Am", "Great"});
        strList.remove("Am");
        Assert.assertEquals("[I, Great]", strList.toString());
    }
}
