package com.tencent.mm.pluginsdk.model.app;

final class v
{
  public String appId;
  public int dSC;

  public v(String paramString, int paramInt)
  {
    this.appId = paramString;
    this.dSC = paramInt;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == null);
    v localv;
    do
    {
      do
        return false;
      while (!(paramObject instanceof v));
      localv = (v)paramObject;
    }
    while ((!localv.appId.equals(this.appId)) || (localv.dSC != this.dSC));
    return true;
  }

  public final String toString()
  {
    return this.appId + this.dSC;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.v
 * JD-Core Version:    0.6.2
 */