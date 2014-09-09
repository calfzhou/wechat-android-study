package com.tencent.mm.pluginsdk.ui.musicplayer;

public final class b
{
  public String content;
  private boolean hFK;
  public long timestamp;

  public final String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(this.timestamp);
    arrayOfObject[1] = this.content;
    return String.format("[%d %s]", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.b
 * JD-Core Version:    0.6.2
 */