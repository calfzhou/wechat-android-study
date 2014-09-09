package com.tencent.mm.ah;

import android.os.Looper;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.qqpinyin.voicerecoapi.a;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class k
  implements br
{
  private a dDF = null;
  private FileOutputStream dDG = null;
  private BlockingQueue dDH = new ArrayBlockingQueue(1024);
  private String filename = null;

  public final boolean hy(String paramString)
  {
    z.e("!12@nLQl5Xo8bwA=", "init ");
    this.dDH.clear();
    this.filename = (c.getPrefix() + paramString);
    return true;
  }

  public final boolean rD()
  {
    z.d("!12@nLQl5Xo8bwA=", "doEncode  ");
    String str = bg.qW().ph();
    n localn;
    byte[] arrayOfByte;
    Object localObject1;
    Object localObject2;
    try
    {
      z.e("!12@nLQl5Xo8bwA=", "path " + str);
      File localFile = new File(str);
      if (!localFile.exists())
        localFile.mkdir();
      this.dDG = new FileOutputStream(new File(str + this.filename + ".temp"));
      this.dDF = new a();
      int i = this.dDF.bdl();
      if (i != 0)
        z.e("!12@nLQl5Xo8bwA=", "speexInit failed :" + i);
      while (true)
      {
        if (this.dDH.size() <= 0)
          break label362;
        localn = (n)this.dDH.poll();
        if ((this.dDF != null) && (localn.buf != null) && (localn.ddA > 0))
          try
          {
            if ((localn.buf != null) && (localn.ddA > 0))
            {
              arrayOfByte = this.dDF.q(localn.buf, localn.ddA);
              StringBuilder localStringBuilder1 = new StringBuilder(" pcmlen(short): inSpeexBuffer:");
              if (localn.buf != null)
                break;
              localObject1 = "null";
              StringBuilder localStringBuilder2 = localStringBuilder1.append(localObject1).append(" outSpeexBuf:");
              if (arrayOfByte != null)
                break label347;
              localObject2 = "null";
              label277: z.d("!12@nLQl5Xo8bwA=", localObject2);
              if ((arrayOfByte != null) && (arrayOfByte.length > 0))
              {
                this.dDG.write(arrayOfByte);
                this.dDG.flush();
              }
            }
          }
          catch (Exception localException4)
          {
          }
      }
    }
    catch (Exception localException1)
    {
      z.e("!12@nLQl5Xo8bwA=", "filename open failed");
    }
    while (true)
    {
      return true;
      localObject1 = localn.buf;
      break;
      label347: Integer localInteger = Integer.valueOf(arrayOfByte.length);
      localObject2 = localInteger;
      break label277;
      label362: if (this.dDF != null)
      {
        this.dDF.bdm();
        this.dDF = null;
      }
      if (this.dDG != null);
      try
      {
        this.dDG.close();
        label396: this.dDG = null;
        try
        {
          new File(str + this.filename + ".temp").renameTo(new File(str + this.filename + ".spx"));
          label471: e.zQ().start();
        }
        catch (Exception localException2)
        {
          break label471;
        }
      }
      catch (Exception localException3)
      {
        break label396;
      }
    }
  }

  public final boolean rE()
  {
    return false;
  }

  public final void stop()
  {
    z.e("!12@nLQl5Xo8bwA=", "stop ");
    new cm(Looper.getMainLooper()).post(new l(this));
  }

  public final void w(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder("pushBuf ");
    if (paramArrayOfByte == null);
    for (Object localObject = "null"; ; localObject = Integer.valueOf(paramArrayOfByte.length))
    {
      z.e("!12@nLQl5Xo8bwA=", localObject);
      z.d("!12@nLQl5Xo8bwA=", "push into queue queueLen:" + this.dDH.size());
      if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
        this.dDH.add(new n(paramArrayOfByte, paramArrayOfByte.length));
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.k
 * JD-Core Version:    0.6.2
 */