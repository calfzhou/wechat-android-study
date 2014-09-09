package com.tencent.smtt.export.external;

import android.content.Context;
import dalvik.system.DexClassLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DexLoader
{
  private DexClassLoader mClassLoader;

  public DexLoader(Context paramContext, String paramString1, String paramString2)
  {
    this(paramContext, new String[] { paramString1 }, paramString2);
  }

  public DexLoader(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    Object localObject = paramContext.getClassLoader();
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      DexClassLoader localDexClassLoader = new DexClassLoader(paramArrayOfString[i], paramString, null, (ClassLoader)localObject);
      this.mClassLoader = localDexClassLoader;
      i++;
      localObject = localDexClassLoader;
    }
  }

  public Object getStaticField(String paramString1, String paramString2)
  {
    try
    {
      Field localField = this.mClassLoader.loadClass(paramString1).getField(paramString2);
      localField.setAccessible(true);
      Object localObject = localField.get(null);
      return localObject;
    }
    catch (Exception localException)
    {
      getClass().getSimpleName();
      new StringBuilder("'").append(paramString1).append("' get field '").append(paramString2).append("' failed");
    }
    return null;
  }

  public Object invokeMethod(Object paramObject, String paramString1, String paramString2, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      Method localMethod = this.mClassLoader.loadClass(paramString1).getMethod(paramString2, paramArrayOfClass);
      localMethod.setAccessible(true);
      Object localObject = localMethod.invoke(paramObject, paramArrayOfObject);
      return localObject;
    }
    catch (Exception localException)
    {
      getClass().getSimpleName();
      new StringBuilder("'").append(paramString1).append("' invoke method '").append(paramString2).append("' failed");
    }
    return null;
  }

  public Object invokeStaticMethod(String paramString1, String paramString2, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      Method localMethod = this.mClassLoader.loadClass(paramString1).getMethod(paramString2, paramArrayOfClass);
      localMethod.setAccessible(true);
      Object localObject = localMethod.invoke(null, paramArrayOfObject);
      return localObject;
    }
    catch (Exception localException)
    {
      getClass().getSimpleName();
      new StringBuilder("'").append(paramString1).append("' invoke static method '").append(paramString2).append("' failed");
    }
    return null;
  }

  public Class loadClass(String paramString)
  {
    try
    {
      Class localClass = this.mClassLoader.loadClass(paramString);
      return localClass;
    }
    catch (Exception localException)
    {
      getClass().getSimpleName();
      new StringBuilder("loadClass '").append(paramString).append("' failed");
    }
    return null;
  }

  public Object newInstance(String paramString)
  {
    try
    {
      Object localObject = this.mClassLoader.loadClass(paramString).newInstance();
      return localObject;
    }
    catch (Exception localException)
    {
      getClass().getSimpleName();
      new StringBuilder("create ").append(paramString).append(" instance failed");
    }
    return null;
  }

  public Object newInstance(String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      Object localObject = this.mClassLoader.loadClass(paramString).getConstructor(paramArrayOfClass).newInstance(paramArrayOfObject);
      return localObject;
    }
    catch (Exception localException)
    {
      getClass().getSimpleName();
      new StringBuilder("create '").append(paramString).append("' instance failed");
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.DexLoader
 * JD-Core Version:    0.6.2
 */