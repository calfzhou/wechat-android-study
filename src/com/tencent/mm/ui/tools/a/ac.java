package com.tencent.mm.ui.tools.a;

import android.net.Uri;

public final class ac
{
  private int eSi;
  private int fkq;
  private l jXl;
  private boolean jXm;
  private boolean jXn;
  private float jXo;
  private float jXp;
  private float jXq;
  private boolean jXr;
  private int resourceId;
  private Uri uri;

  ac(Uri paramUri, int paramInt)
  {
    this.uri = null;
    this.resourceId = paramInt;
  }

  private ac(ab paramab)
  {
    this.uri = paramab.uri;
    this.jXl = paramab.jXl;
    this.resourceId = paramab.resourceId;
    this.fkq = paramab.fkq;
    this.eSi = paramab.eSi;
    this.jXm = paramab.jXm;
    this.jXn = paramab.jXn;
    this.jXo = paramab.jXo;
    this.jXp = paramab.jXp;
    this.jXq = paramab.jXq;
    this.jXr = paramab.jXr;
  }

  ac(l paraml)
  {
    this.jXl = paraml;
  }

  final boolean bbA()
  {
    return (this.uri != null) || (this.resourceId != 0) || (this.jXl != null);
  }

  public final ac bbB()
  {
    if (this.jXn)
      throw new IllegalStateException("Center crop can not be used after calling centerInside");
    this.jXm = true;
    return this;
  }

  public final ab bbC()
  {
    if ((this.jXn) && (this.jXm))
      throw new IllegalStateException("Center crop and center inside can not be used together.");
    if ((this.jXm) && (this.fkq == 0))
      throw new IllegalStateException("Center crop requires calling resize.");
    if ((this.jXn) && (this.fkq == 0))
      throw new IllegalStateException("Center inside requires calling resize.");
    return new ab(this.jXl, this.uri, this.resourceId, this.fkq, this.eSi, this.jXm, this.jXn, this.jXo, this.jXp, this.jXq, this.jXr, (byte)0);
  }

  final boolean bby()
  {
    return this.fkq != 0;
  }

  public final ac bm(int paramInt1, int paramInt2)
  {
    if (paramInt1 <= 0)
      throw new IllegalArgumentException("Width must be positive number.");
    if (paramInt2 <= 0)
      throw new IllegalArgumentException("Height must be positive number.");
    this.fkq = paramInt1;
    this.eSi = paramInt2;
    return this;
  }

  public final ac h(Uri paramUri)
  {
    if (paramUri == null)
      throw new IllegalArgumentException("Image URI may not be null.");
    this.uri = paramUri;
    this.resourceId = 0;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.ac
 * JD-Core Version:    0.6.2
 */