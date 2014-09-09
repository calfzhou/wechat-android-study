package c.a.c;

import c.a.d.e;
import c.a.d.j;
import c.a.g.d;
import java.util.Map;

public final class c
  implements b
{
  public final String a(c.a.d.c paramc)
  {
    d.b(paramc, "Cannot extract base string from null object");
    if ((paramc.bfD() == null) || (paramc.bfD().size() <= 0))
      throw new c.a.b.c(paramc);
    String str1 = c.a.g.c.encode(paramc.bfF().name());
    String str2 = c.a.g.c.encode(paramc.bfK());
    e locale = new e();
    locale.a(paramc.bfE());
    locale.a(paramc.bfJ());
    locale.a(new e(paramc.bfD()));
    return String.format("%s&%s&%s", new Object[] { str1, str2, c.a.g.c.encode(locale.bfN().bfM()) });
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.c.c
 * JD-Core Version:    0.6.2
 */