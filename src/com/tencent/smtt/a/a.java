package com.tencent.smtt.a;

import java.lang.reflect.Method;

public final class a
{
  public static Object a(Class paramClass, String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      Method localMethod = paramClass.getMethod(paramString, paramArrayOfClass);
      localMethod.setAccessible(true);
      Object localObject = localMethod.invoke(null, paramArrayOfObject);
      return localObject;
    }
    catch (Throwable localThrowable)
    {
    }
    return null;
  }

  public static Object a(Object paramObject, String paramString)
  {
    return a(paramObject, paramString, null, new Object[0]);
  }

  public static Object a(Object paramObject, String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    if (paramObject == null)
      return null;
    try
    {
      Method localMethod = paramObject.getClass().getMethod(paramString, paramArrayOfClass);
      localMethod.setAccessible(true);
      if (paramArrayOfObject.length == 0)
        paramArrayOfObject = null;
      Object localObject = localMethod.invoke(paramObject, paramArrayOfObject);
      return localObject;
    }
    catch (Throwable localThrowable)
    {
    }
    return null;
  }

  public static Method a(Object paramObject, String paramString, Class[] paramArrayOfClass)
  {
    Class localClass = paramObject.getClass();
    while (localClass != Object.class)
    {
      if (localClass == null)
        return null;
      try
      {
        Method localMethod = localClass.getDeclaredMethod(paramString, paramArrayOfClass);
        return localMethod;
      }
      catch (Exception localException)
      {
        localClass = localClass.getSuperclass();
      }
    }
    return null;
  }

  public static Object bP(String paramString1, String paramString2)
  {
    try
    {
      Object localObject = Class.forName(paramString1).getMethod(paramString2, new Class[0]).invoke(null, new Object[0]);
      return localObject;
    }
    catch (Throwable localThrowable)
    {
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.a.a
 * JD-Core Version:    0.6.2
 */