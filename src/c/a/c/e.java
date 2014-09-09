package c.a.c;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class e
  implements d
{
  public final String a(c.a.d.c paramc)
  {
    c.a.g.d.b(paramc, "Cannot extract a header from a null object");
    if ((paramc.bfD() == null) || (paramc.bfD().size() <= 0))
      throw new c.a.b.c(paramc);
    Map localMap = paramc.bfD();
    StringBuffer localStringBuffer = new StringBuffer(20 * localMap.size());
    localStringBuffer.append("OAuth ");
    Iterator localIterator = localMap.keySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return localStringBuffer.toString();
      String str = (String)localIterator.next();
      if (localStringBuffer.length() > 6)
        localStringBuffer.append(", ");
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = str;
      arrayOfObject[1] = c.a.g.c.encode((String)localMap.get(str));
      localStringBuffer.append(String.format("%s=\"%s\"", arrayOfObject));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.c.e
 * JD-Core Version:    0.6.2
 */