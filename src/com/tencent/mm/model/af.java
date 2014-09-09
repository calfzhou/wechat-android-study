package com.tencent.mm.model;

import android.os.Message;
import com.tencent.mm.a.c;
import com.tencent.mm.network.be;
import com.tencent.mm.network.k;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

final class af extends Thread
{
  boolean dkw = true;

  af(aa paramaa)
  {
  }

  public final void run()
  {
    this.dkw = false;
    int i = 0;
    while (true)
    {
      if (!this.dkw)
      {
        if (i > 10)
          this.dkw = true;
      }
      else
        return;
      try
      {
        localae = (ae)aa.a(this.dks).poll(500L, TimeUnit.MILLISECONDS);
        if (localae != null)
        {
          boolean bool = ch.jb(localae.url);
          if (!bool);
        }
        else
        {
          i++;
        }
      }
      catch (Exception localException1)
      {
        int j;
        try
        {
          ae localae;
          z.d("!32@/B4Tb64lLpINwg6pdiU5D99hnbItqI3s", "Thread get :" + localae.url + " file:" + localae.filename);
          if (c.ac(localae.filename))
          {
            z.d("!32@/B4Tb64lLpINwg6pdiU5D99hnbItqI3s", "Thread exist file:" + localae.filename);
            i = 0;
            continue;
          }
          be localbe = k.jr(localae.url);
          localbe.setUseCaches(true);
          localbe.setConnectTimeout(3000);
          localbe.setReadTimeout(3000);
          InputStream localInputStream = localbe.getInputStream();
          byte[] arrayOfByte = new byte[1024];
          FileOutputStream localFileOutputStream = new FileOutputStream(localae.filename + ".tmp");
          while (true)
          {
            int k = localInputStream.read(arrayOfByte);
            if (k == -1)
              break;
            localFileOutputStream.write(arrayOfByte, 0, k);
          }
          localFileOutputStream.close();
          localInputStream.close();
          new File(localae.filename + ".tmp").renameTo(new File(localae.filename));
          Message localMessage = new Message();
          localMessage.obj = localae;
          localMessage.arg1 = localae.pos;
          this.dks.gQj.sendMessage(localMessage);
          i = 0;
          continue;
          localException1 = localException1;
          j = i;
        }
        catch (Exception localException2)
        {
          j = 0;
        }
        i = j;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.af
 * JD-Core Version:    0.6.2
 */