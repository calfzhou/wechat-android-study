package oicq.wlogin_sdk.a;

import java.io.Serializable;
import java.util.TreeMap;
import oicq.wlogin_sdk.c.f;
import oicq.wlogin_sdk.sharemem.WloginSimpleInfo;

public final class c
  implements Serializable, Cloneable
{
  public WloginSimpleInfo kiY = new WloginSimpleInfo();
  public TreeMap kiZ = new TreeMap();
  public long kja = 0L;

  public final c beK()
  {
    try
    {
      c localc = (c)clone();
      return localc;
    }
    catch (Exception localException)
    {
      f.AY(localException.toString());
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.c
 * JD-Core Version:    0.6.2
 */