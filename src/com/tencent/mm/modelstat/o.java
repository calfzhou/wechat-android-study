package com.tencent.mm.modelstat;

import com.tencent.mm.compatible.g.m;
import com.tencent.mm.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.util.ArrayList;

final class o
  implements Runnable
{
  o(n paramn)
  {
  }

  public final void run()
  {
    String str1 = this.dFe.dEC;
    int i = ch.a((Integer)this.dFe.dFd, -1);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(i);
    z.d("!44@/B4Tb64lLpJkLzARloA5ZGSGbaAu5WtPzk/47toY9aI=", "upload Date :%d", arrayOfObject1);
    if (ch.jb(str1))
    {
      z.e("!44@/B4Tb64lLpJkLzARloA5ZGSGbaAu5WtPzk/47toY9aI=", "error username");
      return;
    }
    if ((i > 7) || (i <= 0))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(i);
      z.e("!44@/B4Tb64lLpJkLzARloA5ZGSGbaAu5WtPzk/47toY9aI=", "error timespan :%d", arrayOfObject2);
      return;
    }
    if (!m.nI())
    {
      z.e("!44@/B4Tb64lLpJkLzARloA5ZGSGbaAu5WtPzk/47toY9aI=", "sdcard invalid.");
      return;
    }
    File[] arrayOfFile = new File(l.dEG).listFiles();
    if (arrayOfFile == null)
    {
      z.e("!44@/B4Tb64lLpJkLzARloA5ZGSGbaAu5WtPzk/47toY9aI=", "get file list failed");
      return;
    }
    ArrayList localArrayList = new ArrayList();
    long l1 = ch.CM() - 86400000L * i;
    int j = 0;
    int k = 0;
    while (j < arrayOfFile.length)
    {
      String str2 = arrayOfFile[j].getPath();
      File localFile2;
      if (!str2.endsWith("wd.ini"))
      {
        long l2 = d.hz(str2);
        if (l2 != -1L)
        {
          if (l2 > l1)
          {
            localArrayList.add(arrayOfFile[j]);
            k = (int)(k + arrayOfFile[j].length());
          }
          if (k > 128000)
            localFile2 = new File(l.dEG + ch.CM() + ".zip");
        }
      }
      try
      {
        com.tencent.mm.a.l.a(localArrayList, localFile2);
        Object[] arrayOfObject8 = new Object[1];
        arrayOfObject8[0] = Long.valueOf(localFile2.length());
        z.d("!44@/B4Tb64lLpJkLzARloA5ZGSGbaAu5WtPzk/47toY9aI=", "out zip file size:%d", arrayOfObject8);
        boolean bool2 = am.Z(localFile2.getPath(), str1);
        Object[] arrayOfObject9 = new Object[1];
        arrayOfObject9[0] = Boolean.valueOf(bool2);
        z.d("!44@/B4Tb64lLpJkLzARloA5ZGSGbaAu5WtPzk/47toY9aI=", "upload : %b", arrayOfObject9);
        localArrayList.clear();
        k = 0;
        j++;
      }
      catch (Exception localException2)
      {
        Object[] arrayOfObject7 = new Object[1];
        arrayOfObject7[0] = localException2.getMessage();
        z.e("!44@/B4Tb64lLpJkLzARloA5ZGSGbaAu5WtPzk/47toY9aI=", "zip file failed msg:%s ", arrayOfObject7);
        return;
      }
    }
    if (localArrayList.size() <= 0)
    {
      Object[] arrayOfObject6 = new Object[1];
      arrayOfObject6[0] = Long.valueOf(l1);
      z.e("!44@/B4Tb64lLpJkLzARloA5ZGSGbaAu5WtPzk/47toY9aI=", "not fount target file afterTime:%d", arrayOfObject6);
      return;
    }
    File localFile1 = new File(l.dEG + ch.CM() + ".zip");
    try
    {
      com.tencent.mm.a.l.a(localArrayList, localFile1);
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Long.valueOf(localFile1.length());
      z.d("!44@/B4Tb64lLpJkLzARloA5ZGSGbaAu5WtPzk/47toY9aI=", "out zip file size:%d", arrayOfObject4);
      boolean bool1 = am.Z(localFile1.getPath(), str1);
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = Boolean.valueOf(bool1);
      z.d("!44@/B4Tb64lLpJkLzARloA5ZGSGbaAu5WtPzk/47toY9aI=", "upload : %b", arrayOfObject5);
      return;
    }
    catch (Exception localException1)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = localException1.getMessage();
      z.e("!44@/B4Tb64lLpJkLzARloA5ZGSGbaAu5WtPzk/47toY9aI=", "zip file failed msg:%s ", arrayOfObject3);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.o
 * JD-Core Version:    0.6.2
 */