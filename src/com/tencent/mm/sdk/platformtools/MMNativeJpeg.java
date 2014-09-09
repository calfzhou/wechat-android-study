package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.tencent.mm.compatible.g.o;
import com.tencent.mm.sdk.a;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

public class MMNativeJpeg
{
  public static final String TAG = "!24@juC3PIl53GtU8dbyNx00zw==";

  public static void Create()
  {
    try
    {
      o.a(a.iCW, MMNativeJpeg.class.getClassLoader());
      return;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = exception2String(localException);
      z.e("!24@juC3PIl53GtU8dbyNx00zw==", "load mmjpeg failed. exception:%s", arrayOfObject);
    }
  }

  public static void Destroy()
  {
  }

  public static boolean IsJpegFile(String paramString)
  {
    try
    {
      if (mmjpeg.queryParams(paramString) == null)
      {
        z.e("!24@juC3PIl53GtU8dbyNx00zw==", "IsJpegFile : can't query jpeg parames.");
        return false;
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = exception2String(localException);
      z.e("!24@juC3PIl53GtU8dbyNx00zw==", "IsJpegFile exception:%s", arrayOfObject);
      return false;
    }
    return true;
  }

  private static boolean checkAndroidVersion()
  {
    if (Build.VERSION.SDK_INT < 9)
    {
      z.i("!24@juC3PIl53GtU8dbyNx00zw==", "early version before android 2.3.  unsupported.");
      return false;
    }
    return true;
  }

  private static boolean checkFileExist(String paramString)
  {
    try
    {
      boolean bool = new File(paramString).exists();
      return bool;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = exception2String(localException);
      z.e("!24@juC3PIl53GtU8dbyNx00zw==", "checkfileexist. exception:%s", arrayOfObject);
    }
    return false;
  }

  public static boolean convertToProgressive(String paramString, int paramInt)
  {
    if (!checkAndroidVersion())
      return false;
    if (!checkFileExist(paramString))
    {
      z.e("!24@juC3PIl53GtU8dbyNx00zw==", "file %s not exists.");
      return false;
    }
    if ((paramInt < 24) || (paramInt > 100))
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(paramInt);
      z.e("!24@juC3PIl53GtU8dbyNx00zw==", "invalid quality:%d", arrayOfObject1);
      return false;
    }
    String str;
    try
    {
      str = paramString + ".prog.dat";
      Object[] arrayOfObject3 = new Object[3];
      arrayOfObject3[0] = paramString;
      arrayOfObject3[1] = str;
      arrayOfObject3[2] = Integer.valueOf(paramInt);
      z.d("!24@juC3PIl53GtU8dbyNx00zw==", "convert %s to %s use progressive.quality:%d", arrayOfObject3);
      int i = mmjpeg.convertToProgressive(paramString, str);
      if (i != 0)
      {
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf(i);
        z.e("!24@juC3PIl53GtU8dbyNx00zw==", "convert failed. error:%d", arrayOfObject4);
        return false;
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = exception2String(localException);
      z.e("!24@juC3PIl53GtU8dbyNx00zw==", "convertToProgressive exception:%s", arrayOfObject2);
      return false;
    }
    p.f(str, paramString, true);
    z.i("!24@juC3PIl53GtU8dbyNx00zw==", "convert successed.");
    return true;
  }

  public static Bitmap decodeAsBitmap(String paramString)
  {
    z.v("!24@juC3PIl53GtU8dbyNx00zw==", "decodeAsBitmap:%s", new Object[] { paramString });
    try
    {
      JpegParams localJpegParams = mmjpeg.queryParams(paramString);
      if (localJpegParams == null)
      {
        z.e("!24@juC3PIl53GtU8dbyNx00zw==", "can't query jpeg parames.");
        return null;
      }
      Bitmap localBitmap = Bitmap.createBitmap(localJpegParams.Width, localJpegParams.Height, Bitmap.Config.ARGB_8888);
      if (mmjpeg.decodeToBitmap(paramString, localBitmap))
      {
        z.i("!24@juC3PIl53GtU8dbyNx00zw==", "decode bitmap successed.");
        return localBitmap;
      }
      z.e("!24@juC3PIl53GtU8dbyNx00zw==", "can't decode to bmp.");
      return null;
    }
    catch (Throwable localThrowable)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = exception2String(localThrowable);
      z.e("!24@juC3PIl53GtU8dbyNx00zw==", "decodeAsBitmap exception:%s", arrayOfObject);
    }
    return null;
  }

  private static String exception2String(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return localStringWriter.toString();
  }

  public static boolean isProgressive(String paramString)
  {
    z.v("!24@juC3PIl53GtU8dbyNx00zw==", "isProgressive:%s", new Object[] { paramString });
    if (!checkAndroidVersion());
    int i;
    do
    {
      do
        return false;
      while (!checkFileExist(paramString));
      z.d("!24@juC3PIl53GtU8dbyNx00zw==", "check progressive for file:%s", new Object[] { paramString });
      try
      {
        i = mmjpeg.isProgressiveFile(paramString);
        if ((1 != i) && (i != 0))
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(i);
          z.e("!24@juC3PIl53GtU8dbyNx00zw==", "check failed. error:%d", arrayOfObject2);
          return false;
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = exception2String(localException);
        z.e("!24@juC3PIl53GtU8dbyNx00zw==", "isProgressive exception:%s", arrayOfObject1);
        return false;
      }
    }
    while (i != 1);
    return true;
  }

  public static int queryQuality(String paramString)
  {
    if (!checkAndroidVersion());
    while (!checkFileExist(paramString))
      return 0;
    try
    {
      int i = mmjpeg.queryQuality(paramString);
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(i);
      z.i("!24@juC3PIl53GtU8dbyNx00zw==", "after query quality:%d", arrayOfObject3);
      if ((i < 10000) && (i >= 24))
        return i;
      z.w("!24@juC3PIl53GtU8dbyNx00zw==", "invalid jpeg file or too small quality.");
      return 0;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = exception2String(localException);
      z.e("!24@juC3PIl53GtU8dbyNx00zw==", "queryQuality failed. exception:%s", arrayOfObject2);
      return 0;
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
    {
      z.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
      throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError));
    }
    catch (Error localError)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localError.toString();
      z.e("!24@juC3PIl53GtU8dbyNx00zw==", "queryQuality error. java.lang.UnsatisfiedLinkError: queryQuality, %s", arrayOfObject1);
    }
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.MMNativeJpeg
 * JD-Core Version:    0.6.2
 */