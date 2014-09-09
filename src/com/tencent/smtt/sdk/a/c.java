package com.tencent.smtt.sdk.a;

import android.os.Build.VERSION;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

final class c extends Thread
{
  c(String paramString, a.a parama)
  {
    super(paramString);
  }

  public final void run()
  {
    if (b.kfl == null);
    try
    {
      b.kfl = "65dRa93L".getBytes("utf-8");
      label16: if (b.kfl == null);
      while (true)
      {
        return;
        try
        {
          HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL("http://p.mb.qq.com/thirdapp").openConnection();
          localHttpURLConnection.setRequestMethod("POST");
          localHttpURLConnection.setDoOutput(true);
          localHttpURLConnection.setDoInput(true);
          localHttpURLConnection.setUseCaches(false);
          localHttpURLConnection.setConnectTimeout(20000);
          if (Build.VERSION.SDK_INT > 13)
            localHttpURLConnection.setRequestProperty("Connection", "close");
          try
          {
            byte[] arrayOfByte3 = b.b(this.kfm).toString().getBytes("utf-8");
            arrayOfByte1 = arrayOfByte3;
            if (arrayOfByte1 == null)
              continue;
            byte[] arrayOfByte2 = a.h(b.kfl, arrayOfByte1);
            localHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            localHttpURLConnection.setRequestProperty("Content-Length", String.valueOf(arrayOfByte2.length));
            try
            {
              OutputStream localOutputStream = localHttpURLConnection.getOutputStream();
              localOutputStream.write(arrayOfByte2);
              localOutputStream.flush();
              int i = localHttpURLConnection.getResponseCode();
              if (i != 200)
                continue;
              return;
            }
            catch (Throwable localThrowable)
            {
            }
          }
          catch (Exception localException)
          {
            while (true)
              byte[] arrayOfByte1 = null;
          }
        }
        catch (IOException localIOException)
        {
        }
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label16;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.a.c
 * JD-Core Version:    0.6.2
 */