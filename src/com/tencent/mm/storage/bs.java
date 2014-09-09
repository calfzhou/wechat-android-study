package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.sf;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class bs extends cg
{
  private sf iky = new sf();

  public bs(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, String paramString5, String paramString6, String paramString7, int paramInt2)
  {
    super(arrayOfObject);
    this.iky.hVf = new vt().wF(ch.ja(paramString1));
    this.iky.ifj = new vt().wF(ch.ja(paramString2));
    this.iky.hUY = new vt().wF(ch.ja(paramString3));
    this.iky.dtf = paramInt1;
    this.iky.ilQ = new vt().wF(ch.ja(paramString5));
    this.iky.ilR = new vt().wF(ch.ja(paramString6));
    this.iky.ilS = new vt().wF(ch.ja(paramString7));
    this.iky.hUI = paramInt2;
  }

  public final a aKx()
  {
    return this.iky;
  }

  public final int getCmdId()
  {
    return 15;
  }

  public final int wy()
  {
    return 112;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bs
 * JD-Core Version:    0.6.2
 */