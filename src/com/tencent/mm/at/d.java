package com.tencent.mm.at;

import android.os.Debug;
import android.os.Message;
import com.tencent.mm.a.c;
import com.tencent.mm.a.l;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.model.x;
import com.tencent.mm.platformtools.am;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public final class d
  implements EventListener
{
  public static final String iHA = m.getExternalStorageDirectory() + "/tencent/MicroMsg/tracedog/";
  public static d iHx;
  private static int iHy = 5242880;
  static cm jzh = new f();
  private volatile boolean dDc;
  private LinkedBlockingQueue iHB;
  ExecutorService iHC;
  private WeakReference iHD;
  private volatile boolean iHz;

  private void Bo(String paramString)
  {
    if (paramString == null)
      return;
    this.dDc = true;
    if (ch.jb(paramString))
      z.e("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE error uploadPath %s ", new Object[] { paramString });
    while (true)
    {
      this.dDc = false;
      return;
      if (!m.nI())
      {
        z.e("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE sdcard invalid.");
      }
      else
      {
        File localFile = new File(paramString);
        if (!localFile.exists())
        {
          z.e("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE upload file is not exist");
        }
        else
        {
          if (localFile.isDirectory())
            paramString = a(localFile, true);
          if ((paramString != null) && (new File(paramString).length() >= 131072L))
          {
            boolean bool = am.c(paramString, x.pG(), true, false);
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = Boolean.valueOf(bool);
            z.i("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE upload : %b", arrayOfObject);
            if (bool)
              c.a(new File(iHA));
          }
        }
      }
    }
  }

  private static String a(File paramFile, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramFile.isDirectory())
    {
      z.i("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE currentPath is dir");
      File[] arrayOfFile = paramFile.listFiles();
      if (arrayOfFile == null)
      {
        z.e("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", " get file list failed");
        return null;
      }
      for (int j = 0; j < arrayOfFile.length; j++)
        localArrayList.add(arrayOfFile[j]);
    }
    localArrayList.add(paramFile);
    File localFile = new File(iHA + ch.CM() + ".zip");
    try
    {
      l.a(localArrayList, localFile);
      for (int i = 0; i < localArrayList.size(); i++)
        ((File)localArrayList.get(i)).delete();
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localException.getMessage();
      z.e("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "zip file failed msg:%s ", arrayOfObject1);
      return null;
    }
    if (localFile.length() > 3145728L)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(localFile.length());
      z.e("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "trace file is too large:%d ", arrayOfObject2);
      return null;
    }
    return localFile.getAbsolutePath();
  }

  private void a(h paramh)
  {
    if (this.iHz);
    do
    {
      return;
      if (!m.nI())
      {
        z.i("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE sdcard is invalid");
        return;
      }
      aOa();
      try
      {
        File localFile = new File(iHA);
        if ((paramh.cOR != 6) && (localFile.exists()))
        {
          z.i("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE delete all file ");
          l(localFile);
        }
        localFile.mkdirs();
        String str = paramh.iHI;
        if (paramh.iHG <= 0);
        int i;
        for (int j = iHy; ; j = 1024 * (i * 1024))
        {
          Debug.startMethodTracing(str, j);
          this.iHz = true;
          if (paramh.cOR != 6)
            break;
          z.i("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE startTrace uploadType is CLIENT ");
          return;
          i = paramh.iHG;
        }
      }
      catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
      {
        z.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
        throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError));
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          this.iHz = false;
          z.printErrStackTrace("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", localThrowable, "TRACE startMethodTracing ERROR", new Object[0]);
        }
      }
    }
    while (!this.iHz);
    Message localMessage = Message.obtain();
    localMessage.what = 0;
    localMessage.obj = paramh;
    if ((ch.jb(paramh.className)) || (paramh.cOR == 5))
    {
      jzh.sendMessageDelayed(localMessage, 15000L);
      return;
    }
    jzh.sendMessageDelayed(localMessage, 10000L);
  }

  public static d aNZ()
  {
    if (iHx == null)
      iHx = new d();
    return iHx;
  }

  private static void aOa()
  {
    jzh.removeMessages(0);
    jzh.removeMessages(2);
    jzh.removeMessages(1);
  }

  private static void l(File paramFile)
  {
    if (paramFile.isFile())
      paramFile.delete();
    while (!paramFile.isDirectory())
      return;
    File[] arrayOfFile = paramFile.listFiles();
    if ((arrayOfFile == null) || (arrayOfFile.length == 0))
    {
      paramFile.delete();
      return;
    }
    int i = arrayOfFile.length;
    for (int j = 0; j < i; j++)
      l(arrayOfFile[j]);
    paramFile.delete();
  }

  public final void B(int paramInt, String paramString)
  {
    if ((paramInt == 1) || ((paramInt == 3) && (bc.bP(ak.getContext()))))
      Bo(paramString);
  }

  public final void a(i parami)
  {
    this.iHD = new WeakReference(parami);
  }

  public final void ap(String paramString, int paramInt)
  {
    h localh;
    if ((this.iHB != null) && (this.iHB.size() > 0))
    {
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Boolean.valueOf(this.dDc);
      arrayOfObject[1] = Boolean.valueOf(this.iHz);
      arrayOfObject[2] = paramString;
      arrayOfObject[3] = Integer.valueOf(paramInt);
      z.i("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE gatherData : isUploading : %b  hasStart :%b currentClass : %s currentCode %d ", arrayOfObject);
      if ((!this.dDc) && (!this.iHz))
      {
        Iterator localIterator = this.iHB.iterator();
        while (localIterator.hasNext())
        {
          localh = (h)localIterator.next();
          if (localh.className == null)
            break label153;
          if ((localh.className.equals(paramString)) && (localh.cOR == paramInt))
          {
            a(localh);
            this.iHB.remove(localh);
          }
        }
      }
    }
    return;
    label153: a(null);
    this.iHB.remove(localh);
  }

  public final boolean b(h paramh)
  {
    aOa();
    if ((!this.iHz) || (this.dDc))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Boolean.valueOf(this.iHz);
      arrayOfObject[1] = Boolean.valueOf(this.dDc);
      z.i("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE stopTrace hasStartTrace : %b ,isUploading :%b  ", arrayOfObject);
      return false;
    }
    if (!m.nI())
    {
      z.i("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE stopTrace sdcard invalid");
      return false;
    }
    this.iHC.execute(new e(this, paramh));
    return true;
  }

  public final void c(h paramh)
  {
    if (paramh.cOR <= 0)
      return;
    if (this.iHC == null)
      this.iHC = Executors.newSingleThreadExecutor();
    if ((this.dDc) || (this.iHz))
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Boolean.valueOf(this.dDc);
      arrayOfObject1[1] = Boolean.valueOf(this.iHz);
      z.i("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE isUloading or hasStartTrace %b %b", arrayOfObject1);
      return;
    }
    jzh.removeMessages(0);
    if ((paramh.iHH == 4) || (paramh.iHH == 5))
    {
      int i = paramh.iHH;
      this.iHC.execute(new g(this, i));
    }
    while (true)
    {
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = paramh.className;
      arrayOfObject2[1] = Integer.valueOf(paramh.cOR);
      arrayOfObject2[2] = Integer.valueOf(paramh.iHH);
      z.i("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE PUSH : class : %s  code :%s type :%s", arrayOfObject2);
      return;
      if ((paramh.cOR == 6) || (paramh.cOR == 5))
      {
        Message localMessage = Message.obtain();
        localMessage.what = 2;
        localMessage.obj = paramh;
        if (paramh.cOR == 5)
          jzh.sendMessage(localMessage);
        else
          jzh.sendMessageDelayed(localMessage, 500L);
      }
      else
      {
        if (this.iHB == null)
          this.iHB = new LinkedBlockingQueue();
        this.iHB.clear();
        this.iHB.add(paramh);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.d
 * JD-Core Version:    0.6.2
 */