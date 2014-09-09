package c.a.f;

import java.util.Random;

public final class d
  implements c
{
  private e kmC = new e();

  private Long bfV()
  {
    return Long.valueOf(Long.valueOf(System.currentTimeMillis()).longValue() / 1000L);
  }

  public final String bfT()
  {
    return String.valueOf(bfV());
  }

  public final String bfU()
  {
    long l = bfV().longValue();
    return String.valueOf(l + Integer.valueOf(new Random().nextInt()).intValue());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.f.d
 * JD-Core Version:    0.6.2
 */