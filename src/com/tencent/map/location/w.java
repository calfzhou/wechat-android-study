package com.tencent.map.location;

import android.os.Message;

final class w extends Thread
{
  private String Lx = null;
  private String MY = null;
  private String No = null;

  public w(s params, String paramString)
  {
    this.Lx = paramString;
    StringBuilder localStringBuilder = new StringBuilder();
    if (s.i(params) == 0);
    for (String str = "http://lstest.map.soso.com/loc?c=1"; ; str = "http://lbs.map.qq.com/loc?c=1")
    {
      this.MY = (str + "&mars=" + s.j(params));
      return;
    }
  }

  private String a(byte[] paramArrayOfByte, String paramString)
  {
    s.a(this.Me, System.currentTimeMillis());
    StringBuffer localStringBuffer = new StringBuffer();
    try
    {
      localStringBuffer.append(new String(paramArrayOfByte, paramString));
      return localStringBuffer.toString();
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final void run()
  {
    Message localMessage = new Message();
    localMessage.what = 8;
    int i;
    try
    {
      byte[] arrayOfByte2 = ac.b(this.Lx.getBytes());
      s.a(this.Me, true);
      ah localah2 = c.a(this.MY, "SOSO MAP LBS SDK", arrayOfByte2);
      s.a(this.Me, false);
      this.No = a(ac.c(localah2.LH), localah2.Lx);
      if (this.No != null)
      {
        localMessage.arg1 = 0;
        localMessage.obj = this.No;
      }
      while (true)
      {
        s.d(this.Me).sendMessage(localMessage);
        return;
        localMessage.arg1 = 1;
      }
    }
    catch (Exception localException1)
    {
      i = 0;
    }
    while (true)
      while (true)
      {
        i++;
        if (i <= 3);
        try
        {
          sleep(1000L);
          byte[] arrayOfByte1 = ac.b(this.Lx.getBytes());
          s.a(this.Me, true);
          ah localah1 = c.a(this.MY, "SOSO MAP LBS SDK", arrayOfByte1);
          s.a(this.Me, false);
          this.No = a(ac.c(localah1.LH), localah1.Lx);
          if (this.No != null)
          {
            localMessage.arg1 = 0;
            localMessage.obj = this.No;
          }
          else
          {
            localMessage.arg1 = 1;
            continue;
            s.a(this.Me, false);
            localMessage.arg1 = 1;
          }
        }
        catch (Exception localException2)
        {
        }
      }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.w
 * JD-Core Version:    0.6.2
 */