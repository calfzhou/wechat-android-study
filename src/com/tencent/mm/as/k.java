package com.tencent.mm.as;

import android.content.ContentValues;
import android.os.Looper;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class k
{
  private ay dHm = new ay(Looper.getMainLooper(), new l(this), false);
  private String ihe = null;
  private h ilk;
  private BlockingQueue ils = new LinkedBlockingQueue();

  public k(h paramh, String paramString)
  {
    this.ilk = paramh;
    this.ihe = paramString;
  }

  private int a(m paramm)
  {
    this.ils.add(paramm);
    if (this.ils.size() >= 40)
      aKV();
    if (this.dHm.aNx())
      this.dHm.cP(60000L);
    return 0;
  }

  public final int Ah(String paramString)
  {
    m localm = new m();
    localm.igg = 1;
    localm.dlP = paramString;
    return a(localm);
  }

  public final int a(ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    m localm = new m();
    localm.igg = 3;
    localm.ilu = paramString;
    localm.values = new ContentValues(paramContentValues);
    localm.A(paramArrayOfString);
    return a(localm);
  }

  public final int a(String paramString, ContentValues paramContentValues)
  {
    m localm = new m();
    localm.igg = 2;
    localm.ihb = paramString;
    localm.values = new ContentValues(paramContentValues);
    return a(localm);
  }

  public final int aKV()
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = this.ihe;
    arrayOfObject1[1] = Boolean.valueOf(this.ilk.inTransaction());
    arrayOfObject1[2] = Integer.valueOf(this.ils.size());
    z.d("!44@/B4Tb64lLpIsV0xS6l3RDQe7+aIDH8o/wMsoknCI4oc=", "appendAllToDisk table:%s trans:%b queue:%d", arrayOfObject1);
    if (this.ils.isEmpty())
      return 0;
    long l;
    if (!this.ilk.inTransaction())
      l = this.ilk.dc(Thread.currentThread().getId());
    while (true)
      if (!this.ils.isEmpty())
      {
        m localm = (m)this.ils.poll();
        if (localm == null)
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = this.ihe;
          z.w("!44@/B4Tb64lLpIsV0xS6l3RDQe7+aIDH8o/wMsoknCI4oc=", "appendToDisk Holder == null. table:%s", arrayOfObject3);
        }
        else if ((this.ilk == null) || (!this.ilk.isOpen()))
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = this.ihe;
          z.e("!44@/B4Tb64lLpIsV0xS6l3RDQe7+aIDH8o/wMsoknCI4oc=", "appendToDisk diskDB already close. table:%s", arrayOfObject2);
        }
        else if (localm.igg == 2)
        {
          this.ilk.insert(this.ihe, localm.ihb, localm.values);
        }
        else if (localm.igg == 5)
        {
          this.ilk.delete(this.ihe, localm.ilu, localm.ilv);
        }
        else if (localm.igg == 1)
        {
          this.ilk.bp(this.ihe, localm.dlP);
        }
        else if (localm.igg == 4)
        {
          this.ilk.replace(this.ihe, localm.ihb, localm.values);
        }
        else if (localm.igg == 3)
        {
          this.ilk.update(this.ihe, localm.values, localm.ilu, localm.ilv);
        }
      }
      else
      {
        if (l <= 0L)
          break;
        this.ilk.dd(l);
        return 0;
        l = 0L;
      }
  }

  public final int b(String paramString, ContentValues paramContentValues)
  {
    m localm = new m();
    localm.igg = 4;
    localm.ihb = paramString;
    localm.values = new ContentValues(paramContentValues);
    return a(localm);
  }

  public final int c(String paramString, String[] paramArrayOfString)
  {
    m localm = new m();
    localm.igg = 5;
    localm.ilu = paramString;
    localm.A(paramArrayOfString);
    return a(localm);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.as.k
 * JD-Core Version:    0.6.2
 */