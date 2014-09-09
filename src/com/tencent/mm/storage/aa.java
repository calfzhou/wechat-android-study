package com.tencent.mm.storage;

public final class aa
{
  private String cDa;
  private String fCW;
  private int iiA;
  private int iiB;
  private String iiC;
  private int iiy;
  private boolean iiz = false;

  public aa()
  {
    this.iiy = -1;
  }

  public aa(String paramString)
  {
    this.cDa = paramString;
    this.iiy = -1;
  }

  public final int JT()
  {
    return this.iiy;
  }

  public final String Ll()
  {
    return this.fCW;
  }

  public final int aIP()
  {
    return this.iiA;
  }

  public final int aIQ()
  {
    return this.iiB;
  }

  public final String aIR()
  {
    return this.iiC;
  }

  public final void kX(String paramString)
  {
    this.cDa = paramString;
  }

  public final void nZ(int paramInt)
  {
    if ((this.iiy != -1) && (this.iiy != paramInt) && (paramInt == 7))
      this.iiz = true;
    this.iiy = paramInt;
  }

  public final void oa(int paramInt)
  {
    this.iiA = paramInt;
  }

  public final void ob(int paramInt)
  {
    this.iiB = paramInt;
  }

  public final void qd(String paramString)
  {
    this.iiC = paramString;
  }

  public final void yX(String paramString)
  {
    this.fCW = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.aa
 * JD-Core Version:    0.6.2
 */