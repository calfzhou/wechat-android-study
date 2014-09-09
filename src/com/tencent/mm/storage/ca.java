package com.tencent.mm.storage;

import com.tencent.mm.a.c;
import com.tencent.mm.ao.a;
import com.tencent.mm.ao.b;
import com.tencent.mm.protocal.a.sy;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class ca extends cg
{
  private sy ikG = new sy();

  public ca(int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3, String paramString4, String paramString5, int paramInt3, int paramInt4, int paramInt5, String paramString6, String paramString7, String paramString8, int paramInt6, String paramString9, int paramInt7, String paramString10, int paramInt8)
  {
    super(arrayOfObject);
    this.ikG.imK = paramInt1;
    this.ikG.hVf = new vt().wF(ch.ja(paramString1));
    this.ikG.ifj = new vt().wF(ch.ja(paramString2));
    this.ikG.imL = paramInt2;
    this.ikG.imM = new vt().wF(ch.ja(paramString3));
    this.ikG.imN = new vt().wF(ch.ja(paramString4));
    this.ikG.dZy = paramInt3;
    byte[] arrayOfByte1 = c.a(ch.ja(paramString5), 0, -1);
    sy localsy1 = this.ikG;
    byte[] arrayOfByte2;
    sy localsy2;
    if (arrayOfByte1 == null)
    {
      arrayOfByte2 = new byte[0];
      localsy1.imI = new b(arrayOfByte2);
      localsy2 = this.ikG;
      if (arrayOfByte1 != null)
        break label435;
    }
    label435: for (int i = 0; ; i = arrayOfByte1.length)
    {
      localsy2.imH = i;
      this.ikG.dtf = paramInt4;
      this.ikG.dth = paramInt5;
      this.ikG.dtg = ch.ja(paramString6);
      this.ikG.Kt = ch.ja(paramString7);
      this.ikG.Ks = ch.ja(paramString8);
      this.ikG.imO = paramInt6;
      this.ikG.ifQ = ch.ja(paramString9);
      this.ikG.imT = paramInt7;
      this.ikG.dti = ch.ja(paramString10);
      this.ikG.ifS = paramInt8;
      this.ikG.ifR = "";
      return;
      arrayOfByte2 = arrayOfByte1;
      break;
    }
  }

  public final a aKx()
  {
    return this.ikG;
  }

  public final int getCmdId()
  {
    return 1;
  }

  public final int wy()
  {
    return 104;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ca
 * JD-Core Version:    0.6.2
 */