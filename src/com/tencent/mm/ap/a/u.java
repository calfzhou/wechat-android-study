package com.tencent.mm.ap.a;

public enum u
{
  private final int[] iAE;
  private final int izX;

  static
  {
    iAA = new u("KANJI", 6, new int[] { 8, 10, 12 }, 8);
    iAB = new u("FNC1_FIRST_POSITION", 7, new int[] { 0, 0, 0 }, 5);
    iAC = new u("FNC1_SECOND_POSITION", 8, new int[] { 0, 0, 0 }, 9);
    iAD = new u("HANZI", 9, new int[] { 8, 10, 12 }, 13);
    u[] arrayOfu = new u[10];
    arrayOfu[0] = iAu;
    arrayOfu[1] = iAv;
    arrayOfu[2] = iAw;
    arrayOfu[3] = iAx;
    arrayOfu[4] = iAy;
    arrayOfu[5] = iAz;
    arrayOfu[6] = iAA;
    arrayOfu[7] = iAB;
    arrayOfu[8] = iAC;
    arrayOfu[9] = iAD;
  }

  private u(int[] arg3, int arg4)
  {
    Object localObject;
    this.iAE = localObject;
    int i;
    this.izX = i;
  }

  public final int a(ag paramag)
  {
    int i = paramag.aMd();
    int j;
    if (i <= 9)
      j = 0;
    while (true)
    {
      return this.iAE[j];
      if (i <= 26)
        j = 1;
      else
        j = 2;
    }
  }

  public final int aLV()
  {
    return this.izX;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.u
 * JD-Core Version:    0.6.2
 */