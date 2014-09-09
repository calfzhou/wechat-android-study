package com.tencent.map.location;

public final class e extends Thread
{
  public e(c paramc)
  {
  }

  public final void run()
  {
    try
    {
      byte[] arrayOfByte2 = ac.b(this.Ln.Lx.getBytes());
      c.a(this.Ln, true);
      ah localah2 = c.a("http://ls.map.soso.com/deflect?c=1", "SOSO MAP LBS SDK", arrayOfByte2);
      c.a(this.Ln, false);
      byte[] arrayOfByte3 = ac.c(localah2.LH);
      c.a(this.Ln, arrayOfByte3, localah2.Lx);
      return;
    }
    catch (Exception localException1)
    {
      do
      {
        int i = 0;
        while (true)
        {
          i++;
          if (i > 3)
            break;
          try
          {
            sleep(2000L);
            ah localah1 = c.a("http://ls.map.soso.com/deflect?c=1", "SOSO MAP LBS SDK", ac.b(this.Ln.Lx.getBytes()));
            c.a(this.Ln, false);
            byte[] arrayOfByte1 = ac.c(localah1.LH);
            c.a(this.Ln, arrayOfByte1, localah1.Lx);
            return;
          }
          catch (Exception localException2)
          {
          }
        }
        c.a(this.Ln, false);
      }
      while (c.a(this.Ln) == null);
      c.a(this.Ln).a(360.0D, 360.0D);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.e
 * JD-Core Version:    0.6.2
 */