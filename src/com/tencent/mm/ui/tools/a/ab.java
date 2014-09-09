package com.tencent.mm.ui.tools.a;

import android.net.Uri;

public final class ab
{
  public final int eSi;
  public final int fkq;
  public final l jXl;
  public final boolean jXm;
  public final boolean jXn;
  public final float jXo;
  public final float jXp;
  public final float jXq;
  public final boolean jXr;
  public final int resourceId;
  public final Uri uri;

  private ab(l paraml, Uri paramUri, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean3)
  {
    this.jXl = paraml;
    this.uri = paramUri;
    this.resourceId = paramInt1;
    this.fkq = paramInt2;
    this.eSi = paramInt3;
    this.jXm = paramBoolean1;
    this.jXn = paramBoolean2;
    this.jXo = paramFloat1;
    this.jXp = paramFloat2;
    this.jXq = paramFloat3;
    this.jXr = paramBoolean3;
  }

  public final boolean bby()
  {
    return this.fkq != 0;
  }

  final boolean bbz()
  {
    return (this.fkq != 0) || (this.jXo != 0.0F);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.ab
 * JD-Core Version:    0.6.2
 */