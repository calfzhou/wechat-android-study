package com.tencent.mm.cache;

import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Map;

public final class b
{
  private static Map dFm = new HashMap();

  private static Object a(a parama, String paramString)
  {
    if (parama == null)
    {
      z.e("!44@/B4Tb64lLpLHfqyLRpCoWpdGl5cyXLfncLG4kHo+hsY=", "null service");
      return null;
    }
    try
    {
      Object localObject = parama.remove(paramString);
      return localObject;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpLHfqyLRpCoWpdGl5cyXLfncLG4kHo+hsY=", "cast failed, different type ?");
    }
    return null;
  }

  private static Object a(a parama, String paramString, Object paramObject)
  {
    if (parama == null)
    {
      z.e("!44@/B4Tb64lLpLHfqyLRpCoWpdGl5cyXLfncLG4kHo+hsY=", "null service");
      return null;
    }
    try
    {
      Object localObject = parama.get(paramString);
      return localObject;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpLHfqyLRpCoWpdGl5cyXLfncLG4kHo+hsY=", "cast failed, different type ?");
    }
    return null;
  }

  public static void a(String paramString, a parama)
  {
    dFm.put(paramString, parama);
  }

  public static void a(String paramString1, String paramString2, Object paramObject)
  {
    a locala = cu(paramString1);
    if (locala == null)
    {
      z.e("!44@/B4Tb64lLpLHfqyLRpCoWpdGl5cyXLfncLG4kHo+hsY=", "null service");
      return;
    }
    locala.d(paramString2, paramObject);
  }

  private static a cu(String paramString)
  {
    return (a)dFm.get(paramString);
  }

  public static Object o(String paramString1, String paramString2)
  {
    return a(cu(paramString1), paramString2, null);
  }

  public static void p(String paramString1, String paramString2)
  {
    a(cu(paramString1), paramString2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.cache.b
 * JD-Core Version:    0.6.2
 */