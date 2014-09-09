package com.tencent.mm.storage;

public final class aq
{
  private final String cGZ;
  private final String eFH;
  private final boolean ebT;
  private boolean ijs;
  private final String name;
  private final String type;

  public aq()
  {
    this.type = "";
    this.name = "";
    this.cGZ = "";
    this.eFH = "";
    this.ebT = true;
  }

  public aq(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.type = paramString1;
    this.name = paramString2;
    this.cGZ = paramString3;
    this.eFH = paramString4;
    this.ebT = paramBoolean1;
    this.ijs = paramBoolean2;
  }

  public final String aJs()
  {
    if (this.eFH == null)
      return "";
    return this.eFH;
  }

  public final boolean aJt()
  {
    return this.ebT;
  }

  public final String getType()
  {
    if (this.type == null)
      return "";
    return this.type;
  }

  public final String oc()
  {
    if (this.cGZ == null)
      return "";
    return this.cGZ;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.aq
 * JD-Core Version:    0.6.2
 */