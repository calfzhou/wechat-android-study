package com.tencent.mm.compatible.loader;

public final class i
{
  private String cHL;
  private int dOm;
  private String name;
  private int size;
  private String url;
  private String version;

  public final i cA(String paramString)
  {
    this.name = paramString;
    return this;
  }

  public final i cB(String paramString)
  {
    this.url = paramString;
    return this;
  }

  public final i cC(String paramString)
  {
    this.cHL = paramString;
    return this;
  }

  public final i cD(String paramString)
  {
    this.version = paramString;
    return this;
  }

  public final i ch(int paramInt)
  {
    this.size = paramInt;
    return this;
  }

  public final i cj(int paramInt)
  {
    this.dOm = paramInt;
    return this;
  }

  public final PluginDescription nD()
  {
    return new PluginDescription(this.name, this.url, this.cHL, this.version, this.size, this.dOm, (byte)0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.i
 * JD-Core Version:    0.6.2
 */