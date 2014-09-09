package com.tencent.mm.k;

import android.util.SparseArray;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.util.Random;

public final class f
{
  private SparseArray dQj = new SparseArray();
  private SparseArray dQk = new SparseArray();
  private e dQl = null;
  private Random dih = new Random();

  private String Cj()
  {
    long l = System.currentTimeMillis();
    int i = this.dih.nextInt(Math.abs(this.dih.nextInt(2147483647))) % 10000;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(l);
    arrayOfObject[1] = Integer.valueOf(i);
    return String.format("%d%04d", arrayOfObject);
  }

  private g a(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    g localg = new g(this);
    localg.dQh = paramInt1;
    localg.type = paramInt2;
    localg.value = paramString1;
    localg.dQm = paramString2;
    return localg;
  }

  private void a(g paramg)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramg.type);
    localStringBuffer.append("|");
    localStringBuffer.append(cG(paramg.value));
    localStringBuffer.append("|");
    localStringBuffer.append(cG(paramg.dQm));
    this.dQl.set(paramg.dQh, localStringBuffer.toString());
  }

  private void a(h paramh)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramh.dQp.size(); i++)
    {
      int j = paramh.dQp.keyAt(i);
      String str = (String)paramh.dQp.get(j);
      if (i != 0)
        localStringBuffer.append("|");
      localStringBuffer.append(j);
      localStringBuffer.append("|");
      localStringBuffer.append(cG(str));
    }
    this.dQl.set(paramh.dQo, localStringBuffer.toString());
  }

  private static String cG(String paramString)
  {
    return paramString.replaceAll("\\|", "%7C");
  }

  private g eg(int paramInt)
  {
    String str = (String)this.dQl.get(paramInt);
    if (str == null)
      return null;
    String[] arrayOfString = str.split("\\|");
    if (arrayOfString.length != 3)
    {
      z.e("!44@/B4Tb64lLpJXpLk432Vuc+9bZAc0mJrTWY/R/JSR/Pg=", "loadDataSource array.length != 3 content %s", new Object[] { str });
      return null;
    }
    try
    {
      g localg = a(paramInt, Integer.valueOf(arrayOfString[0]).intValue(), unescape(arrayOfString[1]), unescape(arrayOfString[2]));
      return localg;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpJXpLk432Vuc+9bZAc0mJrTWY/R/JSR/Pg=", "loadDataSource exception content %s", new Object[] { str });
    }
    return null;
  }

  private h eh(int paramInt)
  {
    String str = (String)this.dQl.get(paramInt);
    if (str == null)
      return ei(paramInt);
    String[] arrayOfString = str.split("\\|");
    if (arrayOfString.length % 2 != 0)
    {
      z.e("!44@/B4Tb64lLpJXpLk432Vuc+9bZAc0mJrTWY/R/JSR/Pg=", "loadWatcher array.length %% 2 != 0 content %s", new Object[] { str });
      return null;
    }
    try
    {
      h localh = ei(paramInt);
      for (int i = 0; i < arrayOfString.length; i += 2)
        localh.dQp.put(Integer.valueOf(arrayOfString[i]).intValue(), unescape(arrayOfString[(i + 1)]));
      return localh;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpJXpLk432Vuc+9bZAc0mJrTWY/R/JSR/Pg=", "loadWatcher exception content %s", new Object[] { str });
    }
    return null;
  }

  private h ei(int paramInt)
  {
    h localh = new h(this);
    localh.dQo = paramInt;
    return localh;
  }

  private h ek(int paramInt)
  {
    h localh1 = (h)this.dQk.get(paramInt);
    h localh2;
    if (localh1 == null)
    {
      localh2 = eh(paramInt);
      if (localh2 == null)
      {
        z.e("!44@/B4Tb64lLpJXpLk432Vuc+9bZAc0mJrTWY/R/JSR/Pg=", "[carl] loadWatcher watcher == null");
        localh1 = null;
      }
    }
    else
    {
      return localh1;
    }
    this.dQk.put(paramInt, localh2);
    return localh2;
  }

  private static String unescape(String paramString)
  {
    return paramString.replaceAll("%7C", "|");
  }

  public final void L(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    z.d("!44@/B4Tb64lLpJXpLk432Vuc+9bZAc0mJrTWY/R/JSR/Pg=", "[carl] doWatch, doWatch %d, watcherId %d", arrayOfObject);
    g localg = ej(paramInt1);
    if (localg == null)
    {
      z.d("!44@/B4Tb64lLpJXpLk432Vuc+9bZAc0mJrTWY/R/JSR/Pg=", "[carl] doWatch, dataSource == null");
      return;
    }
    h localh = ek(paramInt2);
    if (localh == null)
    {
      z.e("!44@/B4Tb64lLpJXpLk432Vuc+9bZAc0mJrTWY/R/JSR/Pg=", "[carl] doWatch, watcher == null, do some fix");
      localh = ei(paramInt2);
      this.dQk.put(paramInt2, localh);
    }
    localh.dQp.put(paramInt1, localg.dQm);
    a(localh);
  }

  public final void b(int paramInt1, int paramInt2, String paramString)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = paramString;
    z.d("!44@/B4Tb64lLpJXpLk432Vuc+9bZAc0mJrTWY/R/JSR/Pg=", "[carl] updateDataSourceValue, dataSourceId %d, type %d, value %s", arrayOfObject);
    g localg = ej(paramInt1);
    if (localg == null)
    {
      localg = a(paramInt1, paramInt2, "", "");
      this.dQj.put(paramInt1, localg);
      a(localg);
    }
    localg.value = paramString;
    localg.type = paramInt2;
    localg.dQm = Cj();
    a(localg);
  }

  public final void clear()
  {
    z.d("!44@/B4Tb64lLpJXpLk432Vuc+9bZAc0mJrTWY/R/JSR/Pg=", "[carl] decoder.clear()");
    this.dQj.clear();
    this.dQk.clear();
  }

  public final g ej(int paramInt)
  {
    g localg = (g)this.dQj.get(paramInt);
    if (localg == null)
    {
      localg = eg(paramInt);
      if (localg != null)
        this.dQj.put(paramInt, localg);
    }
    return localg;
  }

  public final g g(int paramInt1, int paramInt2, int paramInt3)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramInt3);
    z.d("!44@/B4Tb64lLpJXpLk432Vuc+9bZAc0mJrTWY/R/JSR/Pg=", "[carl] peek, dataSourceId %d, watcherId %d, type %d", arrayOfObject);
    g localg = ej(paramInt1);
    if (localg == null)
    {
      z.d("!44@/B4Tb64lLpJXpLk432Vuc+9bZAc0mJrTWY/R/JSR/Pg=", "[carl] peek, dataSource == null");
      return null;
    }
    if ((paramInt3 & localg.type) == 0)
    {
      z.d("!44@/B4Tb64lLpJXpLk432Vuc+9bZAc0mJrTWY/R/JSR/Pg=", "[alex] peek, dataSource.type is wrong");
      return null;
    }
    h localh = ek(paramInt2);
    if (localh != null)
    {
      String str1 = (String)localh.dQp.get(paramInt1);
      if ((str1 != null) && (str1.equals(localg.dQm)))
        return null;
      if (str1 == null)
      {
        String str2 = Cj();
        localh.dQp.put(paramInt1, str2);
        a(localh);
      }
      return localg;
    }
    z.e("!44@/B4Tb64lLpJXpLk432Vuc+9bZAc0mJrTWY/R/JSR/Pg=", "[carl] peek, watcher == null");
    return null;
  }

  public final void init()
  {
    this.dQl = bg.qW().oQ();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.k.f
 * JD-Core Version:    0.6.2
 */