package com.tencent.mm.sdk.platformtools;

public final class ca
{
  public String iFD;
  public String iFE;
  public String iFF;
  public long iFG;
  public long iFH;
  public long iFI;
  public long iFJ;
  public boolean iFK;
  ca iFL;

  public final boolean equals(Object paramObject)
  {
    ca localca = (ca)paramObject;
    if (this.iFJ != localca.iFJ);
    long l1;
    long l2;
    long l3;
    do
    {
      return false;
      l1 = this.iFG - localca.iFG;
      l2 = this.iFH - localca.iFH;
      l3 = this.iFI - localca.iFI;
    }
    while ((Math.abs(l1 - l2) > 4L) || (Math.abs(l1 - l3) > 4L) || (Math.abs(l2 - l3) > 4L));
    return true;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("{DevName=").append(this.iFD).append(", MountDir=").append(this.iFE).append(", FileSystem=").append(this.iFF).append(", TotalBlocks=").append(this.iFG).append(", FreeBlocks=").append(this.iFH).append(", AvailableBlocks=").append(this.iFI).append(", BlockSize=").append(this.iFJ).append(", Shared=");
    if (this.iFL != null);
    for (boolean bool = true; ; bool = false)
      return bool + "}";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ca
 * JD-Core Version:    0.6.2
 */