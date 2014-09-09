package com.tencent.mm.ap.a;

public final class z
{
  private u iAH;
  private o iAI;
  private ag iAJ;
  private int iAK = -1;
  private f iAL;

  public final void a(o paramo)
  {
    this.iAI = paramo;
  }

  public final void a(u paramu)
  {
    this.iAH = paramu;
  }

  public final f aMc()
  {
    return this.iAL;
  }

  public final void b(ag paramag)
  {
    this.iAJ = paramag;
  }

  public final void b(f paramf)
  {
    this.iAL = paramf;
  }

  public final void nU(int paramInt)
  {
    this.iAK = paramInt;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(200);
    localStringBuilder.append("<<\n");
    localStringBuilder.append(" mode: ");
    localStringBuilder.append(this.iAH);
    localStringBuilder.append("\n ecLevel: ");
    localStringBuilder.append(this.iAI);
    localStringBuilder.append("\n version: ");
    localStringBuilder.append(this.iAJ);
    localStringBuilder.append("\n maskPattern: ");
    localStringBuilder.append(this.iAK);
    if (this.iAL == null)
      localStringBuilder.append("\n matrix: null\n");
    while (true)
    {
      localStringBuilder.append(">>\n");
      return localStringBuilder.toString();
      localStringBuilder.append("\n matrix:\n");
      localStringBuilder.append(this.iAL.toString());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.z
 * JD-Core Version:    0.6.2
 */