package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.sk;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

@Deprecated
public final class be extends cg
{
  private sk ikk = new sk();

  public be(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, int paramInt3, String paramString5, String paramString6, String paramString7, int paramInt4, String paramString8, int paramInt5, int paramInt6, String paramString9, String paramString10, String paramString11, String paramString12, int paramInt7)
  {
    super(arrayOfObject1);
    this.ikk.hVf = new vt().wF(ch.ja(paramString1));
    this.ikk.ifj = new vt().wF(ch.ja(paramString2));
    this.ikk.hUY = new vt().wF(ch.ja(paramString3));
    this.ikk.hUZ = new vt().wF(ch.ja(paramString4));
    this.ikk.dtf = paramInt1;
    this.ikk.hUC = paramInt2;
    this.ikk.hUD = paramInt3;
    this.ikk.ilQ = new vt().wF(ch.ja(paramString5));
    this.ikk.ilR = new vt().wF(ch.ja(paramString6));
    this.ikk.ilS = new vt().wF(ch.ja(paramString4));
    this.ikk.hUI = paramInt4;
    this.ikk.ilZ = new vt().wF(ch.ja(paramString8));
    this.ikk.hUM = paramInt5;
    this.ikk.dth = paramInt6;
    this.ikk.dtg = ch.ja(paramString9);
    this.ikk.Kt = ch.ja(paramString10);
    this.ikk.Ks = ch.ja(paramString11);
    this.ikk.ifQ = ch.ja(paramString12);
    this.ikk.ifS = paramInt7;
    this.ikk.ilV = 0;
    this.ikk.hOU = new ws();
    Object[] arrayOfObject2 = new Object[4];
    arrayOfObject2[0] = this.ikk.hVf;
    arrayOfObject2[1] = Integer.valueOf(this.ikk.hUI);
    arrayOfObject2[2] = Integer.valueOf(this.ikk.hUD);
    arrayOfObject2[3] = Integer.valueOf(this.ikk.hUC);
    z.i("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", "ModContact username:%s ContactType:%d Bit:%d,%d]", arrayOfObject2);
  }

  public final a aKx()
  {
    return this.ikk;
  }

  public final int getCmdId()
  {
    return 2;
  }

  public final int wy()
  {
    return 101;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.be
 * JD-Core Version:    0.6.2
 */