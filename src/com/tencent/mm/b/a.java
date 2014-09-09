package com.tencent.mm.b;

import com.tencent.mm.a.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;

public final class a
{
  private b cFh;
  private c cFi = null;

  public a(c paramc)
  {
    this.cFi = paramc;
  }

  public static a aj(String paramString)
  {
    int i = 0;
    if (paramString == null);
    while (true)
    {
      if (i < 8)
        label12: return null;
      try
      {
        File localFile = new File(paramString);
        boolean bool = localFile.exists();
        i = 0;
        if (bool)
        {
          i = (int)localFile.length();
          continue;
          b localb = b.g(b(paramString, i - 8, 8));
          if ((localb == null) || (localb.cFk < 0))
            break label12;
          a locala = new a(c.h(b(paramString, -8 + (i - localb.cFk), localb.cFk)));
          locala.cFh = localb;
          return locala;
        }
      }
      catch (Exception localException)
      {
      }
    }
    return null;
  }

  public static boolean ak(String paramString)
  {
    if (paramString == null);
    while (true)
    {
      return false;
      File localFile1 = new File(paramString);
      if (localFile1.exists())
      {
        a locala = aj(paramString);
        if ((locala != null) && (locala.cFi != null))
          try
          {
            byte[] arrayOfByte = { 0, 0 };
            File localFile2 = new File(paramString);
            if (localFile2.exists())
            {
              boolean bool = locala.cFi.hn().equalsIgnoreCase(f.a(localFile2, (int)(localFile1.length() - (8 + locala.cFh.cFk) - 2L), arrayOfByte));
              return bool;
            }
          }
          catch (Exception localException)
          {
          }
      }
    }
    return false;
  }

  private static byte[] b(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null)
      return null;
    File localFile = new File(paramString);
    if (!localFile.exists())
      return null;
    if (paramInt2 == -1);
    for (int i = (int)localFile.length(); ; i = paramInt2)
    {
      if (paramInt1 < 0)
        return null;
      if (i <= 0)
        return null;
      if (paramInt1 + i > (int)localFile.length())
        i = (int)localFile.length() - paramInt1;
      try
      {
        RandomAccessFile localRandomAccessFile = new RandomAccessFile(paramString, "r");
        byte[] arrayOfByte = new byte[i];
        long l = paramInt1;
        try
        {
          localRandomAccessFile.seek(l);
          localRandomAccessFile.readFully(arrayOfByte);
          localRandomAccessFile.close();
          return arrayOfByte;
        }
        catch (Exception localException2)
        {
          return arrayOfByte;
        }
      }
      catch (Exception localException1)
      {
        return null;
      }
    }
  }

  public final int d(File paramFile)
  {
    try
    {
      if (aj(paramFile.getAbsolutePath()) != null)
      {
        System.out.println("Error: duplicate append apk external info!");
        return -1;
      }
      byte[] arrayOfByte1 = this.cFi.toByteArray();
      byte[] arrayOfByte2 = new b(arrayOfByte1.length).getBytes();
      byte[] arrayOfByte3 = new byte[2];
      arrayOfByte3[0] = ((byte)((8 + arrayOfByte1.length) % 256));
      arrayOfByte3[1] = ((byte)((8 + arrayOfByte1.length) / 256));
      RandomAccessFile localRandomAccessFile = new RandomAccessFile(paramFile, "rw");
      localRandomAccessFile.seek(paramFile.length() - 2L);
      localRandomAccessFile.write(arrayOfByte3);
      localRandomAccessFile.close();
      FileOutputStream localFileOutputStream = new FileOutputStream(paramFile, true);
      localFileOutputStream.write(arrayOfByte1);
      localFileOutputStream.write(arrayOfByte2);
      localFileOutputStream.flush();
      localFileOutputStream.close();
      return 0;
    }
    catch (Exception localException)
    {
    }
    return -1;
  }

  public final c hl()
  {
    return this.cFi;
  }

  public final b hm()
  {
    return this.cFh;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.b.a
 * JD-Core Version:    0.6.2
 */