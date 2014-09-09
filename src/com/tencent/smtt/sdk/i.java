package com.tencent.smtt.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

final class i extends Handler
{
  i(h paramh, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 100:
    }
    while (true)
    {
      return;
      Properties localProperties = new Properties();
      localProperties.setProperty("timestamp", e.bds());
      try
      {
        localProperties.store(new FileOutputStream(new File(h.a(this.kee), "x5.prop")), null);
        label71: if (h.b(this.kee) != null)
        {
          h.b(this.kee).quit();
          h.c(this.kee);
        }
        if (h.d(this.kee) == null)
          continue;
        h.e(this.kee);
        return;
      }
      catch (IOException localIOException)
      {
        break label71;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        break label71;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.i
 * JD-Core Version:    0.6.2
 */