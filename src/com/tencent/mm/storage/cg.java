package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public abstract class cg
{
  private Object[] ikM = null;

  public cg(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length > 0)
    {
      this.ikM = new Object[1 + paramArrayOfObject.length];
      this.ikM[0] = Integer.valueOf(wy());
      int i = 0;
      if (i < paramArrayOfObject.length)
      {
        if ((paramArrayOfObject[i] == null) || ((paramArrayOfObject[i] instanceof String)))
          this.ikM[(i + 1)] = ch.ja((String)paramArrayOfObject[i]);
        while (true)
        {
          i++;
          break;
          this.ikM[(i + 1)] = paramArrayOfObject[i];
        }
      }
    }
  }

  public abstract a aKx();

  public final byte[] getBytes()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(wy());
    arrayOfObject[1] = Integer.valueOf(getCmdId());
    z.i("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", "Operation.getBytes type:%d id:%d ", arrayOfObject);
    if (aKx() == null)
      return null;
    try
    {
      byte[] arrayOfByte = aKx().toByteArray();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public abstract int getCmdId();

  public String toString()
  {
    if (this.ikM == null)
      return "";
    return bc.j(this.ikM);
  }

  public abstract int wy();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.cg
 * JD-Core Version:    0.6.2
 */