package com.tencent.mm.af;

import android.graphics.Bitmap;
import com.tencent.mm.a.f;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.storage.e;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public final class b
{
  public static int e(String paramString, byte[] paramArrayOfByte)
  {
    String str = hi(paramString);
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(str);
      localFileOutputStream.write(paramArrayOfByte);
      localFileOutputStream.close();
      return 0;
    }
    catch (Exception localException)
    {
    }
    return -1;
  }

  public static String hi(String paramString)
  {
    return o.a(bg.qW().pa(), bg.qW().pb(), "qr_", f.d(paramString.getBytes()), ".png");
  }

  public static byte[] hj(String paramString)
  {
    String str = hi(paramString);
    try
    {
      RandomAccessFile localRandomAccessFile = new RandomAccessFile(str, "r");
      byte[] arrayOfByte = new byte[(int)localRandomAccessFile.length()];
      localRandomAccessFile.read(arrayOfByte);
      localRandomAccessFile.close();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static Bitmap yT()
  {
    int i = ch.a((Integer)bg.qW().oQ().get(66561));
    byte[] arrayOfByte = hj(x.pG());
    if ((arrayOfByte == null) || (i == 0))
      return null;
    return i.cB(arrayOfByte);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.b
 * JD-Core Version:    0.6.2
 */