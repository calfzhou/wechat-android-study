package com.tencent.mm.compatible.loader;

import android.os.Build;
import android.os.Build.VERSION;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.lang.reflect.Field;

public final class e extends ClassLoader
{
  private static final String dOc = "lib/" + Build.CPU_ABI;
  private static String dOd;
  private static String dOe = null;
  public ClassLoader dOa;
  private final String dOb;

  static
  {
    if (Build.VERSION.SDK_INT >= 8)
      new f().run();
    while ((dOc.contains("armeabi")) || (dOd.contains("armeabi")))
    {
      dOe = "lib/armeabi";
      return;
      dOd = "lib/armeabi";
    }
  }

  private e(ClassLoader paramClassLoader, String paramString)
  {
    super(paramClassLoader.getParent());
    this.dOb = paramString;
    this.dOa = paramClassLoader;
  }

  public static void ny()
  {
    try
    {
      Field localField6 = g.dOg.dOr.getClass().getDeclaredField("mDrawableCache");
      localField6.setAccessible(true);
      ((LongSparseArray)localField6.get(g.dOg.dOr)).clear();
      try
      {
        label39: Field localField5 = g.dOg.dOr.getClass().getDeclaredField("mColorStateListCache");
        localField5.setAccessible(true);
        localObject = localField5.get(g.dOg.dOr);
        if ((localObject instanceof SparseArray))
          ((SparseArray)localObject).clear();
      }
      catch (Exception localException3)
      {
        try
        {
          Field localField3 = g.dOg.dOr.getClass().getDeclaredField("sPreloadedDrawables");
          localField3.setAccessible(true);
          ((LongSparseArray)localField3.get(g.dOg.dOr)).clear();
          String str = "mPreloadedColorStateLists";
          if (Build.VERSION.SDK_INT >= 16)
            str = "sPreloadedColorStateLists";
          localField4 = g.dOg.dOr.getClass().getDeclaredField(str);
          localField4.setAccessible(true);
          if ((localField4.get(g.dOg.dOr) instanceof SparseArray))
            ((SparseArray)localField4.get(g.dOg.dOr)).clear();
        }
        catch (Exception localException3)
        {
          try
          {
            while (true)
            {
              Object localObject;
              Field localField4;
              if (Build.VERSION.SDK_INT >= 16)
              {
                Field localField1 = g.dOg.dOr.getClass().getDeclaredField("mColorDrawableCache");
                localField1.setAccessible(true);
                ((LongSparseArray)localField1.get(g.dOg.dOr)).clear();
                Field localField2 = g.dOg.dOr.getClass().getDeclaredField("sPreloadedColorDrawables");
                localField2.setAccessible(true);
                ((LongSparseArray)localField2.get(g.dOg.dOr)).clear();
              }
              return;
              ((LongSparseArray)localObject).clear();
              continue;
              localException2 = localException2;
              continue;
              ((LongSparseArray)localField4.get(g.dOg.dOr)).clear();
              continue;
              localException3 = localException3;
            }
          }
          catch (Exception localException4)
          {
          }
        }
      }
    }
    catch (Exception localException1)
    {
      break label39;
    }
  }

  protected final Class findClass(String paramString)
  {
    return this.dOa.loadClass(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.e
 * JD-Core Version:    0.6.2
 */