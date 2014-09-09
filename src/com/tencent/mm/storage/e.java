package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.as.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bt;
import com.tencent.mm.sdk.platformtools.bx;
import com.tencent.mm.sdk.platformtools.by;
import com.tencent.mm.sdk.platformtools.z;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import junit.framework.Assert;

public final class e extends ap
  implements by
{
  public static final String[] dmc = { "CREATE TABLE IF NOT EXISTS userinfo ( id INTEGER PRIMARY KEY, type INT, value TEXT )" };
  private long dEE;
  private bt dEF;
  private h dmb;
  private BlockingQueue ihV = new LinkedBlockingQueue();

  public e(h paramh)
  {
    this.dmb = paramh;
    this.dmb = paramh;
    this.dEF = new bt(this, bg.qQ().getLooper(), 100, 20, 60000L, 1L);
  }

  private static Object c(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default:
    case 3:
    case 1:
    case 2:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      paramString = null;
      return paramString;
      try
      {
        return Integer.valueOf(paramString);
        return Long.valueOf(paramString);
        return Boolean.valueOf(paramString);
        return Float.valueOf(paramString);
        Double localDouble = Double.valueOf(paramString);
        return localDouble;
      }
      catch (Exception localException)
      {
      }
    }
  }

  public final boolean Ag()
  {
    if (this.dmb.inTransaction())
    {
      z.i("!32@/B4Tb64lLpIASzWhbQWz2fClhydYrvHO", "summer preAppend inTransaction return false");
      return false;
    }
    this.dEE = this.dmb.dc(Thread.currentThread().getId());
    if (this.dEE <= 0L)
    {
      z.i("!32@/B4Tb64lLpIASzWhbQWz2fClhydYrvHO", "summer preAppend ticket: " + this.dEE + " return false");
      return false;
    }
    return true;
  }

  public final void Ah()
  {
    if (this.dEE > 0L)
      this.dmb.dd(this.dEE);
  }

  public final void Ai()
  {
    long l = System.currentTimeMillis();
    this.dEF.en(true);
    z.i("!32@/B4Tb64lLpIASzWhbQWz2fClhydYrvHO", "summer config appendAllToDisk end takes: " + (System.currentTimeMillis() - l) + " ms");
  }

  public final void a(bx parambx)
  {
    int i = parambx.igg;
    int j = ((Integer)parambx.IO).intValue();
    Object localObject = parambx.values;
    if (i == 1)
      if ((localObject != null) && ((localObject instanceof f)))
      {
        localf = (f)localObject;
        if (localf.type != -1)
        {
          localContentValues = new ContentValues();
          localContentValues.put("id", Integer.valueOf(j));
          localContentValues.put("type", Integer.valueOf(localf.type));
          localContentValues.put("value", localf.dmm.toString());
          this.dmb.replace("userinfo", "id", localContentValues);
        }
      }
    while (i != 2)
    {
      f localf;
      ContentValues localContentValues;
      return;
    }
    this.dmb.delete("userinfo", "id=" + j, null);
  }

  public final Object get(int paramInt)
  {
    return get(paramInt, null);
  }

  public final Object get(int paramInt, Object paramObject)
  {
    boolean bool;
    Object localObject;
    if (this.dmb != null)
    {
      bool = true;
      Assert.assertTrue("db is null", bool);
      localObject = this.dEF.get(Integer.valueOf(paramInt));
      if ((localObject != null) || (this.ihV.contains(Integer.valueOf(paramInt))))
        break label181;
      f localf2 = new f();
      Cursor localCursor = this.dmb.a("userinfo", null, "id=" + paramInt, null, null, null);
      if (localCursor.getCount() > 0)
      {
        localCursor.moveToFirst();
        localf2.type = localCursor.getInt(1);
        localf2.dmm = localCursor.getString(2);
        localObject = c(localf2.type, localf2.dmm);
        this.dEF.f(Integer.valueOf(paramInt), localf2);
      }
      localCursor.close();
      if (localObject != null)
        break label216;
    }
    label181: 
    do
    {
      return paramObject;
      bool = false;
      break;
      if (!(localObject instanceof f))
        break label216;
      f localf1 = (f)localObject;
      localObject = c(localf1.type, localf1.dmm);
    }
    while (localObject == null);
    label216: return localObject;
  }

  public final void set(int paramInt, Object paramObject)
  {
    int i = 5;
    int j = 1;
    boolean bool;
    if (this.dmb != null)
    {
      int k = j;
      Assert.assertTrue("db is null", k);
      if (paramObject != null)
        break label102;
      bool = this.dEF.f(Integer.valueOf(paramInt), null);
      if ((bool) && (!this.ihV.contains(Integer.valueOf(paramInt))))
        this.ihV.add(Integer.valueOf(paramInt));
      if (bool)
        if (paramObject != null)
          break label296;
    }
    while (true)
    {
      b(i, this, Integer.valueOf(paramInt));
      label95: return;
      int m = 0;
      break;
      label102: f localf = new f();
      if ((paramObject instanceof Integer));
      while (true)
      {
        localf.type = j;
        if (localf.type == -1)
          break label95;
        localf.dmm = paramObject.toString();
        bool = this.dEF.f(Integer.valueOf(paramInt), localf);
        if ((!bool) || (!this.ihV.contains(Integer.valueOf(paramInt))))
          break;
        this.ihV.remove(Integer.valueOf(paramInt));
        break;
        if ((paramObject instanceof Long))
        {
          j = 2;
        }
        else if ((paramObject instanceof String))
        {
          j = 3;
        }
        else if ((paramObject instanceof Boolean))
        {
          j = 4;
        }
        else if ((paramObject instanceof Float))
        {
          j = i;
        }
        else if ((paramObject instanceof Double))
        {
          j = 6;
        }
        else
        {
          z.e("!32@/B4Tb64lLpIASzWhbQWz2fClhydYrvHO", "unresolve failed, unknown type=" + paramObject.getClass().toString());
          j = -1;
        }
      }
      label296: i = 4;
    }
  }

  protected final boolean vQ()
  {
    boolean bool = true;
    Object[] arrayOfObject;
    if ((this.dmb == null) || (this.dmb.aHQ()))
    {
      arrayOfObject = new Object[bool];
      if (this.dmb != null)
        break label52;
    }
    label52: for (Object localObject = "null"; ; localObject = Boolean.valueOf(this.dmb.aHQ()))
    {
      arrayOfObject[0] = localObject;
      z.w("!32@/B4Tb64lLpIASzWhbQWz2fClhydYrvHO", "shouldProcessEvent db is close :%s", arrayOfObject);
      bool = false;
      return bool;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.e
 * JD-Core Version:    0.6.2
 */