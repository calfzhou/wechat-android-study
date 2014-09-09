package com.tencent.mm.storage;

import com.tencent.mm.a.c;
import com.tencent.mm.ao.a;
import com.tencent.mm.ao.b;
import com.tencent.mm.protocal.a.sx;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class bz extends cg
{
  private sx ikF;

  public bz(int paramInt, String paramString1, String paramString2)
  {
    super(arrayOfObject);
    byte[] arrayOfByte1 = c.a(ch.ja(paramString1), 0, -1);
    this.ikF = new sx();
    this.ikF.imG = paramInt;
    sx localsx1 = this.ikF;
    int i;
    sx localsx2;
    if (arrayOfByte1 == null)
    {
      i = 0;
      localsx1.imH = i;
      localsx2 = this.ikF;
      if (arrayOfByte1 != null)
        break label131;
    }
    label131: for (byte[] arrayOfByte2 = new byte[0]; ; arrayOfByte2 = arrayOfByte1)
    {
      localsx2.imI = new b(arrayOfByte2);
      this.ikF.imJ = ch.ja(paramString2);
      return;
      i = arrayOfByte1.length;
      break;
    }
  }

  public final a aKx()
  {
    return this.ikF;
  }

  public final int getCmdId()
  {
    return 35;
  }

  public final int wy()
  {
    return 121;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bz
 * JD-Core Version:    0.6.2
 */