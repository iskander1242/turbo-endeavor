package by.academy.week1;

        import org.junit.Assert;
        import org.junit.Test;

        import static by.academy.week1.Clerk.isGiveChange;

public class ClerkTest {

    @Test
    public void shouldAnswerWithTrue() {
        int[] banknotes1 = {25, 25, 50};
        int[] banknotes2 = {25, 25, 25, 100};
        int[] banknotes3 = {25, 25, 100};
        Assert.assertEquals(true, isGiveChange(banknotes1));
        Assert.assertEquals(true, isGiveChange(banknotes2));
        Assert.assertEquals(false, isGiveChange(banknotes3));
    }
}
