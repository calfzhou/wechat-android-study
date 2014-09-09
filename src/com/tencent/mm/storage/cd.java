package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.protocal.a.vi;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;

@Deprecated
public final class cd extends cg
{
  private vi ikJ = new vi();

  public cd(String paramString1, String paramString2)
  {
    super(new Object[] { paramString1, paramString2 });
    this.ikJ.hVf = new vt().wF(ch.ja(paramString1));
    this.ikJ.hOC = new vt().wF(ch.ja(paramString2));
  }

  public final a aKx()
  {
    return this.ikJ;
  }

  public final int getCmdId()
  {
    return 16;
  }

  public final int wy()
  {
    return 113;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.cd
 * JD-Core Version:    0.6.2
 */